import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EntranceFee extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EntranceFee frame = new EntranceFee();
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
	public EntranceFee(String name) {
		Image icon = new ImageIcon(this.getClass().getResource("/icon.png")).getImage();
		setIconImage(icon);
		setUndecorated(true);
		setBounds (0, 0, 900, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		JLabel lblfee = new JLabel("");
		Image fee = new ImageIcon(this.getClass().getResource("/Entrance fee.png")).getImage();
		lblfee.setIcon(new ImageIcon(fee));
		lblfee.setBounds(0, 45, 868, 413);
		contentPane.add(lblfee);
		
		//back to homepage frame
		JButton btnback1 = new JButton("back");
		btnback1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home h = new Home(name);
				h.show();
				
				dispose();
			}
		});
		btnback1.setBounds(10, 10, 85, 21);
		contentPane.add(btnback1);
	}
}
