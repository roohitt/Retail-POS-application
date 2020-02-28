package counter_application;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import java.awt.CardLayout;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Menu;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;

public class AfterLogin extends JFrame {
	
	

	private JPanel contentPane;
	static JPanel panel = new JPanel();
	static JLabel lblNewLabel = new JLabel("New label");


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AfterLogin frame = new AfterLogin();
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
	public AfterLogin() {
		
		Thread clockThread = new Thread() {
			
			public void run() {
				try {
					while(true) {
						DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
						Date date = new Date();
						lblNewLabel.setText("                             "+dateFormat.format(date));
						
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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(contentPane);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(Color.BLACK);
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnExit.setBackground(Color.GREEN);
		
		JButton button = new JButton("Menu Items");
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button.setBackground(Color.GREEN);
		
		JButton button_1 = new JButton("Menu Items");
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_1.setBackground(Color.GREEN);
		
		
		JButton _past_orders = new JButton("Past Orders");
		_past_orders.setForeground(Color.BLACK);
		_past_orders.setFont(new Font("Times New Roman", Font.BOLD, 15));
		_past_orders.setBackground(Color.GREEN);
		
		JButton CustomerEntry = new JButton("Customers");
		CustomerEntry.setForeground(Color.BLACK);
		CustomerEntry.setFont(new Font("Times New Roman", Font.BOLD, 15));
		CustomerEntry.setBackground(Color.GREEN);
		
		JButton billing = new JButton("Generate Bill");
		billing.setForeground(Color.BLACK);
		billing.setFont(new Font("Times New Roman", Font.BOLD, 15));
		billing.setBackground(Color.GREEN);
		
		JButton menu_items = new JButton("Menu Items");
		menu_items.setForeground(Color.BLACK);
		menu_items.setFont(new Font("Times New Roman", Font.BOLD, 15));
		menu_items.setBackground(Color.GREEN);
		menu_items.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				menu_items_gui mGui = new menu_items_gui();
				mGui.setVisible(true);
				
			}
		});
		
		JButton tables_reservation = new JButton("Tables");
		tables_reservation.setForeground(Color.BLACK);
		tables_reservation.setFont(new Font("Times New Roman", Font.BOLD, 15));
		tables_reservation.setBackground(Color.GREEN);
		
		JButton todays_coupons = new JButton("Coupons");
		todays_coupons.setForeground(Color.BLACK);
		todays_coupons.setFont(new Font("Times New Roman", Font.BOLD, 15));
		todays_coupons.setBackground(Color.GREEN);
		
		
		panel.setBackground(Color.ORANGE);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addContainerGap()
									.addComponent(billing, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(_past_orders, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(CustomerEntry, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(button, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(menu_items, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tables_reservation, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(todays_coupons, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(menu_items, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(tables_reservation, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addComponent(todays_coupons, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(_past_orders, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
						.addComponent(CustomerEntry, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
						.addComponent(billing, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		
		
		panel.add(lblNewLabel);
		contentPane.setLayout(gl_contentPane);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}
}
