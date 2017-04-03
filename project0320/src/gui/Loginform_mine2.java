package gui;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.GridLayout;
import java.awt.Button;

class Loginform2{

	public static void main(String[] args){

		Frame frame = new Frame("로그인");
		frame.setVisible(true);
		frame.setSize(300, 200);

		Panel p1= new Panel();

		GridLayout grid = new GridLayout(2,1);
		p1.setLayout(grid);

		Panel p11 = new Panel();
		Label lb_ID = new Label("ID");
		TextField tf_ID = new TextField(20);
		p11.add(lb_ID);
		p11.add(tf_ID);

		Panel p12 = new Panel();
		Label lb_PW = new Label("PassWord");
		TextField tf_PW = new TextField(20);
		p12.add(lb_PW);
		p12.add(tf_PW);

		p1.add(p11);
		p1.add(p12);

		frame.add(p1, BorderLayout.CENTER);

		Panel pSouth = new Panel();
		Button bt1 = new Button("로그인");
		Button bt2 = new Button("회원가입");
		pSouth.add(bt1);
		pSouth.add(bt2);
		
		frame.add(pSouth, BorderLayout.SOUTH);

	}
	
}
