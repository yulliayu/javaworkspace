/*
���� ä���� �����Ѵ�.

�̺�Ʈ ������ 3�ܰ�
1. ������ �����ʸ� �����Ͽ� ����(implements)�Ѵ�. 
2. �߻� �޼��� ������
3. �����ʿ� ������Ʈ���� ����
*/
package chat;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.BorderLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import chat.ChatB;
import chat.ChatC;

class ChatA extends JFrame implements ActionListener, KeyListener{
	JTextArea  area;
	JScrollPane  scroll;
	JPanel  p_south;
	JTextField  t_input;
	JButton  bt_open;
	ChatB chatB;
	ChatC chatC;

	public ChatA(){
		area = new JTextArea(17,20);
		scroll = new JScrollPane(area);

		p_south = new JPanel();
		t_input = new JTextField(15);
		bt_open = new JButton("����");

		p_south.add(t_input);
		p_south.add(bt_open);

		add(scroll);
		add(p_south, BorderLayout.SOUTH);

		// ��� ������Ʈ�� �������� ����
		bt_open.addActionListener(this);
		
		// Ű �����ʿ��� ����
		t_input.addKeyListener(this);

	}

	// ActionListener �� �޼���
	public void actionPerformed(ActionEvent e){
		// CharB �ν��Ͻ� �����
		chatB = new ChatB();
		chatB.setTitle("ChatB");
		chatB.chatA = this;

		chatC = new ChatC();
		chatC.setTitle("ChatC");
		chatC.chatA = this;

		//chatB.t_input.setEnabled(false);
		t_input.requestFocus(); // Ŀ�� �ø���
	}

	public void	keyPressed(KeyEvent e){
	}

	public void	keyReleased(KeyEvent e){
		int key = e.getKeyCode();

		/*
		key ���� ���͸� ������ 10�� �� �׽�Ʈ�� ���� �˰� �Ǿ���
		������, �츮�� �ΰ��̱� ������ 10���ٴ� ENTER ��� �ܾ �� �ͼ��ϴ�.
		�̷��� ������ ����� �ַ� ���ȴ�.
		��, �����, �� ���� ������ �ʴ� Ư¡�� �ִ°� �ƴ϶�,
		���α׷��ӿ��� ���� ģ���� �ܾ��� �ǹ̸� �ο��ϴ� ������ ���� ũ��.
		*/
		if (key==KeyEvent.VK_ENTER)
		{
			// ���� ġ��, ���� area �� t_input �� ���� ����ϰ�
			String msg = t_input.getText();
			appendArea(msg);
			t_input.setText(""); // �ʱ�ȭ

		}
	}

	public void	keyTyped(KeyEvent e){
	}

	public void appendArea(String s){
		
		if (s.equals("") == false)
		{
			String msg = s + "\n";
			System.out.println("false");
			// ChatA
			area.append(msg);
			
			// ChatB
			chatB.area.append(msg);
			
			// ChatC
			chatC.area.append(msg);
			
		} else {
			System.out.println("true");
		}
	}

	public static void main(String[] args){
		ChatA chatA = new ChatA();
		chatA.setTitle("ChatA");
		chatA.setVisible(true);
		chatA.setBounds(100, 100, 300, 400);
		// ���õ� ��� Frame �� ���� ������.
		chatA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
