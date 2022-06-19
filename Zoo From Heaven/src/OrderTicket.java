import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OrderTicket extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtncitizen, rdbtncitizen2;
	private JLabel lblcategory2, lblcitizen2, lblno2, lblselecteddate1, lbltotalRM1;
	private JLabel dateTime;
	
	//variable to calculate total amount
	double adult = 0.0;
	double children = 0.0;
	double seniorCitizen = 0.0;
	double totalPrice = 0.0;
	double discount = 0.0;
	double totalamount = 0.0;
	String days = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderTicket frame = new OrderTicket();
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
	public OrderTicket() {
		Image icon = new ImageIcon(this.getClass().getResource("/icon.png")).getImage();
		setIconImage(icon);
		DecimalFormat f = new DecimalFormat("#0.00");
		setTitle("Order Ticket");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 783, 530);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);

		//for dynamic clock
		Calendar cals = Calendar.getInstance();
        DateFormat Date = DateFormat.getDateInstance();
        String currentDate = Date.format(cals.getTime());
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "CURRENT TIME", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(188, 10, 363, 76);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel dateTime_1 = new JLabel("Dynamic Clock");
		dateTime_1.setBounds(10, 20, 345, 46);
		panel.add(dateTime_1);
		dateTime_1.setBackground(new Color(255, 255, 255));
		dateTime_1.setForeground(new Color(0, 0, 0));
		dateTime_1.setFont(new Font("DS-Digital", Font.BOLD, 25));
		dateTime_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel3 = new JPanel();
		panel3.setBorder(new TitledBorder(null, "TICKET", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel3.setBackground(Color.LIGHT_GRAY);
		panel3.setBounds(10, 135, 753, 301);
		contentPane.add(panel3);
		panel3.setLayout(null);
		
		JLabel lblcategory = new JLabel("Category :");
		lblcategory.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblcategory.setBounds(10, 30, 85, 19);
		panel3.add(lblcategory);
		
		JLabel lblcitizen = new JLabel("Citizen :");
		lblcitizen.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblcitizen.setBounds(10, 109, 68, 19);
		panel3.add(lblcitizen);

		JPanel panel4 = new JPanel();
		panel4.setBorder(new TitledBorder(null, "TOTAL", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel4.setBounds(366, 10, 379, 276);
		panel3.add(panel4);
		panel4.setLayout(null);
		panel4.setVisible(false);
		
		JLabel lblcategory1 = new JLabel("Category :");
		lblcategory1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblcategory1.setBounds(10, 20, 85, 19);
		panel4.add(lblcategory1);
		
		JLabel lblcitizen1 = new JLabel("Citizen :");
		lblcitizen1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblcitizen1.setBounds(10, 117, 68, 19);
		panel4.add(lblcitizen1);
		
		JLabel lbltotalRM = new JLabel("TOTAL :");
		lbltotalRM.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbltotalRM.setBounds(10, 232, 85, 34);
		panel4.add(lbltotalRM);
		
		JLabel lblcategory2 = new JLabel("");
		lblcategory2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblcategory2.setBounds(101, 20, 264, 19);
		panel4.add(lblcategory2);
		
		JLabel lblcitizen2 = new JLabel("");
		lblcitizen2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblcitizen2.setBounds(101, 117, 264, 19);
		panel4.add(lblcitizen2);
		
		JLabel lbltotalRM1 = new JLabel("");
		lbltotalRM1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbltotalRM1.setBounds(101, 232, 264, 34);
		panel4.add(lbltotalRM1);
		
		JLabel lblcategory3 = new JLabel("");
		lblcategory3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblcategory3.setBounds(101, 49, 264, 19);
		panel4.add(lblcategory3);
		
		JLabel lblcategory4 = new JLabel("");
		lblcategory4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblcategory4.setBounds(101, 78, 264, 19);
		panel4.add(lblcategory4);
		
		JLabel lblselecteddate = new JLabel("Selected Date :");
		lblselecteddate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblselecteddate.setBounds(10, 158, 103, 19);
		panel4.add(lblselecteddate);
		
		JLabel lblselecteddate1 = new JLabel("");
		lblselecteddate1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblselecteddate1.setBounds(123, 158, 242, 19);
		panel4.add(lblselecteddate1);
		
		//add price to radiobutton malaysian
		JRadioButton rdbtncitizen = new JRadioButton("Malaysian");
		rdbtncitizen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtncitizen.isSelected())
				{
					adult = 45.00;
					children = 18.00;
					seniorCitizen = 23.00;
				}
			}
		});
		rdbtncitizen.setBackground(Color.LIGHT_GRAY);
		buttonGroup.add(rdbtncitizen);
		rdbtncitizen.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtncitizen.setBounds(191, 108, 103, 21);
		panel3.add(rdbtncitizen);
		
		//add price to radiobutton international
		JRadioButton rdbtncitizen2 = new JRadioButton("International");
		rdbtncitizen2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtncitizen2.isSelected())
				{
					adult = 88.00;
					children = 43.00;
					seniorCitizen = 88.00;
				}
			}
		});
		rdbtncitizen2.setBackground(Color.LIGHT_GRAY);
		buttonGroup.add(rdbtncitizen2);
		rdbtncitizen2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtncitizen2.setBounds(191, 131, 111, 21);
		panel3.add(rdbtncitizen2);
		
		JSpinner spinnerAdult = new JSpinner();
		spinnerAdult.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinnerAdult.setFont(new Font("Tahoma", Font.PLAIN, 15));
		spinnerAdult.setBounds(193, 29, 109, 20);
		panel3.add(spinnerAdult);
		
		JSpinner spinnerChild = new JSpinner();
		spinnerChild.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinnerChild.setFont(new Font("Tahoma", Font.PLAIN, 15));
		spinnerChild.setBounds(193, 55, 109, 20);
		panel3.add(spinnerChild);
		
		JSpinner spinnerSenior = new JSpinner();
		spinnerSenior.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinnerSenior.setFont(new Font("Tahoma", Font.PLAIN, 15));
		spinnerSenior.setBounds(193, 78, 109, 20);
		panel3.add(spinnerSenior);
		
		JLabel lbladult = new JLabel("Adult");
		lbladult.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbladult.setBounds(81, 33, 45, 13);
		panel3.add(lbladult);
		
		JLabel lblchildren = new JLabel("Children");
		lblchildren.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblchildren.setBounds(81, 59, 61, 13);
		panel3.add(lblchildren);
		
		JLabel lblsnr = new JLabel("Senior Citizen");
		lblsnr.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblsnr.setBounds(81, 82, 103, 13);
		panel3.add(lblsnr);
		
		JComboBox comboBoxdate = new JComboBox();
		comboBoxdate.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBoxdate.setModel(new DefaultComboBoxModel(new String[] {"", "WEEKDAYS", "WEEKEND", "SCHOOL HOLIDAYS"}));
		comboBoxdate.setBounds(135, 172, 167, 21);
		panel3.add(comboBoxdate);
		
		//when user click total button, it will calculate and show total price
		JButton btntotal = new JButton("TOTAL");
		btntotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int totalAdult = (int) spinnerAdult.getValue();
				int totalChild = (int) spinnerChild.getValue();
				int totalSenior = (int) spinnerSenior.getValue();
				
				lblcategory2.setText("Adult : " + totalAdult);
				lblcategory3.setText("Children : " + totalChild);
				lblcategory4.setText("Senior Citizen : " + totalSenior);
				
				totalPrice = (totalAdult*adult) + (totalChild*children) + (totalSenior*seniorCitizen);
				totalamount = totalPrice - (totalPrice * discount);
				
				if(rdbtncitizen.isSelected())
				{
					lblcitizen2.setText("Malaysian");
				}
				else
				{
					lblcitizen2.setText("International");
				}
				
				if(((String)comboBoxdate.getSelectedItem()).equals("WEEKDAYS"))
				{
					discount = 0.00;
					days = "WEEKDAYS";
					lblselecteddate1.setText("" + days);
					lbltotalRM1.setText("RM" + f.format(totalamount));
					panel4.setVisible(true);
				}
				else if(((String)comboBoxdate.getSelectedItem()).equals(""))
				{
					JOptionPane.showMessageDialog(null, "cant proceed, please select the date");
					lbltotalRM1.setText(null);
					panel4.setVisible(false);
				}
				else if(((String)comboBoxdate.getSelectedItem()).equals("WEEKEND"))
				{
					discount = 0.15;
					days = "WEEKEND";
					lblselecteddate1.setText("" + days);
					lbltotalRM1.setText("RM" + f.format(totalamount));
					panel4.setVisible(true);
				}
				else if(((String)comboBoxdate.getSelectedItem()).equals("SCHOOL HOLIDAYS"))
				{
					discount = 0.20;
					days = "SCHOOL HOLIDAYS";
					lblselecteddate1.setText("" + days);
					lbltotalRM1.setText("RM" + f.format(totalamount));
					panel4.setVisible(true);
				}	
				
			}
		});
		
		btntotal.setFont(new Font("Tahoma", Font.BOLD, 15));
		btntotal.setBounds(135, 249, 103, 37);
		panel3.add(btntotal);
		
		JLabel lbldate = new JLabel("Select Date :");
		lbldate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbldate.setBounds(10, 174, 91, 19);
		panel3.add(lbldate);
		
		//button to reset all that shown on frame
		JButton btnreset = new JButton("RESET");
		btnreset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				spinnerAdult.setValue(0);
				spinnerChild.setValue(0);
				spinnerSenior.setValue(0);
				rdbtncitizen.setSelected(false);
				rdbtncitizen2.setSelected(false);
				comboBoxdate.setSelectedIndex(0);
				lblcategory2.setText(null);
				lblcategory3.setText(null);
				lblcategory4.setText(null);
				lblselecteddate1.setText(null);
				lbltotalRM1.setText(null);
				panel4.setVisible(false);
			}
		});
		btnreset.setBounds(164, 456, 85, 21);
		contentPane.add(btnreset);
		
		JButton btnnext = new JButton("PROCEED");
		btnnext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//variable to show to receipt
				String adult = lblcategory2.getText();
				String children = lblcategory3.getText();
				String senior = lblcategory4.getText();
				String citizen = lblcitizen2.getText();
				String date = lblselecteddate1.getText();
				
				String total = lbltotalRM1.getText();;
				
				if(total == null)  //if total = null, cant proceed to payment
				{
					JOptionPane.showMessageDialog(null, "PLEASE SELECT DATE");
				}
				else
				{
					Payment p = new Payment(adult, children, senior, citizen, date, totalamount);
					p.show();
					
					dispose();
				}	
			}
		});
		btnnext.setBounds(524, 456, 108, 21);
		contentPane.add(btnnext);

        Thread clock  = new Thread(){
            public void run(){
                for(;;){
                    //empty for will run forever
                    //System.out.print("p");
                    Calendar cal = new GregorianCalendar();

                    int month = cal.get(Calendar.MONTH);
                    int year = cal.get(Calendar.YEAR);
                    int day = cal.get(Calendar.DAY_OF_MONTH);

                    int second = cal.get(Calendar.SECOND);
                    int minute = cal.get(Calendar.MINUTE);
                    int hour = cal.get(Calendar.HOUR);

                    dateTime_1.setText(day+"/"+(((month+1)<10)?"0"+(month+1):(month+1))+"/"+year+"  "
                            + hour+":"+minute+":"+second
                            );

                        try {
                            sleep(1000);//1000 miliseconds it will sleep which means one second sleep
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                        }
                }
            }
            };
            clock.start();
	}
}
