import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.Icon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserInfo extends JFrame {

	private JPanel contentPane;
	private JTextField textusrname;
	private JPasswordField passwordField;
	
	Color setail = new Color(0, 95, 115);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserInfo frame = new UserInfo();
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
	public UserInfo() {
		setTitle("User Info");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900, 500);
		contentPane = new JPanel();
		contentPane.setBackground(setail);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		JLabel lbllogo2 = new JLabel("");
		Image logo = new ImageIcon(this.getClass().getResource("/logo.png")).getImage();
		lbllogo2.setIcon(new ImageIcon(logo));
		lbllogo2.setBounds(220, 28, 450, 425);
		contentPane.add(lbllogo2);
		
		JLabel lblusrname = new JLabel("Username :");
		lblusrname.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblusrname.setBounds(241, 261, 113, 32);
		contentPane.add(lblusrname);
		
		JLabel lblpsswrd = new JLabel("Password :");
		lblpsswrd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblpsswrd.setBounds(241, 303, 113, 32);
		contentPane.add(lblpsswrd);
		
		textusrname = new JTextField();
		textusrname.setColumns(10);
		textusrname.setBounds(406, 272, 243, 19);
		contentPane.add(textusrname);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(406, 314, 243, 19);
		contentPane.add(passwordField);
		
		//add button to user reset username and password
		JButton btnreset = new JButton("Reset");
		btnreset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//to reset username and password
				textusrname.setText ("");
				passwordField.setText ("");
			}
		});
		btnreset.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnreset.setBounds(241, 380, 144, 38);
		contentPane.add(btnreset);
		
		JButton btnlogin = new JButton("Login");
		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int password = Integer.parseInt(passwordField.getText());
				String name = textusrname.getText(); //username will shown on home frame
				
				
				//messge dialog will shown if user enter wrong password
				if(password == 2022)
				{
					Home h = new Home (name);
					h.show();
					
						
					dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Wrong password");
				}
					
			}
		});
		btnlogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnlogin.setBounds(505, 380, 144, 38);
		contentPane.add(btnlogin);
		
		JLabel lblhint = new JLabel("( Hint : 2022 )");
		lblhint.setBounds(406, 343, 96, 13);
		contentPane.add(lblhint);
	}
}
