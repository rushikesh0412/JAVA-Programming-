import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class AddStudent extends JFrame implements ActionListener
{
	JLabel l_Name, l_Roll_No, l_Persentage;
	JTextField tf_Name, tf_Roll_No, tf_Persentage;
	JButton b, b_Save, b_Clear;
	ImageIcon i_Validation_Valid, i_Validation_Fail;
	boolean flag=true;

		AddStudent()
		{
			setLayout(null);

			l_Name = new JLabel("Student Name: ");
			l_Name.setSize(150,30);
			l_Name.setLocation(30,30);
			add(l_Name);

			tf_Name = new JTextField();
			tf_Name.setSize(150,30);
			tf_Name.setLocation(200,30);
			add(tf_Name);

			tf_Name.addKeyListener(new KeyAdapter()
			{
					public void keyTyped(KeyEvent ke)
					{
						char ch = ke.getKeyChar();

						if(Character.isLetter(ch))
						{
							return;
						}
						ke.setKeyChar('\b');
					}
			});




			l_Roll_No = new JLabel("Roll No. : ");
			l_Roll_No.setSize(150,30);
			l_Roll_No.setLocation(30,90);
			add(l_Roll_No);

			tf_Roll_No = new JTextField();
			tf_Roll_No.setSize(150,30);
			tf_Roll_No.setLocation(200,90);
			add(tf_Roll_No);

			tf_Roll_No.addKeyListener(new KeyAdapter()
			{
					public void keyTyped(KeyEvent ke)
					{
						char ch = ke.getKeyChar();

						if(Character.isDigit(ch))
						{
							return;
						}
						ke.setKeyChar('\b');
					}
			});


			i_Validation_Valid = new ImageIcon(new ImageIcon("D:\\java\\java program\\GUI_Programing\\Validation.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
			i_Validation_Fail = new ImageIcon(new ImageIcon("D:\\java\\java program\\GUI_Programing\\Validation_Fail.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));



			l_Persentage = new JLabel("Persentage: ");
			l_Persentage.setSize(150,30);
			l_Persentage.setLocation(30,150);
			add(l_Persentage);

			tf_Persentage = new JTextField();
			tf_Persentage.setSize(150,30);
			tf_Persentage.setLocation(200,150);
			add(tf_Persentage);

			b = new JButton(i_Validation_Valid);
			b.setSize(30,30);
			b.setLocation(350,150);
			add(b);


			tf_Persentage.addKeyListener(new KeyAdapter()
			{
					public void keyTyped(KeyEvent ke)
					{
						char ch = ke.getKeyChar();

	
						String s = tf_Persentage.getText();

						if(s.length()<6)
						{	
							if(s.length()<5)
							{


								if(s.startsWith("."))
								{
									tf_Persentage.setText("0.");
								}
								
								if(Character.isDigit(ch) || ch == '.' )
								{
									b.setIcon(i_Validation_Valid);
									//String s = tf.getText();
									if(s.contains(".") && ch =='.')
									{
										b.setIcon(i_Validation_Fail);
										ke.setKeyChar('\b');
									}
									else
									{
										if(s.contains("."))
										{
											flag = true;

										}
										else 
										{
											flag = false;
										}

										if( flag == false && s.length()>=2 && ch !='.' )
										{
											b.setIcon(i_Validation_Fail);
											JOptionPane.showMessageDialog(null, "Invalid Persentage!");

											ke.setKeyChar('\b');
											return;
										}
									}
									return;
								}

								return;
							}
							else if(ch == '%')
							{
								b.setIcon(i_Validation_Valid);
								return;
							}
							else if(ch == '\b')
							{
								b.setIcon(i_Validation_Valid);
							}
							else 
							{
								b.setIcon(i_Validation_Fail);
							}						}
							ke.setKeyChar('\b');	
						
					}
			});

			b_Save = new JButton("Save");
			b_Save.setForeground(new Color(14, 227, 67));
			b_Save.setSize(100,30);
			b_Save.setLocation(60,200);
			b_Save.addActionListener(this);
			add(b_Save);


			b_Clear = new JButton("Clear");
			b_Clear.setForeground(new Color(237, 9, 9));
			b_Clear.setSize(100,30);
			b_Clear.setLocation(200,200);
			b_Clear.addActionListener(this);
			add(b_Clear);


			setTitle("Student Information Validation Demo ~Developed by Rushikesh");
			setSize(600,400);
			setLocation(500,300);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		public void actionPerformed(ActionEvent ae)
		{
			String s = (String)ae.getActionCommand();

			if(s.equals("Save"))
			{
				JOptionPane.showMessageDialog(null, "Save Information Successfully....");
			}
			if(s.equals("Clear"))
			{
				tf_Name.setText("");
				tf_Roll_No.setText("");
				tf_Persentage.setText("");
			}
		}

	public static void main(String []args)
	{
		new AddStudent();
	}
}