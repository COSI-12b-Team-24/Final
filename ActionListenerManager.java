import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;

import java.util.Map;
import java.util.Set;


/**
* Methods for adding actionListeners with related actions to buttons
**/
public class ActionListenerManager
{

  public static void AddActionToSearchButton(JButton searchButton, JTextField searchField, JTextArea textArea)
  {
      searchButton.addActionListener
      (
        new ActionListener()
        {
          public void actionPerformed(ActionEvent event)
          {
            String nameToSearchFor = searchField.getText();
            Entry result = FinalProject.searchForEntry(nameToSearchFor);

            if (result == null)
            {
              String text = textArea.getText();
              text+= "\nName: "+nameToSearchFor+" not found in address book";
              text+= "\nNames in AddressBook:";

              Set<String> keys = FinalProject.getKeySet();
          		for(String name: keys)
             	{
      	         text += "\n"+name;
             	}
              text += "\n";
              textArea.setText(text);
            }
            else
            {
              String text = textArea.getText();
              text+= "\nName: "+result.getName()+"\nEmail: "+result.getEmail()+"\nPhone: "+result.getPhone()+"\n";
              textArea.setText(text);
            }

          }
        }
      );
    }

    public static void AddActionToAddButton(JButton addButton, JTextField nameField ,JTextField emailField, JTextField phoneField, JTextArea textArea)
    {
        addButton.addActionListener
        (
          new ActionListener()
          {
            public void actionPerformed(ActionEvent event)
            {
              String name = nameField.getText();
              String email = emailField.getText();
              String phone = phoneField.getText();

              Entry e = new Entry(name, email, phone);
              FinalProject.addEntry(e);

              String text = textArea.getText();
              text+= "\nAdded "+name+" to the address Book\n";
              textArea.setText(text);
            }
          }
        );

      }
}
