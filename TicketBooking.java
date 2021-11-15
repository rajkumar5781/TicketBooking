import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.GraphicsDevice;
class TicketBooking implements ActionListener
{
	JFrame f;
	JTextField t,t1,t2,t3;
		JButton b,b1;
		ImageIcon img;
		JLabel l1,l2,l3,l4,l5;
		JPasswordField p1;
		JRadioButton rb1,rb2;
		ButtonGroup bg; 
		JLabel La,la1;
		JComboBox cb;
		JCheckBox checkbox1,checkbox2,checkbox3,checkbox4;
		ex1()
		{
		 f=new JFrame();
		 La=new JLabel("Railway reservasion From");
		 La.setBounds(300,10,150,80);
		 String country[]={"Tejas Express","Duronto Express","Rajdhani Express","Shatabdi Express","Garib Rath Express"};        
		 cb=new JComboBox(country);    
    	 cb.setBounds(10,10,120,20);
		 checkbox1=new JCheckBox("FirstAC");
		 checkbox2=new JCheckBox("SecondAC");
		 checkbox3=new JCheckBox("Sleeper");
		 checkbox4=new JCheckBox("sitter");
		 checkbox1.setBounds(450,90,100,20);
		 checkbox2.setBounds(450,120,100,20);
		 checkbox3.setBounds(450,150,100,20);
		 checkbox4.setBounds(450,180,100,20);
		 f.setTitle("Railways");
		 bg=new ButtonGroup();
	//	img=new ImageIcon("295875.jpg");
		 l3=new JLabel("",img,JLabel.CENTER);
		 l3.setBounds(0,0,1920,1080);
		 f.add(l3);
		 l1=new JLabel("NAME:");
		 l1.setForeground (Color.red);
		 l2=new JLabel("AGE:");
		 l2.setBounds(20,110,100,100);
		 l4=new JLabel("GENDER:");
		 l4.setBounds(20,170,100,100);
		 rb1=new JRadioButton("Male");
		 bg.add(rb1);
		 rb1.setBounds(80,170,100,100);
		 rb2=new JRadioButton("Female");
		 bg.add(rb2);
		 rb2.setBounds(180,170,100,100);
		 l5=new JLabel("NO.OF.SEATS:");
		 l5.setBounds(20,230,100,100);
		 t2=new JTextField("");
		 t2.setBounds(120,270,100,20);
		 t=new JTextField("");
		 t.setBounds(80,90,100,20);
		 t1=new JTextField("");
		 t1.setBounds(80,150,100,20);
		 la1=new JLabel("TotalAmount:");
		 la1.setBounds(300,300,100,20);
		 t3=new JTextField("");
		 t3.setBounds(400,300,100,20);
		 l1.setSize(50,50);
		 l1.setBounds(20,50,100,100);
		 b=new JButton("Conformation");
		 b.setBounds(300,350,100,20);
		 b.addActionListener(this);
		 f.add(l1);
		 f.add(t);
		 f.add(t1);
		 f.add(t2);
		 f.add(l2);
		 f.add(l4);
		 f.add(l5);
		 f.add(rb1);
		 f.add(rb2);
		 f.add(b);
		 f.add(t3);
		 f.add(La);
		 f.add(la1);
		 f.add(cb);
		 f.add(checkbox1);
		 f.add(checkbox2);
		 f.add(checkbox3);
		 f.add(checkbox4);
		 f.setSize(800,500);
		 f.setLayout(null);
		 f.setVisible(true);
		 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
public void actionPerformed(ActionEvent e)
{
	int x = 0,b;
	String c;
	try {
		x = Integer.parseInt(t2.getText());
		b=x*50;
		c=Integer.toString(b);
		t3.setText(c);
		t.setText("");
		t1.setText("");
		t2.setText("");
	} catch (NumberFormatException ea) {
		System.out.println("Not a number");
	}
}
public static void main(String[] args) {
		 new ex1();
			}
}