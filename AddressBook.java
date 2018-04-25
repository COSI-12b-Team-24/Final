import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Set;
import java.util.Map;

public class AddressBook extends JPanel{
  public static void main(String[] args){
  JFrame frame = new JFrame("Final Project");
  JPanel content = new JPanel();
  content.setLayout(new BorderLayout());
  JTextField name = new JTextField("Tim");
  JTextField email = new JTextField("timhickey@brandeis.edu");
  JTextField phone  = new JTextField("781-736-2706");
  JTextField searchF = new JTextField(" ",50);

  JLabel nam = new JLabel("Name: ");
  JLabel mail = new JLabel("Email: ");
  JLabel num = new JLabel("Phone: ");

  JButton add = new JButton("Add");
  JButton search = new JButton("Search");

  JTextArea log = new JTextArea(" ");

  JPanel left = new JPanel();
  left.setLayout(new GridLayout(0,2));
  left.add(nam); left.add(name);
  left.add(mail); left.add(email);
  left.add(num); left.add(phone);
  left.add(search); left.add(add);
  content.add(left,BorderLayout.LINE_START);

  JPanel right = new JPanel();
  right.setLayout(new BorderLayout());
  right.add(log);
  content.add(right,BorderLayout.CENTER);

  JPanel bottom = new JPanel();
  bottom.setLayout(new BorderLayout());
  bottom.add(searchF);
  content.add(bottom, BorderLayout.PAGE_END);



  frame.setContentPane(content);
  frame.setSize(500,500);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setVisible(true);
  }
}
