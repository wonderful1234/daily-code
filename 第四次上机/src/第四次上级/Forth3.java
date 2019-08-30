package 第四次上级;
import java.awt.event.*;
import javax.swing.*;
public class Forth3 extends JFrame implements ActionListener {
	static Forth3 frm=new Forth3();
	static JButton but1=new JButton();
	static JTextField jtf1=new JTextField();
	static JTextField jtf2=new JTextField();
	public static void main(String[] args) {
		frm.setLayout(null);
		frm.setTitle("复制");
		frm.setLocation(400,600);
		frm.setSize(800,500);
		but1.setBounds(400,100,60,60);
		jtf1.setBounds(200,80,100,100);
		jtf2.setBounds(200,190,100,100);
		but1.setText("点我");
		but1.addActionListener(frm);	
		frm.add(but1);
		frm.add(jtf1);
		frm.add(jtf2);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	public void actionPerformed(ActionEvent e)
	{
		String o1=jtf1.getText();
		jtf2.setText(o1);
	}
}