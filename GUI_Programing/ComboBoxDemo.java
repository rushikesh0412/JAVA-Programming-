import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ComboBoxDemo extends JFrame implements ItemListener
{
	JTextField tf;
	JComboBox cbx;

	ComboBoxDemo()
	{
		setLayout(null);

		String[] sub = new String[]{"C", "C++", "JAVA"};
		
		cbx = new JComboBox(sub);
		cbx.setSize(200,30);
		cbx.setLocation(50,50);
		cbx.addItemListener(this);
		add(cbx);

		tf = new JTextField();
		tf.setSize(200,30);
		tf.setLocation(50,120);
		tf.setEditable(false);
		add(tf);


		setTitle("COMBO-BOX DEMO");
		setSize(500,200);
		setLocation(600,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		String s =(String)cbx.getSelectedItem();
		tf.setText(s);
	}
	public static void main(String args[])
	{
		ComboBoxDemo cbx = new ComboBoxDemo();
	}
}