import javax.swing.*;

import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;

import java.util.Set;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
* Final Project for COSI 12b Spring 2018
* We are going to make a Address Book.
* You can enter a name, their email address, their phone number and it will be saved.
* You can search for a name, and it will show you their email address and phone number.
**/
public class FinalProject
{
	private static Map<String, Entry> addressBook;
	private static char DC = '*'; //delimiter character

	public static void main(String[] args)
	{
		//creates GUI
		AddressBook.main(args);

		try
		{
			addressBook = readFromFile("AddressBookData.txt");
		}
		catch (Exception e)
		{
			addressBook = new HashMap<String,Entry>();
			writeToFile("AddressBookData.txt");
		}
	}

	public static void addEntry (Entry e)
	{
		addressBook.put(e.getName(), e);
		writeToFile("AddressBookData.txt");
	}

	public static void addEntry (String name, String email, String phoneNumber)
	{
		Entry e = new Entry(name, email, phoneNumber);
		addEntry(e);
	}



	public static Entry searchForEntry (String name)
	{
		System.out.println("searching for:"+name);
		// PrintAddressBook();

		return addressBook.get(name);
	}

	public static Map<String,Entry> readFromFile(String fileName)
	{
		Map<String,Entry> readMap = new TreeMap<String,Entry>();

		try
		{
			File file = new File(fileName);
			Scanner scanner = new Scanner(file);
			while (scanner.hasNext())
	    {
				String line = scanner.nextLine();
				int delimiter = line.indexOf(DC);
				String name = line.substring(0,delimiter);

				int delimiter2 = line.indexOf(DC,delimiter+1);
				String email = line.substring(delimiter+1,delimiter2);

				String phoneNumber = line.substring(delimiter2+1);

				readMap.put(name,new Entry(name,email,phoneNumber));
     	}
	    scanner.close();
		}
  	catch (FileNotFoundException e)
  	{
  			System.out.println(e+" Filename: "+fileName);
  	}

		return readMap;
	}


	public static void writeToFile(String fileName)
	{
		try
		{
	        PrintWriter writer = new PrintWriter(fileName, "UTF-8");
					Set<String> keys = addressBook.keySet();

	        for(String name: keys)
	        {
	        	Entry entry = addressBook.get(name);
	        	writer.println(name+DC+entry.getEmail()+DC+entry.getPhone());
	        }

	        writer.close();
	  }
	  catch (FileNotFoundException e)
	  {
			System.out.println(e+" Filename: "+fileName);
	  }
	  catch (Exception e)
	  {
			System.out.println(e);
	  }

	}

	public static Set<String> getKeySet()
	{
		return addressBook.keySet();
	}

	public static void PrintAddressBook()
	{
		Set<String> keys = addressBook.keySet();
		for(String name: keys)
       	{
	        	Entry entry = addressBook.get(name);
	        	System.out.println(name+DC+entry.getEmail()+DC+entry.getPhone());
       	}

	    System.out.println("***");
	}

}
