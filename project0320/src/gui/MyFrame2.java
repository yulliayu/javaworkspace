package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

class MyFrame2 extends JFrame{

	JPanel p_west, p_east;
	JTextField  txt;
	JButton    bt;
	JTextArea  area;

	public MyFrame2(){
		p_west = new JPanel();
		p_east = new JPanel();
		txt = new JTextField(20);
		bt = new JButton("버튼");
		area = new JTextArea(20,20);

		// 왼쪽
		//p_west.setLayout(new FlowLayout());
		//p_west.setAlignmentY(p_west.CENTER_ALIGNMENT);
		p_west.add(bt);
		add(p_west, BorderLayout.WEST);

		// 오른쪽
		p_east.setLayout(new BorderLayout());
		p_east.add(txt, BorderLayout.NORTH);
		p_east.add(area);
		add(p_east, BorderLayout.EAST);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(400,300);

	}

	public static void main(String[] args){
		new MyFrame2();
	}

	
}
