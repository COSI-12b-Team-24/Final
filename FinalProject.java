import javax.swing.*;

import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
* Final Project for COSI 12b Spring 2018
* We are going to make a Address Book.
* You can enter a name, their email address, their phone number and it will be saved.
* You can search for a name, and it will show you their email address and phone number.
**/
public class FinalProject
{
	Map<String, Entry> addressBook;
	
	//static references to certain GUI things
	
	public static void main(String[] args)
	{
		//fill this out
		CreateGUI();
	}
	
	public static void CreateGUI()
	{
		//fill this out
	}
	
	public static Map<String,Entry> readFromFile(String fileName)
	{
		Map<String,Entry> readMap = new HashMap<String,Entry>();
      	
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
	
}
