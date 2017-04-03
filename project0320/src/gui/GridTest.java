/*
GridLayout ��ġ������

�ڹ��� GUI ������Ʈ�� ũ�� 2������ �з��ȴ�.
1. ���� �����ϴ���  (�����̳�)
   Frame, Panel
   �����̳ʴ� �ٸ� ������Ʈ�� ��� �÷� ������
   ��, ��ġ�� ��� ������ ����ϴ� ��ü�̹Ƿ�
   ��� �����̳ʴ� setLayout �̶�� �޼��尡 �����ǰ� �ִ�.
   ���� �����ڰ� �ƹ��͵� �������� ������??
   Frame - BorderLayour �� default ����.
                �׷��� �Ʊ� ���ʿ� ��й�ư�� ������.
	Panel - FlowLayout �� default ����.

2. ������ ���Դ��ϴ� �� (���־�������Ʈ)
   Button, TextField, Checkbox...... (1.�� �� ������..)
*/
package gui;
import java.awt.*; // java.awt.* �� �ϴ��� ��θ� �����ϴ� �� ������, �޸𸮿� ������ ��ġ���� �ʴ´�.

class GridTest{
	public static void main(String[] args){
		
		Frame frame=new Frame("�׸��� ����");
		frame.setVisible(true); // ���̰�
		frame.setSize(200, 500);


		// ������ �ϴٺ��� �⺻�ڷ����� ��ü�ڷ��� ���� ����ȯ�̶����,
		// �⺻�ڷ��������δ� �� �� ���� ����� �����ؾ��� ��찡 �ִ�
		// �̶� �����Ǵ� Ŭ������ �ٷ� Wrapper Ŭ�����ε�,
		// �ڹ��� ��� �⺻�ڷ������� 1:1 �����ϴ� Wrapper Ŭ������ �ִ�.
		// byte  --> Byte
		// short --> Short
		// int  --> Integer
		// long   --> Long
		// float  --> Float
		// double --> Double
		// boolean --> Boolean
		// char      --> Character
		// Wrapper Ŭ���� ���� 
		// 1) �⺻�ڷ����� ��ü�ڷ��� ���� ����ȭ
		// 2) �⺻�ڷ����� ������� ���� �پ��ϰ� ������ ����� ������
		//      ��ü�������� ����÷� ���� ���� �޼��带 �̿��Ͽ� ������ ó���ϱ� ���� ����.
		// ���� "21" �� �⺻�ڷ������� ��ȯ --> 21
		// int a=Integer.parseInt("21");

		// Frame �� ����Ʈ�� BorderLayout �̹Ƿ� 
		// GridLayout �� ������ ����.
		GridLayout grid = new GridLayout(5,2);  // 5�� 2ȣ��
		frame.setLayout(grid); // �׸��� ����.
		for (int i=1; i<=10; i++)
		{
			Button bt=new Button(Integer.toString(i)); // �⺻�ڷ����� ��ü�� �ڷ�������..
			frame.add(bt);
		}
	}
}
