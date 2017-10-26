import javax.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Lab8 extends JFrame {

public static void main(String[] args) {
new Lab8();
new Menu();
}

DefaultListModel<String> model = new DefaultListModel<String>();
JList<String> list = new JList<String>(model);
JScrollPane scrollPane = new JScrollPane(list);

public Lab8() {

setTitle("Lab 8 Solution - Russell Boyd");
setLayout(new BorderLayout());
add(BorderLayout.CENTER, scrollPane);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(500, 500);
setVisible(true);

		setTitle("JMenuBar");
		JMenuBar menubar = new JMenuBar();
		ImageIcon icon = new ImageIcon("exit.png");
		JMenu file = new JMenu("File");
		JMenuItem AddStudent = new JMenuItem("Add a student", icon);
		JMenuItem Close = new JMenuItem("Close", icon);
		JMenuItem displayStudents = new JMenuItem("Display students", icon);
		JMenuItem removeStudent = new JMenuItem("Remove student", icon);
		JMenuItem sortStudents = new JMenuItem("Sort students", icon);

		file.setMnemonic(KeyEvent.VK_F);
		AddStudent.setMnemonic(KeyEvent.VK_A);
		AddStudent.setToolTipText("Add a student");
		Close.setMnemonic(KeyEvent.VK_C);
		Close.setToolTipText("Exit application");
		displayStudents.setMnemonic(KeyEvent.VK_D);
		displayStudents.setToolTipText("Display students");
		removeStudent.setMnemonic(KeyEvent.VK_R);
		removeStudent.setToolTipText("Remove student");
		sortStudents.setMnemonic(KeyEvent.VK_S);
		sortStudents.setToolTipText("Sort students");
		
		AddStudent.addActionListener(new fileAddStudent());
		Close.addActionListener(new fileClose());
		displayStudents.addActionListener(new fileDisplayStudents());
		sortStudents.addActionListener(new fileSortStudents());
		removeStudent.addActionListener(new fileRemoveStudent());
		
		file.add(Close);
		file.add(AddStudent);
		file.add(displayStudents);
		file.add(removeStudent);
		file.add(sortStudents);
		menubar.add(file);
		
		setJMenuBar(menubar);
		setSize(250, 200);
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

class fileClose implements ActionListener
{
	public void actionPerformed(ActionEvent event)
	{
	System.exit(0);
	}
}

class fileAddStudent implements ActionListener 
{

	public void actionPerformed(ActionEvent event)
	{
		String str = setFName();
		if (str.length() != 0) 
		{
		model.addElement(str);
		}
	}
}

class fileDisplayStudents implements ActionListener
{
	public void actionPerformed(ActionEvent event)
	{
		System.exit(0);
	}
}

class fileSortStudents implements ActionListener
{
	public void actionPerformed(ActionEvent event)
	{
	System.exit(0);
	}	
}

class fileRemoveStudent implements ActionListener
{
	public void actionPerformed(ActionEvent event)
	{
		String str = removeStu();
		if (str.length() != 0) 
		{
		model.removeElement(str);	
		}
	}
}

public String removeStu()
{
	String str = JOptionPane.showInputDialog("Enter the name of the student to remove.");
	return str.toUpperCase();
}

public String setFName() 
	{
	String str = JOptionPane.showInputDialog("Enter first name of student to add.");
	return str.toUpperCase();
	}
}