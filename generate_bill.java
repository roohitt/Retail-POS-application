package counter_application;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.TextField;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class generate_bill extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JButton button;
	private JButton btnExit;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField textField_for_item_number;
	private JLabel Item_name_label;
	private JLabel Item_name_value;
	private JLabel Quantity_label;
	private JLabel Price_label;
	private JLabel Quantity_value;
	private JLabel Price_value;
	private JLabel QuantityRequired_label;
	private JTextField Quantity_required_textfeild;
	private JButton AddItem_button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					generate_bill frame = new generate_bill();
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
	public generate_bill() {
		
		Thread clockThread = new Thread() {
			
			public void run() {
				try {
					while(true) {
						DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
						Date date = new Date();
						lblNewLabel_6.setText(dateFormat.format(date));
						
						sleep(1000);
					}
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		clockThread.start();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 650, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lblNewLabel_1 = new JLabel("AUMTOMATED PURCHASE ORDER");
		lblNewLabel_1.setForeground(new Color(107, 142, 35));
		lblNewLabel_1.setFont(new Font("Lucida Handwriting", Font.BOLD, 20));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		
		lblNewLabel = new JLabel("     AUTOMATED PURCHASE ORDER");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 33));
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setForeground(new Color(107, 142, 35));
		
		btnNewButton = new JButton("New button");
		
		button = new JButton("New button");
		
		btnExit = new JButton("Exit");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(106)
							.addComponent(lblNewLabel_1))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 492, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(button, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnExit, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addComponent(lblNewLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel_1)
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 525, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnNewButton)
							.addGap(15)
							.addComponent(button)
							.addGap(18)
							.addComponent(btnExit)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
		);
		
		lblNewLabel_2 = new JLabel("RK & Sons");
		lblNewLabel_2.setFont(new Font("Nirmala UI", Font.BOLD, 16));
		
		lblNewLabel_3 = new JLabel("3123/4a Main st. toronto, Canada");
		
		lblNewLabel_4 = new JLabel("Status: OPEN");
		
		lblNewLabel_5 = new JLabel("DOP:");
		
		lblNewLabel_6 = new JLabel("New label");
		
		JPanel panel_1 = new JPanel();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_3)
								.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel_5)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_6))
								.addComponent(lblNewLabel_4))))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_4))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(lblNewLabel_6)
						.addComponent(lblNewLabel_5))
					.addGap(34)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(347, Short.MAX_VALUE))
		);
		
		JLabel Item_number_label_search = new JLabel("Item Number:");
		
		textField_for_item_number = new JTextField();
		textField_for_item_number.setColumns(10);
		
		JButton btn_search = new JButton("Search");
		btn_search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				

				try {
					 String item_numberString = textField_for_item_number.getText();					 
					 String queryString = "select * from items where Item_no="+item_numberString;

					 
					 Class.forName("com.mysql.jdbc.Driver");
					 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/demo","root","R.sharma");
					 Statement statement = connection.createStatement();
					 ResultSet rSet = statement.executeQuery(queryString);
					 
					if(rSet.next()) {
						 String nameString = rSet.getString("Item_name");
						 String priceString = rSet.getString("Price");
						 String quantitysString = rSet.getString("Quantity");
						 
						 Item_name_value.setText(nameString);
						 Price_value.setText(priceString);
						 Quantity_value.setText(quantitysString);

					 }
					 
					 
				 }
				 catch (Exception e1) {
					 System.out.print(e1);
				} 
				
			}
		});
		
		Item_name_label = new JLabel("Item Name:");
		
		Item_name_value = new JLabel("xyz");
		
		Quantity_label = new JLabel("Quantity left:");
		
		Price_label = new JLabel("Price:");
		
		Quantity_value = new JLabel("xyz");
		
		Price_value = new JLabel("xyz");
		
		QuantityRequired_label = new JLabel("Quantity Required:");
		
		Quantity_required_textfeild = new JTextField();
		Quantity_required_textfeild.setColumns(10);
		
		AddItem_button = new JButton("Add Item");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btn_search, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(textField_for_item_number, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
						.addComponent(Item_number_label_search, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(Item_name_label)
							.addGap(18)
							.addComponent(Item_name_value, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(Quantity_label)
								.addComponent(Price_label))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(Quantity_value, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
								.addComponent(Price_value, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
						.addComponent(AddItem_button, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(Quantity_required_textfeild, 0, 0, Short.MAX_VALUE)
						.addComponent(QuantityRequired_label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(31, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(Item_number_label_search)
						.addComponent(Item_name_label)
						.addComponent(Item_name_value)
						.addComponent(QuantityRequired_label))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField_for_item_number, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(Quantity_label))
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(Quantity_value)
							.addComponent(Quantity_required_textfeild, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(btn_search)
								.addComponent(AddItem_button)))
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(Price_label)
							.addComponent(Price_value)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}