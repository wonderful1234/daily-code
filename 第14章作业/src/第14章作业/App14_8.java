package ��14����ҵ;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class App14_8 {
	public static void main(String[] args) {
		new Window("��ɫ���");
	}
}
class Window extends JFrame {
	private static final long serialVersionUID = -4682287151007612144L;
	JCheckBox frontGroundColor = new JCheckBox("ǰ��ɫ");
	JCheckBox backGroundColor = new JCheckBox("����ɫ");
	JTextArea textArea = new JTextArea("��Ϊģ�������δ�����ǣ�ֻΪ�������������Ŭ������ʼŬ���ɣ���������������������ܶණ��������Ҫ�������Ƕ�������������Ҫ�ģ���Ҫ��������ɹ��Ժ�����һ�����ǻ��ٻ��������ұ����ڸ�����" + 
			"��", 20, 30);
	JSlider rJSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
	JSlider gJSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
	JSlider bJSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
	public Window(String s) {
		super(s);
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		add(textArea);
		JPanel select = new JPanel();
		select.setLayout(new FlowLayout());
		select.add(frontGroundColor);
		select.add(backGroundColor);
		add(select);
		JPanel colorPanel = new JPanel();
		colorPanel.setLayout(new BoxLayout(colorPanel, BoxLayout.Y_AXIS));
		colorPanel.add(rJSlider);
		colorPanel.add(gJSlider);
		colorPanel.add(bJSlider);
		rJSlider.setMajorTickSpacing(30);
		rJSlider.setMinorTickSpacing(3);
		rJSlider.setPaintTicks(true);
		rJSlider.setPaintLabels(true);
		gJSlider.setMajorTickSpacing(30);
		gJSlider.setMinorTickSpacing(3);
		gJSlider.setPaintTicks(true);
		gJSlider.setPaintLabels(true);
		bJSlider.setMajorTickSpacing(30);
		bJSlider.setMinorTickSpacing(3);
		bJSlider.setPaintTicks(true);
		bJSlider.setPaintLabels(true);
		add(colorPanel);
		backGroundColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (backGroundColor.isSelected()) {
					textArea.setBackground(new Color(rJSlider.getValue(), gJSlider.getValue(), bJSlider.getValue()));
				} else {
					textArea.setBackground(new Color(255, 255, 255));
				}
			}
		});
		frontGroundColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (frontGroundColor.isSelected()) {
					textArea.setForeground(new Color(rJSlider.getValue(), gJSlider.getValue(), bJSlider.getValue()));
				} else {
					textArea.setForeground(new Color(0, 0, 0));
				}
			}
		});
		rJSlider.addChangeListener(new ColorListen());
		gJSlider.addChangeListener(new ColorListen());
		bJSlider.addChangeListener(new ColorListen());
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	class ColorListen implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			if (frontGroundColor.isSelected()) {
				textArea.setForeground(new Color(rJSlider.getValue(), gJSlider.getValue(), bJSlider.getValue()));
			}
			if (backGroundColor.isSelected()) {
				textArea.setBackground(new Color(rJSlider.getValue(), gJSlider.getValue(), bJSlider.getValue()));
			}
		}
	}
}