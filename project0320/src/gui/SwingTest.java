/*
�ڹ��� �׷��� ��ü���� awt ���� ����������,
awt �� os ���� ���� �� ����� �޶����� ������ �ֱ� ������
�̸� ������ GUI ������Ʈ ��Ű����swing �̴�. �δ㰮�� ����.
awt �� ���α׷� ����� �޶����� ���� ���� 
���� ��Ű����� Ŭ�������� �� Ʋ������.
����) awt �� ���� �������� �ʴ� �κ�(��ġ������)�̳�, �̺�Ʈ �����ÿ� ������ ���ȴ�.
���) GUI ���α׷��� awt + swing ����

���߽� ����Ģ
1. Ŭ���� 
   - ���� �ܾ�� �ݵ�� �빮�ڷ� �����϶�.
   - 2�� �̻��� ���վ��� ��� ��Ÿ����� �̿�
2. �޼���
   - �޼������ �ݵ�� �ҹ��ڷ� �����϶�.
3. ����
   - �ҹ��ڷ� ������ ��
   - Ư�����ڷ� �������� �� ��.
     (���� - �����(_)�� $ �� ����
   - ���ڷ� ���� �Ұ�  (ex : 2x=3 �Ұ�)
4. ��� 
   - ��� �빮�ڷ� ǥ���� ��
      ��� ���� ������ �ȳ�����, �ٸ� �����ڰ� �Ϲݺ����� �� �˰� ȥ���Ѵ�.
5. ���۷��� ���� ����� �ҹ��ڷ� �� ��.

����) �ѹ� swing �� ���� ��� swing ���� ����, ���� �͸� awt �� ����. ��) Layout
*/
package gui;
import  javax.swing.JFrame;
import  javax.swing.JPasswordField;
import  javax.swing.JButton;
import  java.awt.FlowLayout;

class SwingTest{
	public static void main(String[] args){
		JFrame frame=null;
		JPasswordField t_pass;
		JButton bt = new JButton("�� ������");

		frame = new JFrame("�� ������");
		t_pass = new JPasswordField(20);

		frame.setLayout(new FlowLayout());
		frame.add(t_pass);
		frame.add(bt);

		// ������ â�� ������, ���α׷� �� ���μ����� ���̴� �޼��� ȣ��
		// ����Ϸ��� �ƹ�Ű�� ��������... �޼��� ����.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setSize(300,400);
		frame.setVisible(true);
	}
}
