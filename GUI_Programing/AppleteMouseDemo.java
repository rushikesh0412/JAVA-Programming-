import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AppleteMouseDemo extends JApplet
{
	public int x,y;



 	public void init()
 	{

 		addMouseListener(new MouseAdapter()
 		{
 			public void mouseClicked(MouseEvent me)
 			{
 				x = me.getX();
 				y = me.getY();



 				//repaint();
 			}
 		});
 	}

 	public void paint(Graphics g)
 	{
 		
 		//g.fillRect(x,y,100,20);
 		//g.drawRect(x,y,100,20);
 		g.drawString("India Flag", 280, 80);

 		

 		g.setColor(Color.ORANGE);
 		g.fillRect(200,100,200,50);
 		g.setColor(Color.BLACK);
 		g.drawRect(200,100,200,50);

 		g.setColor(Color.BLUE);
 		g.fillOval(275,150,60,60);
 		g.setColor(Color.BLACK);
 		g.drawOval(275,150,60,60);

 		g.setColor(Color.GREEN);
 		g.fillRect(200,210,200,50);
 		g.setColor(Color.BLACK);
 		g.drawRect(200,210,200,50);

 		g.setColor(Color.BLACK);
 		g.drawLine(200,100,200,600);
 		g.drawLine(400,100,400,260);

 		g.setColor(Color.BLACK);
 		g.drawRect(150,600,100,30);
 		g.drawRect(100,630,200,30);




 	}
}