package counter_application;

import javax.swing.*;

import java.awt.*;
import java.text.*;
import java.util.Date;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout.Alignment;


public class Main {
	
	 //Declaring all the variables that will be used globally
	
	 static Font font1 = new Font("SansSerif", Font.BOLD, 20);
	 static JTextArea text_date	= new JTextArea();
	 static JFrame frame = new JFrame("Billing Portal");
	 static JTextArea welcome_texTextArea = new JTextArea();
	 static JTextArea copyrightTextArea = new JTextArea();
	 static JLabel jLabel =  new JLabel();
	 
	 private static String pin = "1234";
	 
	 
	 static JPanel centerpanel =  new JPanel();
	 static JPanel toppanel =  new JPanel();
	 static JPanel lowerpanel =  new JPanel(new BorderLayout());
	 private static JTextField textField;

	public static void main(String[] args) {
		
		
		//thread to display live time on the panel
		
		Thread clockThread = new Thread() {
			
			public void run() {
				try {
					while(true) {
						DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
						Date date = new Date();
						
						text_date.setBackground(Color.ORANGE);
						text_date.setForeground(Color.BLACK);
						text_date.setFont(font1);
						text_date.setText("                             "+dateFormat.format(date));
						
						sleep(1000);
					}
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		clockThread.start();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\rs631\\Pictures\\sign.jpg"));
	
		
		//using variables to set their attributes
		

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 900);
		
		welcome_texTextArea.setBackground(Color.GREEN);
		welcome_texTextArea.setForeground(Color.BLACK);
		welcome_texTextArea.setFont(font1);
		welcome_texTextArea.setText("  WELCOME  TO THE PORTAL!! ENTER THE PIN TO LOGIN.");
		
		copyrightTextArea.setBackground(Color.GREEN);
		copyrightTextArea.setForeground(Color.BLACK);
		copyrightTextArea.setFont(font1);
		copyrightTextArea.setText("                                       MADE BY- RK");
		
		
		
		toppanel.setBackground(Color.GREEN);
		toppanel.setPreferredSize(new Dimension(600,100));
		toppanel.setLayout(new BorderLayout());
		toppanel.add(welcome_texTextArea, BorderLayout.SOUTH);
		text_date.setBackground(Color.ORANGE);
		toppanel.add(text_date);
		
		lowerpanel.setPreferredSize(new Dimension(600,100));
		lowerpanel.setLayout(new BorderLayout());
		lowerpanel.setBackground(Color.GREEN);
		lowerpanel.add(copyrightTextArea, BorderLayout.CENTER);
		
		
		
		
		
		frame.getContentPane().add(BorderLayout.NORTH,toppanel);
		frame.getContentPane().add(BorderLayout.SOUTH,lowerpanel);
		centerpanel.setForeground(Color.WHITE);
		centerpanel.setBackground(Color.ORANGE);
		frame.getContentPane().add(BorderLayout.CENTER,centerpanel);
		
		JButton NUmber1 = new JButton("1");
		NUmber1.setForeground(Color.BLACK);
		NUmber1.setBackground(Color.GREEN);
		NUmber1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"1");
			}
			
		});
		
		JButton button2 = new JButton("2");
		button2.setForeground(Color.BLACK);
		button2.setBackground(Color.GREEN);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"2");
			}
		});
		
		JButton button = new JButton("3");
		button.setForeground(Color.BLACK);
		button.setBackground(Color.GREEN);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"3");
			}
		});
		
		JButton button_1 = new JButton("5");
		button_1.setBackground(Color.GREEN);
		button_1.setForeground(Color.BLACK);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"5");
			}
			
		});
		
		JButton button_2 = new JButton("6");
		button_2.setBackground(Color.GREEN);
		button_2.setForeground(Color.BLACK);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText()+"6");
			}
		});
		
		JButton button_3 = new JButton("4");
		button_3.setBackground(Color.GREEN);
		button_3.setForeground(Color.BLACK);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"4");
			}
		});
		
		JButton button_4 = new JButton("8");
		button_4.setBackground(Color.GREEN);
		button_4.setForeground(Color.BLACK);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText()+"8");
			}
			
		});
		
		JButton button_5 = new JButton("9");
		button_5.setBackground(Color.GREEN);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"9");
				
			}
		});
		button_5.setForeground(Color.BLACK);
		
		JButton button_6 = new JButton("7");
		button_6.setBackground(Color.GREEN);
		button_6.setForeground(Color.BLACK);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"7");
			}
			
		});
		
		JButton button_7 = new JButton("0");
		button_7.setBackground(Color.GREEN);
		button_7.setForeground(Color.BLACK);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"0");
			}
			
		});
		
		JButton button_8 = new JButton("=>");
		button_8.setBackground(Color.GREEN);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(pin.equals(textField.getText())) {
					
					AfterLogin afterLogin =  new AfterLogin();
					frame.setVisible(false);
					afterLogin.setVisible(true);
					
				}
				else {
					textField.setText("Invalid pin");
				}
			}
		});
		button_8.setForeground(Color.BLACK);
		
		JButton btnX = new JButton("X");
		btnX.setBackground(Color.GREEN);
		btnX.setForeground(Color.BLACK);
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int length_of_text = textField.getText().length();
				int last_character_position = textField.getText().length() - 1;
				String new_string_valueString;
				
				if(length_of_text>0) {
					
					StringBuilder stringBuilder = new StringBuilder(textField.getText());
					stringBuilder.deleteCharAt(last_character_position);
					new_string_valueString = stringBuilder.toString();
					textField.setText(new_string_valueString);
				}
				
			}
		});
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBackground(Color.GREEN);
		btnExit.setForeground(Color.BLACK);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
		
		
		textField = new JTextField();
		textField.setColumns(10);
		GroupLayout gl_centerpanel = new GroupLayout(centerpanel);
		gl_centerpanel.setHorizontalGroup(
			gl_centerpanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_centerpanel.createSequentialGroup()
					.addGap(99)
					.addGroup(gl_centerpanel.createParallelGroup(Alignment.LEADING)
						.addComponent(textField, Alignment.TRAILING, 367, 367, 367)
						.addComponent(NUmber1, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_centerpanel.createSequentialGroup()
							.addGroup(gl_centerpanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_centerpanel.createParallelGroup(Alignment.TRAILING)
									.addComponent(button2, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
									.addGroup(gl_centerpanel.createParallelGroup(Alignment.LEADING)
										.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_centerpanel.createSequentialGroup()
											.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
											.addGap(30)
											.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
										.addComponent(btnX, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_centerpanel.createParallelGroup(Alignment.LEADING)
									.addComponent(button_7, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
									.addGroup(gl_centerpanel.createSequentialGroup()
										.addGap(137)
										.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
									.addComponent(btnExit, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)))
							.addGap(26)
							.addGroup(gl_centerpanel.createParallelGroup(Alignment.LEADING)
								.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
								.addComponent(button, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(116, Short.MAX_VALUE))
		);
		gl_centerpanel.setVerticalGroup(
			gl_centerpanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_centerpanel.createSequentialGroup()
					.addGap(55)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(53)
					.addGroup(gl_centerpanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
						.addComponent(NUmber1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_centerpanel.createSequentialGroup()
							.addComponent(button2, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
							.addGap(16)))
					.addGap(50)
					.addGroup(gl_centerpanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_centerpanel.createParallelGroup(Alignment.BASELINE)
							.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)))
					.addGap(33)
					.addGroup(gl_centerpanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_centerpanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_centerpanel.createSequentialGroup()
							.addGap(51)
							.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
							.addGap(28)
							.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_centerpanel.createSequentialGroup()
							.addGap(34)
							.addGroup(gl_centerpanel.createParallelGroup(Alignment.LEADING)
								.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnX, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(59, Short.MAX_VALUE))
		);
		centerpanel.setLayout(gl_centerpanel);
		
		//In Java Swing, the layer that is used to hold objects is called the content pane
		//The getContentPane() method retrieves the content pane layer so that you can add an object to it.
		
		frame.setVisible(true);
		//The setVisible() method in Java makes the GUI component visible to the user depending on the Boolean parameter you pass in the function.	
	}
}