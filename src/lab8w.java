import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.TextArea;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JList;

public class lab8w {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lab8w window = new lab8w();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	 
	 DefaultListModel<String> model = new DefaultListModel<String>();
	JList<String> list = new JList<String>(model);
		
		
	public lab8w() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 635, 667);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmAddAStudent = new JMenuItem("Add a student");
		mntmAddAStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			String str = popUpBox();
			if (str.length() != 0) {
			model.addElement(str);
								}
			}}
		);
		
		mnFile.add(mntmAddAStudent);
		
		JMenuItem mntmRemoveAStudent = new JMenuItem("Remove a student");
		mnFile.add(mntmRemoveAStudent);
		
		JMenuItem mntmDisplayStudents = new JMenuItem("Display students");
		mnFile.add(mntmDisplayStudents);
		
		JMenuItem mntmSortStudents = new JMenuItem("Sort students");
		mnFile.add(mntmSortStudents);
		
		JMenuItem mntmClose = new JMenuItem("Close");
		mntmClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mnFile.add(mntmClose);
		frame.getContentPane().add(list, BorderLayout.NORTH);
	}

}
