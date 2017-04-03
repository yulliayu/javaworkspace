/*
���� ä���� �����Ѵ�.
*/
package chat;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.BorderLayout;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import chat.ChatA;

public class ChatC extends JFrame implements KeyListener{
	JTextArea  area;
	JScrollPane  scroll;
	JPanel  p_south;
	JTextField  t_input;
	ChatA       chatA;

	public ChatC(){
		area = new JTextArea(17,20);
		scroll = new JScrollPane(area);

		p_south = new JPanel();
		t_input = new JTextField(15);

		t_input.addKeyListener(this);

		p_south.add(t_input);

		add(scroll);
		add(p_south, BorderLayout.SOUTH);

		setVisible(true);
		setBounds(700, 100, 300,400);
		// â �� �����Ƿ� �ּ�ó��. ��� ���α׷��� ����ȴ�.
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void	keyPressed(KeyEvent e){
	}

	public void	keyReleased(KeyEvent e){
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_ENTER)
		{
			String msg = t_input.getText();
			chatA.appendArea(msg);
			t_input.setText("");
		}
		
	}

	public void	keyTyped(KeyEvent e){
	}

}
