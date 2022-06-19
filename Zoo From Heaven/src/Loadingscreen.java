import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
 
public class Loadingscreen {
	
	Color sem = new Color(0, 95, 115);
	
    JFrame frame;
    JProgressBar progressBar=new JProgressBar();
    JLabel lblloading=new JLabel();//Crating a JLabel for displaying the message
    private final JLabel lbllogo = new JLabel("");
    Loadingscreen()
    {
        createGUI();
        addProgressBar();
        addMessage();
        runningPBar();
    }
    public void createGUI(){
        frame=new JFrame();
        Image logotest = new ImageIcon(this.getClass().getResource("/logo.png")).getImage();
        frame.setIconImage(logotest);
        frame.getContentPane().setLayout(null);
        frame.setUndecorated(true);
        frame.setSize(900,500);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(sem);
        frame.setVisible(true);
 
    }
    
    public void addMessage()
    {
        lblloading.setText("Loading Please Wait...");
        lblloading.setBackground(Color.BLACK);
        lblloading.setBounds(20,420,210,40);//Setting the size and location of the label
        lblloading.setForeground(Color.black);//Setting foreground Color
        lblloading.setFont(new Font("Arial", Font.BOLD, 20));//Setting font properties
        frame.getContentPane().add(lblloading);
        {
        	Image logo = new ImageIcon(this.getClass().getResource("/logo.png")).getImage();
    		lbllogo.setIcon(new ImageIcon(logo));
        	lbllogo.setBounds(215, 46, 411, 444);
        	frame.getContentPane().add(lbllogo);
        }
    }
    public void addProgressBar(){
        progressBar.setBounds(-11,470,911,30);
        progressBar.setBorderPainted(true);
        progressBar.setStringPainted(true);
        progressBar.setBackground(Color.WHITE);
        progressBar.setForeground(Color.BLACK);
        progressBar.setValue(0);
        frame.getContentPane().add(progressBar);
    }
    public void runningPBar(){
        int i=0;//Creating an integer variable and intializing it to 0
 
        while( i<=100)
        {
            try{
                Thread.sleep(50);//Pausing execution for 50 milliseconds
                progressBar.setValue(i);//Setting value of Progress Bar
                lblloading.setText("Loading Please Wait...");//Setting text of the message JLabel
                i++;
                if(i==100)
                    frame.dispose();
            }catch(Exception e){
                e.printStackTrace();
            }
 
 
 
        }
    }
}