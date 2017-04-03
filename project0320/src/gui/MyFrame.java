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

	// �� �����찡 �¾�� ���� ��ǰ�鵵 ���� �¾��.
	public MyFrame(){

		this.p_north = new JPanel();
		this.bt = new JButton("��ư");
		area = new JTextArea(20,30);
		t_input=new JTextField(20);
		

		p_north.add(bt);
		p_north.add(t_input);
		// �г��� ���� ���ʿ� ������.
		add(p_north, BorderLayout.NORTH);
		add(area);

		// ������ ������� �̺�Ʈ�� �������� ����
		// ��ġ javascript ������ addEventListener() �� ���� �۾����� ����
		// ��ư�� �����ʿ��� ����
		bt.addActionListener(this);
		t_input.addKeyListener(this);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(400,400);

	}

	// ActionListener �� ����ڰ� ����Ų �̺�Ʈ�� 
	// ActionEvent ���� �����ϰ� �� �̺�Ʈ�� �����Ǿ�����,
	// � ó���� ������ �����ڰ� �����ؾ� �ϱ� ������
	// ActionListener �� ������ Ȯ������ �� ���� �߻�޼��带 ���� ��ü���� �ϰ�
	// �� �������̽��� ��ӹ޴� �ڰ� � Ŭ������ �̹� �ڽ��� ���� �����Ƿ�,
	// sun ������ �߻�Ŭ������ �ƴ� �������̽��� ���������μ� ���߻�� ������ ���ذ��� �ֵ��� �ߴ�.
	public void actionPerformed(ActionEvent e){
		System.out.println("�� ������?");
	}

	// KeyListener �� �߻�޼��带 �������̵� ����. ��� ��� �Ѵ�.
	// Ű�� ��������
	public void keyPressed(KeyEvent e){
		System.out.println("keyPressed");
	}

	// Ű�� ������ ����
	public void keyReleased(KeyEvent e){
		System.out.println("keyReleased");
	}

	// Ÿ�ڸ� ĥ��....
	public void keyTyped(KeyEvent e){
	}

	public static void main(String[] args){
		new MyFrame();
	}
	
}
