package 第四次上级;
import java.awt.event.*;
import javax.swing.*;
public class Forth1 extends JFrame implements ActionListener {
	static Forth1 frm=new Forth1();
	static JButton but=new JButton();
	static int i=0;
	public static void main(String[] args) {
		frm.setLayout(null);
		frm.setTitle("操作");
		frm.setLocation(300,300);
		frm.setSize(260,260);
		but.setBounds(40,50,200,100);
		but.setText("click me!");
		but.addActionListener(frm);
		frm.add(but);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	public void actionPerformed(ActionEvent e)
	{
		if(i%2==0)
		but.setText("click me again");
		else
			but.setText("click me!");
		i++;
			
	}
}