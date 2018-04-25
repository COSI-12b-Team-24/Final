import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;


public class ActionListenerManager
{
  //  Add these lines to the end of the Main() routine in AddressBookData
  //  ActionListenerManager.AddActionToSearchButton(search, searchF, log);
  //  ActionListenerManager.AddActionToAddButton(add,name,email,phone,log);


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
              text+= "\n Name: "+nameToSearchFor+" not found in address book\n";
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
