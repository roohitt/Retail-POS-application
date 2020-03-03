package counter_application;
import java.sql.*;
import java.util.Collection;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import java.awt.Font;

public class menu_items_gui extends JFrame {

	private JPanel contentPane;
	private JTable table; 
	private JTable table_1;
	private JButton btnNewEntry;
	private JButton btnDeleteEntry;
	private JButton btnQuit;

	/**
	 * Launch the application.
	 */
	
			
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu_items_gui frame = new menu_items_gui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the frame.
	 */
	public menu_items_gui() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		table_1 = new JTable();
		table_1.setBackground(Color.GREEN);		
		JButton load_table = new JButton("Refresh");
		load_table.setBackground(Color.GREEN);
		load_table.setForeground(Color.BLACK);
		load_table.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				 try {
					 String queryString = "Select * from Items";
					 Class.forName("com.mysql.jdbc.Driver");
					 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/demo","root","R.sharma");
					 Statement statement = connection.createStatement();
					 ResultSet rSet = statement.executeQuery(queryString);
					 table_1.setModel(DbUtils.resultSetToTableModel(rSet));
				 
				 }
				 catch (Exception e1) {
					 System.out.print(e1);
				} 
				
			}
			
		});
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		
		btnNewEntry = new JButton("New Item\r\n");
		btnNewEntry.setBackground(Color.GREEN);
		btnNewEntry.setForeground(Color.BLACK);
		btnNewEntry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				New_Entry_GUI new_Entry_GUI = new  New_Entry_GUI();
				new_Entry_GUI.setVisible(true);
				
				
			}
		});
		
		btnDeleteEntry = new JButton("Del Item");
		btnDeleteEntry.setBackground(Color.GREEN);
		btnDeleteEntry.setForeground(Color.BLACK);
		btnDeleteEntry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Delete_entry_GUI delete_entry_GUI = new Delete_entry_GUI();
				delete_entry_GUI.setVisible(true);
			}
		});
		
		btnQuit = new JButton("Quit");
		btnQuit.setBackground(Color.GREEN);
		btnQuit.setForeground(Color.BLACK);
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);//terminates the current running java virtual machine and 0 means normal termination
			}
		});
		
		JLabel lblNewLabel = new JLabel("Refresh to load the Table");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addComponent(table_1, GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnQuit, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addComponent(btnNewEntry, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
							.addComponent(btnDeleteEntry, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
						.addComponent(load_table, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
					.addContainerGap())
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(141)
					.addComponent(lblNewLabel)
					.addContainerGap(144, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(9)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnNewEntry)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnDeleteEntry)
							.addGap(13)
							.addComponent(load_table)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnQuit, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(table_1, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
					.addGap(55))
		);
		contentPane.setLayout(gl_contentPane);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
