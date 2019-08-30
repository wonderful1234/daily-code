package 题;
import java.awt.Container;
import java.net.NetworkInterface;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class App13_14 {
	public static void main(String[] args) {
		JFrame frm=new JFrame("盒式布局管理器");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setSize(220,130);
		Container app= frm.getContentPane();
		BoxLayout bl=new BoxLayout(app, BoxLayout.X_AXIS);
		frm.setLayout(bl);
		JButton but;
		for (int i = 1; i < 4; i++) {
			but=new JButton("按钮"+i);
			frm.add(but);	
		}
		frm.setVisible(true);	
	}
	
}
