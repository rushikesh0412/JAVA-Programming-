import javax.swing.*;
import java.awt.event.*;
import java.awt.*;       //for color


class FirstScreen extends JFrame implements ActionListener
{
	JLabel l, l2;
	JTextField tf, tf2;
	JButton b1,b2;

	FirstScreen()
	{
		setLayout(null);

		//Colors
		Color green = new Color(0,255,0);
		Color red = new Color(255,0,0);
		Color blue = new Color(255,0,0);

		//Font
		Font f = new Font("Aparajita", Font.BOLD,20);


		l = new JLabel("Student Name: ");
		l.setFont(f);
		l.setForeground(blue);
		l.setSize(130,30);
		l.setLocation(50,30);
		add(l);

		tf = new JTextField();
		tf.setBackground(new Color(237, 141, 31));
		//tf.setEditable(false);
		tf.setFont(f);
		tf.setSize(200,30);
		tf.setLocation(200,30);
		add(tf);


		b1 = new JButton("OK");
		b1.addActionListener(this);
		b1.setFont(f);
		b1.setForeground(green);
		b1.setSize(100,30);
		b1.setLocation(50,80);
		add(b1);

		b2 = new JButton("Clear");
		b2.addActionListener(this);
		b2.setFont(f);
		b2.setForeground(red);
		b2.setSize(100,30);
		b2.setLocation(300,80);
		add(b2);

		l2 = new JLabel("Acknowledgement: ");
		l2.setFont(f);
		l2.setForeground(red);
		l2.setSize(150,30);
		l2.setLocation(50,130);
		add(l2);

		tf2 = new JTextField();
		tf2.setBackground(new Color(237, 141, 31));
		//tf2.setEditable(false);
		tf2.setFont(f);
		tf2.setSize(200,30);
		tf2.setLocation(200,130);
		add(tf2);


		//Frame
		setTitle("Developed by Rushikesh Shinde");
		setSize(500,300);
		setLocation(200,200);
		setVisible(true);
		//setResizable(false);       //unable to screen maximize
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent ae)
	{
		String s = ae.getActionCommand();
		if(s.equals("OK"))
		{
			tf2.setText("Sent Successfully...");
		}
		if(s.equals("Clear"))
		{
			String str = tf.getText();
			//tf.setText("");
			tf.setText(str.toLowerCase());
			tf2.setText("Clear Successfully...");
		}
		

	}

/*
	public static void main(String []args)
	{
		FirstScreen ob = new FirstScreen();
	}
	*/
}









/*
Enter a number1 :
Enter a number2 : 
Answer        :   //Editable flase

add sub mul div mod

Clear

*/