import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;

public class Receipt extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Receipt frame = new Receipt();
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
	public Receipt(String adult, String children,String senior, String citizen, String date, double totalamount, String userpay, String change) {
		setTitle("RECEIPT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 650);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.WHITE);
		textArea.setBounds(0, 10, 396, 550);
		contentPane.add(textArea);
		
		//will show user the receipt
		JButton btngenerate = new JButton("GENERATE RECEIPT");
		btngenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textArea.setText("*******************************************************************************\n");
				textArea.setText(textArea.getText() + "*                                ZOO FROM HEAVEN RECEIPT                                *\n");
				textArea.setText(textArea.getText() + "*                                   Zoo From Heaven, Malaysia                                    *\n");
				textArea.setText(textArea.getText() + "*                          Tel +60 16-798 1454/ +60 18-390 3621                           *\n");
				textArea.setText(textArea.getText() + "*                                    www.zoofromheaven.com                                      *\n");
				textArea.setText(textArea.getText() + "*******************************************************************************\n");
				
				Date obj = new Date();
				
				String date1 = obj.toString();
				
				textArea.setText(textArea.getText() + "\nDATE / TIME : " + date1 + "\n\n");
				textArea.setText(textArea.getText() + "----------------------------------------------------------------------------------------------\n\n");
				textArea.setText(textArea.getText() + adult + "\n\n");
				textArea.setText(textArea.getText() + children + "\n\n");
				textArea.setText(textArea.getText() + senior + "\n\n");
				textArea.setText(textArea.getText() + "Citizen : " + citizen + "\n\n");
				textArea.setText(textArea.getText() + "Selected Date : " + date + "\n\n");
				textArea.setText(textArea.getText() + "----------------------------------------------------------------------------------------------\n\n");
				textArea.setText(textArea.getText() + "Total Amount : RM" + totalamount + "\n\n");
				textArea.setText(textArea.getText() + "Amount Paid : RM" + userpay + "\n\n");
				textArea.setText(textArea.getText() + "Change : " + change + "\n\n");
				textArea.setText(textArea.getText() + "=====================================================\n\n");
				textArea.setText(textArea.getText() + "                                         PLEASE COME AGAIN.\n");
				textArea.setText(textArea.getText() + "                                         THANK YOU.\n");
				
				
			}
		});
		btngenerate.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btngenerate.setBounds(10, 570, 192, 33);
		contentPane.add(btngenerate);
		
		//will print the receipt if user want
		JButton btnNewButton = new JButton("PRINT");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					textArea.print();
				} catch (PrinterException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(278, 570, 98, 33);
		contentPane.add(btnNewButton);
	}
}
