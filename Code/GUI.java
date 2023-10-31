import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ass5 extends JFrame implements ActionListener,ItemListener
{
	JLabel l1,l2,l3;
	JTextField t1,t2;
	JCheckBox c1,c2,c3;
	JRadioButton r1,r2,r3;
	ButtonGroup bg;
	String p="";
	
	ass5()
	{
		super("demo");
		setSize(500,500);
		setLocation(300,300);
		setLayout(null);

		l1=new JLabel("Enter Name:");
		l2=new JLabel("Enter Class:");
		l3=new JLabel("Enter Hobbies:");
		
		t1=new JTextField(40);
		t2=new JTextField(40);
		
		c1=new JCheckBox("MUSIC");
		c2=new JCheckBox("DANCE");
		c3=new JCheckBox("SPORT");
		
		bg=new ButtonGroup();
		r1=new JRadioButton("FY"); 
		r2=new JRadioButton("SY");
		r3=new JRadioButton("TY");
		
		add(l1);
		add(l2);
		add(l3);
		
		add(t1);
		add(t2);
		
		add(r1);
		add(r2);
		add(r3);
		
		add(c1);
		add(c2);
		add(c3);
		
		bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		
		l1.setBounds(50,50,80,20);
		t1.setBounds(140,50,100,20);
		
		l2.setBounds(50,80,100,20);
		
		r1.setBounds(50,110,110,20);
		r2.setBounds(50,140,100,20);
		r3.setBounds(50,170,100,20);
		
		l3.setBounds(170,80,100,20);
		c1.setBounds(170,110,100,20);
		c2.setBounds(170,140,100,20);
		c3.setBounds(170,170,100,20);
		
		t2.setBounds(50,200,250,30);
		
		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		}
		
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==r1)
			{
			p="Name="+t1.getText()+",Class="+e.getActionCommand();
			}
			if(e.getSource()==r2)
			{
			p="Name="+t1.getText()+",Class="+e.getActionCommand();
			}
			if(e.getSource()==r3)
			{
			p="Name="+t1.getText()+",Class="+e.getActionCommand();
			}
			
			t2.setText(p);
		}
		
public void itemStateChanged(ItemEvent e)
{
	String mess=" Hobbies: ";

	if(c1.isSelected())
		mess=mess+" MUSIC "; 
	if(c2.isSelected())
		mess=mess+" DANCE "; 
	if(c3.isSelected())
		mess=mess+" SPORT "; 

		t2.setText(p+""+mess);
	}
}

class setb1
{
		public static void main(String args[])
		{
			new ass5();
		}
}
		
		
		
		
		
		
		
