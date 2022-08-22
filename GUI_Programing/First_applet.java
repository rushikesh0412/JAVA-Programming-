import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class First_applet extends JApplet implements ActionListener
{
	JTextField tf;
	JButton b;

	int n1,n2, sum;
	public void init()
	{
		setLayout(null);

		n1 = Integer.parseInt(getParameter("n1"));
		n2 = Integer.parseInt(getParameter("n2"));
		sum = n1 +n2;


		tf = new JTextField();
		tf.setSize(150,30);
		tf.setLocation(100,50);
		add(tf);



		b = new JButton("Show");
		b.setSize(100,30);
		b.setLocation(250,120);
		b.addActionListener(this);
		add(b);

	}
	public void actionPerformed(ActionEvent ae)
	{
		String s = ae.getActionCommand();

		if(s.equals("Show"))
		{
			tf.setText("Hello World!");
			b.setText("Hide");
		}
		if(s.equals("Hide"))
		{
			tf.setText("");
			b.setText("Show");
		}
		
	}
/*
  public void paint(Graphics g)
  {
    g.drawString("Addition of two number is "+ sum, 20, 10);
  }
*/
}


/*
<html>
<body>
	<applet code = "First_applet.class" width = 500 height=500>
		<param name="n1" value="30"/>
		<param name="n2" value="100"/>

	</applet>
</html>
</body>

*/