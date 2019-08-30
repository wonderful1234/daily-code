package 第四次上级;

import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;

public class Forth5 {
	public static void main(String args[]) {
		new winopen();
	}
}

class winopen extends JFrame implements ActionListener {
	JMenu menu;
	JMenuBar mb;
	JMenuItem mi;
	JTextArea text;

	winopen() {
		mi = new JMenuItem("打开文件");
		mi.addActionListener(this);
		menu = new JMenu("菜单");
		menu.add(mi);
		mb = new JMenuBar();
		mb.add(menu);
		setJMenuBar(mb);
		text = new JTextArea();
		add(new JScrollPane(text), BorderLayout.CENTER);
		setTitle("打开文件");
		setBounds(400, 150, 400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		validate();
	}
	public void actionPerformed(ActionEvent e) {
		openfile op = new openfile();
		text.setText(op.open());
	}
}

class openfile {
	public String open() {
		File file = new File("bin/第四次上级/hello.txt");
		int n = 0;
		char b[] = new char[100];
		StringBuffer sb = new StringBuffer(new String(""));
		try {
			FileReader reader = new FileReader(file);
			while ((n = reader.read(b, 0, 10)) != -1) {
				sb.append(new String(b, 0, n));
			}
			reader.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		return sb.toString();
	}
}
