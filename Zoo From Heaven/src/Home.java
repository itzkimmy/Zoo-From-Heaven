import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.JTextArea;
import javax.swing.DropMode;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home(String name) {
		setTitle("Homepage");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 570);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 886, 44);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//to open entrance fee frame
		JButton btnfee = new JButton("Entrance Fee");
		btnfee.setForeground(Color.WHITE);
		btnfee.setBorder(null);
		btnfee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EntranceFee ef = new EntranceFee(name);
				ef.show();
				
				dispose();
			}
		});
		btnfee.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnfee.setBackground(Color.DARK_GRAY);
		btnfee.setBounds(10, 0, 126, 44);
		panel.add(btnfee);
		
		
		//to open exhibits frame
		JButton btnexhibits = new JButton("Exhibits");
		btnexhibits.setForeground(Color.WHITE);
		btnexhibits.setBorder(null);
		btnexhibits.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Exhibits c = new Exhibits (name);
				c.show();
				
				dispose();
			}
		});
		btnexhibits.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnexhibits.setBackground(Color.DARK_GRAY);
		btnexhibits.setBounds(390, 0, 110, 44);
		panel.add(btnexhibits);
		
		
		//to open order ticket frame
		JButton btnticket = new JButton("Order Ticket");
		btnticket.setForeground(Color.WHITE);
		btnticket.setBorder(null);
		btnticket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				OrderTicket ot = new OrderTicket();
				ot.show();
				
				dispose();
			}
		});
		btnticket.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnticket.setBackground(Color.DARK_GRAY);
		btnticket.setBounds(753, 0, 123, 44);
		panel.add(btnticket);
		
		//to open zoo map frame
		JButton btnmap = new JButton("Zoo Map");
		btnmap.setForeground(Color.WHITE);
		btnmap.setBorder(null);
		btnmap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ZooMap zm = new ZooMap(name);
				zm.show();
				
				dispose();
			}
		});
		btnmap.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnmap.setBackground(Color.DARK_GRAY);
		btnmap.setBounds(204, 0, 113, 44);
		panel.add(btnmap);
		
		//to open contact us frame
		JButton btncontact = new JButton("Contact Us");
		btncontact.setBounds(578, 0, 110, 44);
		panel.add(btncontact);
		btncontact.setForeground(Color.WHITE);
		btncontact.setBorder(null);
		btncontact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ContactUs cu = new ContactUs(name);
				cu.show();
				
				dispose();
			}
		});
		btncontact.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btncontact.setBackground(Color.DARK_GRAY);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBorder(new TitledBorder(null, "ABOUT US", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(0, 103, 886, 155);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea txtrZooFromHeaven = new JTextArea();
		txtrZooFromHeaven.setBackground(Color.LIGHT_GRAY);
		txtrZooFromHeaven.setFont(new Font("Cambria", Font.PLAIN, 14));
		txtrZooFromHeaven.setText("Zoo From Heaven is managed by the Zoological Society, a non-governmental organization . Zoo From Heaven was officially opened on \r\n15th July 2003 and has matured into a well-known zoo all around the world. We have a total of over 5137 specimen from 476 species of \r\nmammals, birds, reptiles, amphibians and fish.\r\n\r\nZoo From Heaven covers 110 acres of land which is situated only 5km from the city of Kuala Lumpur. Over the years, the zoo has \r\ntransformed itself to an open concept zoo with over 90% of its animals being kept in spacious exhibits with landscape befitting its nature.\r\nWe are working in making sure that the old zoo concept is changed entirely.");
		txtrZooFromHeaven.setBounds(10, 21, 856, 130);
		panel_1.add(txtrZooFromHeaven);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "HIGHLIGHTS", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(0, 268, 876, 260);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblimg1 = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/img1.jpg")).getImage();
		lblimg1.setIcon(new ImageIcon(img1));
		lblimg1.setBounds(10, 22, 225, 225);
		panel_2.add(lblimg1);
		
		JLabel lblimg2 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/img2.jpg")).getImage();
		lblimg2.setIcon(new ImageIcon(img2));
		lblimg2.setBounds(330, 22, 225, 225);
		panel_2.add(lblimg2);
		
		JLabel lblimg3 = new JLabel("");
		Image img3 = new ImageIcon(this.getClass().getResource("/img3.jpg")).getImage();
		lblimg3.setIcon(new ImageIcon(img3));
		lblimg3.setBounds(641, 22, 225, 225);
		panel_2.add(lblimg3);
		
		JLabel lblwelcome = new JLabel("Welcome to Zoo From Heaven " + name);
		lblwelcome.setBounds(0, 54, 866, 44);
		contentPane.add(lblwelcome);
		lblwelcome.setFont(new Font("Source Code Pro", Font.BOLD, 16));
		
		
	}
}
