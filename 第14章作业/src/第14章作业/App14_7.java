package 第14章作业;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.event.ListSelectionListener;
public class App14_7 extends JFrame implements ListSelectionListener {
	private JList<String>list;
	private JTextField tf=new JTextField();
	private String [] program= {"高数","JAVA技术","模拟电子技术","算法与数据结构","英语"};
	private String s1= "高数是大学生的必修课";
	private String s2="JAVA是高级程序语言";
	private String s3="模拟电子技术是电路设计的基础";
	private String s4="算法是把实际问题转化为计算机语言的关键";
	private String s5="英语是我们交流的工具";
	
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
		App14_7 frm=new App14_7("课程介绍");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void valueChanged(ListSelectionEvent e)
	{
		JList lt=(JList)e.getSource();
		String clr=(String)lt.getSelectedValue();
		if(clr=="高数")
			tf.setText(s1);
		else if(clr=="JAVA技术")
			tf.setText(s2);
		else if(clr=="模拟电子技术")
			tf.setText(s3);
		else if(clr=="算法与数据结构")
			tf.setText(s4);
		else if(clr=="英语")
			tf.setText(s5);		
	}
}
