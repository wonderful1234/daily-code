package ��14����ҵ;

import java.awt.event.*;
import javax.swing.*;
public class App14_6 extends JFrame implements ActionListener {
	static App14_6 frm=new App14_6();
	static JButton but=new JButton();
	static int i=0;
	public static void main(String[] args) {
		frm.setLayout(null);
		frm.setTitle("����");
		frm.setLocation(300,300);
		frm.setSize(260,260);
		but.setBounds(40,50,200,100);
		but.setText("�������"+i+"��");
		but.addActionListener(frm);
		frm.add(but);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	public void actionPerformed(ActionEvent e)
	{
		i+=1;
		but.setText("�������"+i+"��");
	}
}
