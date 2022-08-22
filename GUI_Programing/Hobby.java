import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Hobby extends JFrame implements ActionListener
{
	JCheckBox cb1, cb2, cb3;
	JTextField tf;
	JButton b1, b2;
	//JRedioButton rb1;

	Hobby()
	{
		setLayout(null);

		//Check Box
		cb1 = new JCheckBox("FY");
		cb1.setSize(100,30);
		cb1.setLocation(30,30);
		add(cb1);

		cb2 = new JCheckBox("SY");
		cb2.setSize(100,30);
		cb2.setLocation(30,60);
		add(cb2);

		cb3 = new JCheckBox("TY");
		cb3.setSize(100,30);
		cb3.setLocation(30,90);
		add(cb3);

		//Text Field
		tf = new JTextField();
		tf.setSize(100,30);
		tf.setLocation(180,90);
		add(tf);

		//Button
		b1 = new JButton("OK");
		b1.addActionListener(this);
		b1.setSize(100,30);
		b1.setLocation(100,150);
		add(b1);



		//Frame
		setTitle("Hobby");
		setSize(500,300);
		setLocation(600,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void actionPerformed(ActionEvent ae)
	{
		String s = ae.getActionCommand();

		if(s.equals("OK"))
		{
			String str = "";
			if(cb1.isSelected())
			{
				str = str + cb1.getText() + " ";
			}
			if(cb2.isSelected())
			{
				str = str + cb2.getText() + " ";
			}
			if(cb3.isSelected())
			{
				str = str + cb3.getText() + " ";
			}
			tf.setText(str);
		}
	}

	public static void main(String args[])
	{
		new Hobby();
	}
}