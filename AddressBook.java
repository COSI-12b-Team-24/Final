import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Set;
import java.util.Map;
import java.awt.Scrollbar;

public class AddressBook extends JPanel{
  public static void main(String[] args){
  JFrame frame = new JFrame("Final Project");
  JPanel content = new JPanel();
  content.setLayout(new BorderLayout());
  Border border = BorderFactory.createEtchedBorder();
  JTextField name1 = new JTextField("Tim");
  JTextField name2 = new JTextField("Tim");
  JTextField email = new JTextField("timhickey@brandeis.edu");
  JTextField phone  = new JTextField("781-736-2706");
  JTextField searchF = new JTextField(" ",50);
  searchF.setEditable(false);

  JLabel ab = new JLabel("<html><h1>Address Book</h1></html>");
  ab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
  content.add(ab,BorderLayout.PAGE_START);
  JLabel nam1 = new JLabel("Name: ");
  JLabel nam2 = new JLabel("Name: ");
  JLabel mail = new JLabel("Email: ");
  JLabel num = new JLabel("Phone: ");


  JButton add = new JButton("Add");
  add.setToolTipText("Click this button to add a new item in the AddressBook Log.");
  JButton search = new JButton("Search");
  search.setToolTipText("Click this button to to search the AddressBook.");

  JTextArea log = new JTextArea(" ");
  log.setEditable(false);

  JPanel left = new JPanel();
  left.setLayout(new GridLayout(0,1));
  left.add(nam1); left.add(name1);
  left.add(mail); left.add(email);
  left.add(num); left.add(phone);
  left.add(add); 
  Border addBorder = BorderFactory.createTitledBorder(border, "Add");
  left.setBorder(addBorder);
    
  JPanel searchPanel = new JPanel();
  searchPanel.setLayout(new GridLayout(0,1,10,50));
  searchPanel.add(nam2); searchPanel.add(name2);
  searchPanel.add(search); 
  Border srchBorder = BorderFactory.createTitledBorder(border, "Search");
  searchPanel.setBorder(srchBorder);

  JScrollPane scroll = new JScrollPane(log);
  Border infoBorder = BorderFactory.createTitledBorder(border, "Info");
  scroll.setBorder(infoBorder);
  content.add(scroll,BorderLayout.CENTER);
    
  JTabbedPane tabbedPane = new JTabbedPane ();
  tabbedPane.addTab ("Add", left);
  tabbedPane.addTab("Search", searchPanel);
  content.add(tabbedPane,BorderLayout.LINE_START);

  JPanel bottom = new JPanel();
  bottom.setLayout(new BorderLayout());
  bottom.add(searchF);
  content.add(bottom, BorderLayout.PAGE_END);



  frame.setContentPane(content);
  frame.setSize(600,350);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setVisible(true);
  }
}
