/*
양자 채팅을 구현한다.

이벤트 구현의 3단계
1. 적절한 리스너를 선택하여 구현(implements)한다. 
2. 추상 메서드 재정의
3. 리스너와 컴포넌트와의 연결
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
		bt_open = new JButton("열기");

		p_south.add(t_input);
		p_south.add(bt_open);

		add(scroll);
		add(p_south, BorderLayout.SOUTH);

		// 대상 컴포넌트와 리스너의 연결
		bt_open.addActionListener(this);
		
		// 키 리스너와의 연결
		t_input.addKeyListener(this);

	}

	// ActionListener 의 메서드
	public void actionPerformed(ActionEvent e){
		// CharB 인스턴스 만들기
		chatB = new ChatB();
		chatB.setTitle("ChatB");
		chatB.chatA = this;

		chatC = new ChatC();
		chatC.setTitle("ChatC");
		chatC.chatA = this;

		//chatB.t_input.setEnabled(false);
		t_input.requestFocus(); // 커서 올리기
	}

	public void	keyPressed(KeyEvent e){
	}

	public void	keyReleased(KeyEvent e){
		int key = e.getKeyCode();

		/*
		key 값이 엔터를 쳤을때 10인 걸 테스트를 통해 알게 되었다
		하지만, 우리는 인간이기 때문에 10보다는 ENTER 라는 단어가 더 익숙하다.
		이러한 이유로 상수가 주로 사용된다.
		즉, 상수란, 그 값이 변하지 않는 특징만 있는게 아니라,
		프로그래머에게 좀더 친숙한 단어의 의미를 부여하는 목적이 아주 크다.
		*/
		if (key==KeyEvent.VK_ENTER)
		{
			// 엔터 치면, 나의 area 에 t_input 의 값을 출력하고
			String msg = t_input.getText();
			appendArea(msg);
			t_input.setText(""); // 초기화

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
		// 관련된 모든 Frame 이 같이 닫힌다.
		chatA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
