/*has a , is a */
package gui;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

class MyFrame extends JFrame implements ActionListener, KeyListener{

	JPanel      p_north;
	JButton    bt;
	JTextArea area;
	JTextField t_input;

	// 이 윈도우가 태어날때 각종 부품들도 같이 태어나자.
	public MyFrame(){

		this.p_north = new JPanel();
		this.bt = new JButton("버튼");
		area = new JTextArea(20,30);
		t_input=new JTextField(20);
		

		p_north.add(bt);
		p_north.add(t_input);
		// 패널을 나의 북쪽에 붙이자.
		add(p_north, BorderLayout.NORTH);
		add(area);

		// 누구를 대상으로 이벤트를 연결할지 결정
		// 마치 javascript 에서의 addEventListener() 와 같은 작업으로 간주
		// 버튼과 리스너와의 연결
		bt.addActionListener(this);
		t_input.addKeyListener(this);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(400,400);

	}

	// ActionListener 는 사용자가 일으킨 이벤트중 
	// ActionEvent 만을 감지하고 그 이벤트가 감지되었을때,
	// 어떤 처리를 할지는 개발자가 결정해야 하기 때문에
	// ActionListener 는 내용을 확정지을 수 없는 추상메서드를 가진 객체여야 하고
	// 이 인터페이스를 상속받는 자가 어떤 클래스의 이미 자식일 수도 있으므로,
	// sun 에서는 추상클래스가 아닌 인터페이스로 제공함으로서 다중상속 문제를 피해갈수 있도록 했다.
	public void actionPerformed(ActionEvent e){
		System.out.println("나 눌렀어?");
	}

	// KeyListener 의 추상메서드를 오버라이드 하자. 모두 써야 한다.
	// 키를 눌렀을때
	public void keyPressed(KeyEvent e){
		System.out.println("keyPressed");
	}

	// 키를 눌렀다 뗄때
	public void keyReleased(KeyEvent e){
		System.out.println("keyReleased");
	}

	// 타자를 칠때....
	public void keyTyped(KeyEvent e){
	}

	public static void main(String[] args){
		new MyFrame();
	}
	
}
