import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code="seta2" width=500 height=200></applet>*/
public class seta2 extends Applet
{
	String mess="";
	int x,y;
	public void init()
	{
		x=y=0;
addMouseListener(new MouseAdapter()
{
	public void mouseClicked(MouseEvent e)
	{
		x = e.getX();
		y = e.getY();
			if(e.getButton() ==1)
				mess="Left Button Clicked";
			else if(e.getButton() ==2)
				mess="Middle Button Clicked";
			else if(e.getButton() ==3)
				mess="Right Button Clicked";
		repaint();
	}
		public void mousePressed(MouseEvent e)
		{
			showStatus("Mouse Pressed at ["+e.getX()+","+e.getY()+"]");
		}
});
addMouseMotionListener(new MouseMotionAdapter()
{
			public void mouseMoved (MouseEvent e)
			{
				mess"x= "+e.getX()+" y="+e.getY();
				showStatus(mess);
			}
			public void mouseDragged(MouseEvent e)
			{
				mess="x= "+e.getX()+" y="+e.getY();
				showStatus(mess);
			}
});

		addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent e)
			{
				mess = mess + e.getKeyChar();
				repaint();
			}
		});

	}
			public void paint(Graphics g)
			{
				g.drawString(mess,x,y);
			}
	} 
			/*
			c:\>javac seta2.java

					 
