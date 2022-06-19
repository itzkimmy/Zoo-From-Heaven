import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Payment extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textuserpay;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payment frame = new Payment();
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
	public Payment(String adult, String children,String senior, String citizen, String date, double totalamount) {
		DecimalFormat f = new DecimalFormat("#0.00");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 365);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "PAYMENT METHOD", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 10, 273, 243);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBorder(new TitledBorder(null, "TOTAL TO PAY", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(293, 10, 273, 77);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblttlpay = new JLabel("");
		lblttlpay.setBounds(10, 20, 253, 45);
		lblttlpay.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(lblttlpay);
		
		//will show total user must pay
		JRadioButton rdbtnCard = new JRadioButton("DEBIT CARD / CREDIT CARD");
		rdbtnCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnCard.isSelected())
				{
					String total = Double.toString(totalamount);
					lblttlpay.setText("RM" + total);
				}
			}
		});
		buttonGroup.add(rdbtnCard);
		rdbtnCard.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnCard.setBackground(Color.LIGHT_GRAY);
		rdbtnCard.setBounds(6, 22, 261, 50);
		panel.add(rdbtnCard);
		
		
		//will show total user must pay
		JRadioButton rdbtnOnlineBanking = new JRadioButton("ONLINE BANKING");
		rdbtnOnlineBanking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnOnlineBanking.isSelected())
				{
					String total = Double.toString(totalamount);
					lblttlpay.setText("RM" + total);
				}
				
			}
		});
		buttonGroup.add(rdbtnOnlineBanking);
		rdbtnOnlineBanking.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnOnlineBanking.setBackground(Color.LIGHT_GRAY);
		rdbtnOnlineBanking.setBounds(6, 108, 261, 50);
		panel.add(rdbtnOnlineBanking);
	
		//will show total user must pay
		JRadioButton rdbtnTouchNGo = new JRadioButton("TOUCH N GO E WALLET");
		rdbtnTouchNGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnTouchNGo.isSelected())
				{
					String total = Double.toString(totalamount);
					lblttlpay.setText("RM" + total);
				}
			}
		});
		buttonGroup.add(rdbtnTouchNGo);
		rdbtnTouchNGo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnTouchNGo.setBackground(Color.LIGHT_GRAY);
		rdbtnTouchNGo.setBounds(6, 187, 261, 50);
		panel.add(rdbtnTouchNGo);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "TOTAL USER PAY", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(293, 97, 273, 77);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		textuserpay = new JTextField();
		textuserpay.setBounds(10, 25, 253, 42);
		panel_2.add(textuserpay);
		textuserpay.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "AMOUNT OF CHANGED", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setBounds(293, 184, 273, 69);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblchange = new JLabel("");
		lblchange.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblchange.setBounds(10, 20, 253, 39);
		panel_3.add(lblchange);
		
		//user pay and show change from amount paid
		JButton btnpay = new JButton("PAY");
		btnpay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double change = 0.0;
				double userpay = Double.parseDouble(textuserpay.getText());
				
				change = userpay - totalamount;
				
				if(userpay < totalamount)
				{
					JOptionPane.showMessageDialog(null, "sorry the amount you entered is insufficient");
					lblchange.setText(null);
				}
				else
				{
					lblchange.setText("RM" + f.format(change));
				}	
				
			}
		});
		btnpay.setBackground(Color.WHITE);
		btnpay.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnpay.setBounds(10, 263, 273, 50);
		contentPane.add(btnpay);
		
		JButton btnNewButton = new JButton("PROCEED");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//variable to show at receipt frame
				String userpay = textuserpay.getText();
				String change = lblchange.getText();
				
				
				String amountchange = lblchange.getText();
				
				//cant proceed to receipt if change = null
				if(amountchange == null)
				{
					JOptionPane.showMessageDialog(null, "CANT PROCEED");
				}
				else
				{
					Receipt r = new Receipt(adult, children, senior, citizen, date, totalamount, userpay, change);
					r.show();
					dispose();
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(293, 263, 273, 50);
		contentPane.add(btnNewButton);
		
	}
}
