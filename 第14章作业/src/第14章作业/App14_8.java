package 第14章作业;

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
		new Window("颜色组合");
	}
}
class Window extends JFrame {
	private static final long serialVersionUID = -4682287151007612144L;
	JCheckBox frontGroundColor = new JCheckBox("前景色");
	JCheckBox backGroundColor = new JCheckBox("背景色");
	JTextArea textArea = new JTextArea("不为模糊不清的未来担忧，只为清清楚楚的现在努力，开始努力吧！在这个过程中你必须放弃很多东西，但你要明白它们都不是你最终想要的，你要相信在你成功以后，总有一天它们会再回来，而且比现在更美好" + 
			"！", 20, 30);
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