import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class ZooMap extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ZooMap frame = new ZooMap();
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
	public ZooMap(String name) {
		Image icon = new ImageIcon(this.getClass().getResource("/icon.png")).getImage();
		setIconImage(icon);
		setUndecorated(true);
		setSize(1920,1080);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//back to homepage frame
		JButton btnback2 = new JButton("Back");
		btnback2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Home h = new Home(name);
				h.show();
				
				dispose();
			}
		});
		btnback2.setBounds(10, 10, 85, 21);
		contentPane.add(btnback2);
		
		JLabel lblmap = new JLabel("");
		Image map = new ImageIcon(this.getClass().getResource("/map.png")).getImage();
		lblmap.setIcon(new ImageIcon(map));
		lblmap.setBounds(430, 90, 703, 743);
		contentPane.add(lblmap);
	}
}
