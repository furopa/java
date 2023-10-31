import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculatorevent extends JFrame implements ActionListener
{
	JTextField tf;
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bdot,bequal,badd,bsub,bmul,bdiv;
	JPanel p1,p2;
	String s0="",s1="",s2="";
	
	calculatorevent()
	{
	
	tf = new JTextField(20); 
	
	b0 = new JButton("0");
	b1 = new JButton("1");
	b2 = new JButton("2");	
	b3 = new JButton("3");
	b4 = new JButton("4");
	b5 = new JButton("5");
	b6 = new JButton("6");
	b7 = new JButton("7");
	b8 = new JButton("8");
	b9 = new JButton("9");
	
	b0.addActionListener(this);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	b6.addActionListener(this);
	b7.addActionListener(this);
	b8.addActionListener(this);
	b9.addActionListener(this);
		
	bdot = new JButton(".");
	bequal = new JButton("=");
	badd = new JButton("+");
	bsub = new JButton("-");
	bmul = new JButton("*");
	bdiv = new JButton("/");
	
	bdot.addActionListener(this);
	bequal.addActionListener(this);
	badd.addActionListener(this);
	bsub.addActionListener(this);
	bmul.addActionListener(this);
	bdiv.addActionListener(this); 
	
	p1 = new JPanel();
	p1.setLayout(new FlowLayout());
	p1.add(tf);
	
	p2 = new JPanel();
	p2.setLayout(new GridLayout(4,4));
	
	p2.add(b1);p2.add(b2);p2.add(b3);p2.add(badd);
	p2.add(b4);p2.add(b5);p2.add(b6);p2.add(bsub);
	p2.add(b7);p2.add(b8);p2.add(b9);p2.add(bmul);
	p2.add(b0);p2.add(bdot);p2.add(bequal);p2.add(bdiv);
	
	setLayout(new FlowLayout());
	add(p1);
	add(p2);

	setTitle("Java Calculator");
	setSize(250,200);
	setVisible(true);
	setResizable(false);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	
 	public void actionPerformed(ActionEvent ae)
	{ 
		 String s = ae.getActionCommand();
 
        // if the value is a number

        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') 
        {
            // if operand is present then add to second no
            if (!s1.equals(""))
                s2 = s2 + s;
            else
                s0 = s0 + s;
 
            // set the value of text
            tf.setText(s0 + s1 + s2);
        }
        
        else if (s.charAt(0) == '=') {
 
            double te;
 
            // store the value in 1st
            if (s1.equals("+"))
                te = (Double.parseDouble(s0) + Double.parseDouble(s2));
            else if (s1.equals("-"))
                te = (Double.parseDouble(s0) - Double.parseDouble(s2));
            else if (s1.equals("/"))
                te = (Double.parseDouble(s0) / Double.parseDouble(s2));
            else
                te = (Double.parseDouble(s0) * Double.parseDouble(s2));
 
            // set the value of text
            tf.setText(s0 + s1 + s2 + "=" + te);
 
            // convert it to string
            s0 = Double.toString(te);
 
            s1 = s2 = "";
        }
        else {
            // if there was no operand
            if (s1.equals("") || s2.equals(""))
                s1 = s;
            // else evaluate
            else {
                double te;
 
                // store the value in 1st
                if (s1.equals("+"))
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));
                else if (s1.equals("-"))
                    te = (Double.parseDouble(s0) - Double.parseDouble(s2));
                else if (s1.equals("/"))
                    te = (Double.parseDouble(s0) / Double.parseDouble(s2));
                else
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2));
 
                // convert it to string
                s0 = Double.toString(te);
 
                // place the operator
                s1 = s;
 
                // make the operand blank
               s2 = "";
            }
 
            // set the value of text
            tf.setText(s0 + s1 + s2);
        }
    }

			
	public static void main(String args[])
	{
		new calculatorevent();
	}
}
	
