import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Hobby1 extends JFrame implements ActionListener
{
	JRadioButton rb1, rb2, rb3;
	ButtonGroup bg;
	JTextField tf;

	Hobby1()
	{
		setLayout(null);

		//Check Box
		rb1 = new JRadioButton("FY");
		rb1.addActionListener(this);
		rb1.setSize(100,30);
		rb1.setLocation(30,30);
		add(rb1);

		rb2 = new JRadioButton("SY");
		rb2.addActionListener(this);
		rb2.setSize(100,30);
		rb2.setLocation(30,60);
		add(rb2);

		rb3 = new JRadioButton("TY");
		rb3.addActionListener(this);
		rb3.setSize(100,30);
		rb3.setLocation(30,90);
		add(rb3);


		bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);


		//Text Field
		tf = new JTextField();
		tf.setSize(100,30);
		tf.setLocation(180,90);
		tf.setEditable(false);
		add(tf);

/*
		//Button
		b1 = new JButton("OK");
		b1.addActionListener(this);
		b1.setSize(100,30);
		b1.setLocation(100,150);
		add(b1);

*/



		//Frame
		setTitle("Year RadioButton Demo");
		setSize(500,300);
		setLocation(600,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void actionPerformed(ActionEvent ae)
	{
		String s = (String) ae.getActionCommand();

		tf.setText(s);
	}

	public static void main(String args[])
	{
		new Hobby1();
	}
}
