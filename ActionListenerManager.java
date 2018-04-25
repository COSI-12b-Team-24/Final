import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;


public class ActionListenerManager
{
  public static void AddActionToSearchButton(JButton searchButton, JTextField nameField ,JTextField emailField, JTextField phoneField, JTextArea textArea)
  {
      searchButton.addActionListener
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

            }
          }
        );

      }
}
