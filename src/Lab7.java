import javax.*;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Lab7 extends JFrame {
public static void main(String[] args) {
new Lab7();
}

DefaultListModel<String> model = new DefaultListModel<String>();
JList<String> list = new JList<String>(model);
JScrollPane scrollPane = new JScrollPane(list);

public Lab7() {
setTitle("Lab 7 Solution - Russell Boyd");
setLayout(new BorderLayout());
JPanel buttonPanel = new JPanel();
buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
JButton btnAddCourse = new JButton("Add Course");
JButton btnClose = new JButton("Close");

buttonPanel.add(btnAddCourse);
buttonPanel.add(btnClose);

btnAddCourse.addActionListener(new btnAddListener());
btnClose.addActionListener(new btnCloseListener());

list = new JList<String>();
add(BorderLayout.CENTER, scrollPane);
add(BorderLayout.SOUTH, buttonPanel);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(500, 500);
setVisible(true);
}

class btnAddListener implements ActionListener {
public void actionPerformed(ActionEvent e) {
String str = popUpBox();
if (str.length() != 0) {
model.addElement(str);
}
}
}

class btnCloseListener implements ActionListener {

public void actionPerformed(ActionEvent e) {
System.exit(0);
}
}

public String popUpBox() {
String str = JOptionPane.showInputDialog("Enter course to add.");
return str.toUpperCase();
}}