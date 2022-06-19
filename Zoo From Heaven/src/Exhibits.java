import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Image;

public class Exhibits extends JFrame {

	private JPanel contentPane;
	
	Color setail = new Color(142, 154, 175);

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exhibits frame = new Exhibits();
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
	public Exhibits(String name) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(setail);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//back to homepage frame
		JButton btnback3 = new JButton("Back");
		btnback3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Home h = new Home(name);
				h.show();
				
				dispose();
			}
		});
		btnback3.setBounds(10, 10, 85, 21);
		contentPane.add(btnback3);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "REPTILE HOUSE", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 41, 370, 456);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblcrocodile = new JLabel("");
		Image crocodile = new ImageIcon(this.getClass().getResource("/Reptile house.png")).getImage();
		lblcrocodile.setIcon(new ImageIcon(crocodile));
		lblcrocodile.setBounds(10, 20, 351, 277);
		panel.add(lblcrocodile);
		
		JTextArea txtrTheReptileHouse = new JTextArea();
		txtrTheReptileHouse.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		txtrTheReptileHouse.setText("The Reptile House in Zoo From Heaven has both\r\noutdoor and indoor exhibits. Behold the world's\r\nlargest crocodiles, the saltwater or estuarine\r\ncrocodiles, who are relaxing in their pool. Tortoises,\r\nterrapins, and lizards are also on display in the\r\nReptile House. The Reptile House's ground level\r\nhouses both venomous and non-venomous snake\r\ncollections.");
		txtrTheReptileHouse.setBackground(Color.LIGHT_GRAY);
		txtrTheReptileHouse.setBounds(10, 311, 351, 135);
		panel.add(txtrTheReptileHouse);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "BUTTERFLY GARDEN", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel2.setBackground(Color.LIGHT_GRAY);
		panel2.setBounds(390, 41, 370, 456);
		contentPane.add(panel2);
		
		JLabel lblbutterfly = new JLabel("");
		Image bttrfly = new ImageIcon(this.getClass().getResource("/buttrfly garden.png")).getImage();
		lblbutterfly.setIcon(new ImageIcon(bttrfly));
		lblbutterfly.setBounds(10, 20, 352, 273);
		panel2.add(lblbutterfly);
		
		JTextArea txtrbutterfly = new JTextArea();
		txtrbutterfly.setText("Butterflies are frequently misunderstood because\r\nthey are classified as insects. But these stunning\r\ncreatures are critical to the life of all vertebrates,\r\nincluding ourselves! Take a closer look at these\r\nwinged beauties in many different colors and\r\nforms at the spectacular Butterfly Garden.");
		txtrbutterfly.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		txtrbutterfly.setBackground(Color.LIGHT_GRAY);
		txtrbutterfly.setBounds(10, 311, 351, 135);
		panel2.add(txtrbutterfly);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "ZOO FROM HEAVEN AQUARIUM", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel3.setBackground(Color.LIGHT_GRAY);
		panel3.setBounds(770, 41, 370, 456);
		contentPane.add(panel3);
		
		JLabel lblaquarium = new JLabel("");
		Image aquarium = new ImageIcon(this.getClass().getResource("/aquarium.png")).getImage();
		lblaquarium.setIcon(new ImageIcon(aquarium));
		lblaquarium.setBounds(10, 20, 352, 271);
		panel3.add(lblaquarium);
		
		JTextArea txtraquarium = new JTextArea();
		txtraquarium.setText("Zoo From Heaven Aquarium is one of the country's\r\noldest public aquariums. It is the country's first-ever\r\nexhibition on the Malaysian River Journey, focusing\r\non aquatic animals and vegetation from the\r\nhighlands to the sea. The aquarium has uncommon\r\nand endangered species such as crabs, prawns,\r\naquatic insects, and aquatic vegetation, as well as\r\nfish that are regularly found in Malaysian rivers.");
		txtraquarium.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		txtraquarium.setBackground(Color.LIGHT_GRAY);
		txtraquarium.setBounds(10, 311, 351, 135);
		panel3.add(txtraquarium);
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(null);
		panel4.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "APE CENTRE", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel4.setBackground(Color.LIGHT_GRAY);
		panel4.setBounds(1160, 41, 370, 456);
		contentPane.add(panel4);
		
		JLabel lblorangutan = new JLabel("");
		Image orgutan = new ImageIcon(this.getClass().getResource("/Ape centre.png")).getImage();
		lblorangutan.setIcon(new ImageIcon(orgutan));
		lblorangutan.setBounds(8, 28, 353, 273);
		panel4.add(lblorangutan);
		
		JTextArea txtrapecentre = new JTextArea();
		txtrapecentre.setText("The Ape Centre is located at Zoo From Heaven's\r\nhighest point. There, you may view a group of\r\nAfrican chimps as well as two orangutan species;\r\nBornean orangutans and Sumatran orangutans.\r\nThe Ape Centre is one of the zoo's coolest and\r\nmost scenic locations, with thick foliage all around.");
		txtrapecentre.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		txtrapecentre.setBackground(Color.LIGHT_GRAY);
		txtrapecentre.setBounds(10, 311, 351, 135);
		panel4.add(txtrapecentre);
		
		JPanel panel5 = new JPanel();
		panel5.setLayout(null);
		panel5.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "CHILDREN WORLD", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel5.setBackground(Color.LIGHT_GRAY);
		panel5.setBounds(10, 507, 370, 328);
		contentPane.add(panel5);
		
		JLabel lblchildworld = new JLabel("");
		Image childwrld = new ImageIcon(this.getClass().getResource("/Child world.png")).getImage();
		lblchildworld.setIcon(new ImageIcon(childwrld));
		lblchildworld.setBounds(10, 32, 350, 272);
		panel5.add(lblchildworld);
		
		JPanel panel6 = new JPanel();
		panel6.setLayout(null);
		panel6.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "LAKE BIRDS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel6.setBackground(Color.LIGHT_GRAY);
		panel6.setBounds(390, 507, 370, 328);
		contentPane.add(panel6);
		
		JLabel lbllakebirds = new JLabel("");
		Image birds = new ImageIcon(this.getClass().getResource("/lake birds.png")).getImage();
		lbllakebirds.setIcon(new ImageIcon(birds));
		lbllakebirds.setBounds(10, 32, 353, 272);
		panel6.add(lbllakebirds);
		
		JPanel panel7 = new JPanel();
		panel7.setLayout(null);
		panel7.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "GIANT PANDA CONVERSATION CENTRE", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel7.setBackground(Color.LIGHT_GRAY);
		panel7.setBounds(770, 507, 370, 328);
		contentPane.add(panel7);
		
		JLabel lblpanda = new JLabel("");
		Image panda = new ImageIcon(this.getClass().getResource("/Panda.png")).getImage();
		lblpanda.setIcon(new ImageIcon(panda));
		lblpanda.setBounds(10, 32, 350, 272);
		panel7.add(lblpanda);
		
		JPanel panel8 = new JPanel();
		panel8.setLayout(null);
		panel8.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "CAT WALK", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel8.setBackground(Color.LIGHT_GRAY);
		panel8.setBounds(1160, 507, 370, 328);
		contentPane.add(panel8);
		
		JLabel lblcat = new JLabel("");
		Image cat = new ImageIcon(this.getClass().getResource("/cat walk.png")).getImage();
		lblcat.setIcon(new ImageIcon(cat));
		lblcat.setBounds(10, 32, 352, 275);
		panel8.add(lblcat);
		
	}
}
