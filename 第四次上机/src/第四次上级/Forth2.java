package 第四次上级;

import java.awt.event.*;
import javax.swing.*;
public class Forth2 extends JFrame implements ActionListener {
	static Forth2 frm=new Forth2();
	static JButton but1=new JButton();
	static JButton but2=new JButton();
	static JButton but3=new JButton();
	static JButton but4=new JButton();
	static JTextField jtf1=new JTextField();
	static JTextField jtf2=new JTextField();
	static JTextField jtf3=new JTextField();
	public static void main(String[] args) {
		frm.setLayout(null);
		frm.setTitle("运算");
		frm.setLocation(400,600);
		frm.setSize(800,500);
		but1.setBounds(40,40,50,40);
		but2.setBounds(40,100,50,40);
		but3.setBounds(40,160,50,40);
		but4.setBounds(40,220,50,40);
		but1.setText("加");
		but2.setText("减");
		but3.setText("乘");
		but4.setText("除");
		jtf1.setBounds(200,80,100,100);
		jtf2.setBounds(260,80,100,100);
		jtf3.setBounds(320,80,100,100);
		but1.addActionListener(frm);
		but2.addActionListener(frm);
		but3.addActionListener(frm);
		but4.addActionListener(frm);	
		frm.add(but1);
		frm.add(but2);
		frm.add(but3);
		frm.add(but4);
		frm.add(jtf1);
		frm.add(jtf2);
		frm.add(jtf3);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	public void actionPerformed(ActionEvent e)
	{
		String o1=jtf1.getText().trim();
		String o2 =jtf2.getText().trim();
		double a=Double.parseDouble(o1);
		double b=Double.parseDouble(o2);
		JButton bn=(JButton)e.getSource();
		if(bn==but1)
		{
			jtf3.setText(""+(a+b));
		}
		if(bn==but2)
		{
			jtf3.setText(""+(a-b));
		}
		if(bn==but3)
		{
			jtf3.setText(""+(a*b));
		}
		if(bn==but4)
		{
			jtf3.setText(""+(a/b));
		}		
	}
}

