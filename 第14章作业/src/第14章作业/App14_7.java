package ��14����ҵ;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.event.ListSelectionListener;
public class App14_7 extends JFrame implements ListSelectionListener {
	private JList<String>list;
	private JTextField tf=new JTextField();
	private String [] program= {"����","JAVA����","ģ����Ӽ���","�㷨�����ݽṹ","Ӣ��"};
	private String s1= "�����Ǵ�ѧ���ı��޿�";
	private String s2="JAVA�Ǹ߼���������";
	private String s3="ģ����Ӽ����ǵ�·��ƵĻ���";
	private String s4="�㷨�ǰ�ʵ������ת��Ϊ��������ԵĹؼ�";
	private String s5="Ӣ�������ǽ����Ĺ���";
	
	public App14_7(String s)
	{
		super(s);
		list=new JList<String>(program);
		JScrollPane ps=new JScrollPane(list);
		list.addListSelectionListener(this);
		add(ps,BorderLayout.CENTER);
		add(tf,BorderLayout.NORTH);
		setSize(200,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		App14_7 frm=new App14_7("�γ̽���");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void valueChanged(ListSelectionEvent e)
	{
		JList lt=(JList)e.getSource();
		String clr=(String)lt.getSelectedValue();
		if(clr=="����")
			tf.setText(s1);
		else if(clr=="JAVA����")
			tf.setText(s2);
		else if(clr=="ģ����Ӽ���")
			tf.setText(s3);
		else if(clr=="�㷨�����ݽṹ")
			tf.setText(s4);
		else if(clr=="Ӣ��")
			tf.setText(s5);		
	}
}
