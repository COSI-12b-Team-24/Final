import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;


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
              text+= "\n Name: "+nameToSearchFor+" not found in address book";
              textArea.setText(text);
            }
            else
            {
              //TODO
            }

          }
        }
      );
    }

    public static void AddActionToAddButton(JButton addButton, JTextField nameField ,JTextField emailField, JTextField phoneField)
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

              //write stuff to the log
              //
            }
          }
        );

      }
}
