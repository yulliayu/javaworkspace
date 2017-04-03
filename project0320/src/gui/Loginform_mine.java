package gui;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.GridLayout;
import java.awt.Button;

class Loginform{

	public static void main(String[] args){

		Frame frame = new Frame("로그인");
		frame.setVisible(true);
		frame.setSize(300, 200);

		Panel p1= new Panel();

		GridLayout grid = new GridLayout(2,2, 10, 20);

		//p1.setSize(300,100);
		//p2.setSize(300,100);
		p1.setLayout(grid);
		
		Label lb_ID = new Label("ID");
		lb_ID.setAlignment(lb_ID.RIGHT);
		TextField tfId = new TextField(40);

		Label lbPw = new Label("PassWord");
		lbPw.setAlignment(lbPw.RIGHT);
		TextField tfPw = new TextField(40);

		p1.add(lb_ID);
		p1.add(tfId);
		p1.add(lbPw);
		p1.add(tfPw);

		Panel p2= new Panel();
		p2.add(p1);

		frame.add(p2, BorderLayout.CENTER);
		//frame.add(p2, BorderLayout.CENTER);

		Panel p3=new Panel();
		p3.setSize(300, 100);
		Button  bt1=new Button("로그인");
		Button  bt2=new Button("회원가입");
		p3.add(bt1);
		p3.add(bt2);
		frame.add(p3, BorderLayout.SOUTH);
	}
	
}
