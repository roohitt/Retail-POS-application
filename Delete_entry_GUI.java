package counter_application;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Delete_entry_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Delete_entry_GUI frame = new Delete_entry_GUI();
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
	public Delete_entry_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 50, 450, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("              Enter the item no. of the Item you want to delete");
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					 String item_numberString = textField.getText();
					 
					 String queryString = "delete from items where Item_no="+item_numberString;
					 Class.forName("com.mysql.jdbc.Driver");
					 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/demo","root","R.sharma");
					 Statement statement = connection.createStatement();
					 statement.executeUpdate(queryString);
				 
				 }
				 catch (Exception e1) {
					 System.out.print(e1);
				} 
				
			}
		});
		
		textField = new JTextField();
		textField.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 422, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(36)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 343, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(77)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton)
					.addGap(166))
		);
		contentPane.setLayout(gl_contentPane);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}
	
	

}
