

import javax.swing.*;

public class App13_10 {
	static JFrame jfram=new JFrame("�������");
	public static void main(String[] args) {
		JTextField jtf=new JTextField("��ѡ�����Լ�ϲ����",30);
		JCheckBox jchk1=new JCheckBox("����");
		JCheckBox jchk2=new JCheckBox("�Ƽ�");
		JCheckBox jchk3=new JCheckBox("����");
		JRadioButton jrb1=new JRadioButton("20����");
		JRadioButton jrb2=new JRadioButton("60����");
		JLabel jlab=new JLabel("ѡ������?",JLabel.LEFT);
		JButton btn=new JButton("ȷ��");
		ButtonGroup grp=new ButtonGroup();
		jfram.setLayout(null);
		jfram.setLocation(400,200);
		jfram.setSize(350,350);
		jtf.setBounds(20,20,150,20);
		jchk1.setBounds(20,40,150,20);
		jchk2.setBounds(20,60,150,20);
		jchk3.setBounds(20,80,150,20);
		jrb1.setBounds(20,100,150,20);
		jrb2.setBounds(20,120,150,20);
		jlab.setLocation(10,170);
		jlab.setSize(150,20);
		btn.setBounds(100,170,150,20);
		grp.add(jrb1);
		grp.add(jrb2);
		jfram.add(jtf);
		jfram.add(jchk1);
		jfram.add(jchk2);
		jfram.add(jchk3);
		jfram.add(jrb1);
		jfram.add(jrb2);
		jfram.add(jlab);
		jfram.add(btn);
		jfram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfram.setVisible(true);	
	}	
}
