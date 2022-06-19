import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Image;

public class ContactUs extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactUs frame = new ContactUs();
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
	public ContactUs(String name) {
		Image icon = new ImageIcon(this.getClass().getResource("/icon.png")).getImage();
		setIconImage(icon);
		setUndecorated(true);
		setBounds(100, 100, 900, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
      //back to homepage frame
		JButton btnback5 = new JButton("Back");
		btnback5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Home h = new Home(name);
				h.show();
				
				dispose();
			}
		});
		btnback5.setBounds(10, 10, 85, 21);
		contentPane.add(btnback5);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "CONTACT US", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 41, 866, 412);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblcontact = new JLabel("For any enquiries, call our general lines +60 16-798 1454/ +60 18-390 3621 and ask for the following Department:");
		lblcontact.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblcontact.setBounds(10, 21, 777, 27);
		panel.add(lblcontact);
		
		JTextArea txtrAdministrationadmindepartmentzfrmheavenmy = new JTextArea();
		txtrAdministrationadmindepartmentzfrmheavenmy.setText("Administration (admindepartment@zfrmheaven.my)\r\n\r\n> Internship programme and business related matters.\r\n\r\nPublic Relations & Marketing (marketing@zfrmheaven.my)\r\n\r\n> Animal adoption, news & media relation, sponsorship and Corporate Social Responsibilities (CSR) \r\n\r\nCustomer Service (customerservice@zfrmheaven.my)\r\n\r\n> Corporate events, family days, birthdays, site rentalsl, visitor related matters and other functions. \r\n\r\nEducation (education@zfrmheaven.my)\r\n\r\n> Tours, education packages, volunteering, research programme and student related matters.\r\n\r\nReception Counter (receptionist@zfrmheaven.my)\r\n\r\n> Opening hours, rates and school concession.");
		txtrAdministrationadmindepartmentzfrmheavenmy.setBackground(Color.LIGHT_GRAY);
		txtrAdministrationadmindepartmentzfrmheavenmy.setBounds(10, 58, 846, 344);
		panel.add(txtrAdministrationadmindepartmentzfrmheavenmy);
	}
}
