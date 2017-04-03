/*
�ڹ� ���ε� GUI(Graphic User Interface)
 (�׷��� ������ ���ø����̼��� �ڼ��� �� �ֵ��� �����ϴ� ȯ��.)
���ø����̼��� ������ �� �ִ�
�׸��� �ڹٸ� ���� �� �� �� �ִ� ��ȸ, �����̴�.

��� �׷��� ���α׷��� ������ �󿡼� ����ǹǷ�,
�ڹٿ��� �����츦 ���� ���� �����.
*/
package gui;
import    java.awt.Frame;
import    java.awt.Button;
import    java.awt.FlowLayout;  // ��ġ ������.
import    java.awt.TextField;
import    java.awt.Color;
import    java.awt.Checkbox;
import    java.awt.CheckboxGroup;
import    java.awt.Choice;
import    java.awt.TextArea;

class WinTest{
	public static void main(String[] args){
		Frame frame = new Frame();
		// ������Ʈ�� �ʹ� ������� ����� ���Ƿ�, �� ������ �ذ��ϱ� ���� ���̾ƿ��� �����Ѵ�.(�̵��� ���)
		FlowLayout flow=new FlowLayout();
		frame.setLayout(flow); // ���̾ƿ� ����. ���� ���� ��� frome ��ü�� ��ư�� ũ�� �������.

		// Frame �� ����Ʈ�� ������ �ʴ� �Ӽ�����
		// ���� ���̰� ó������.
		frame.setVisible(true);
		frame.setSize(300,400);
		frame.setTitle("My Window");

		Button bt; // null
		bt = new Button("�չ�ư");

		frame.add(bt);

		// �ؽ�Ʈ �Է� �ڽ� ����
		TextField txt;
		txt = new TextField(20);

		frame.add(txt);

		// ������ ������ ����
		// ���� ó�� ���� ��ü�� ���� ��ó��
		/*
		�ڹ��� ��� ��ü�� �ᱹ �Ϲ�, �߻�, �������̽� �� �ϳ��̴�.
		���� ó�� ���� ��ü�� ������ �ᱹ �޸𸮿� �÷��� ����϶�� �ذ��̱� ������
		�� �� ��� ���̽��� ���ϴ� �� ���� ������ ��,
		�� ��ü�� �°� �޸𸮿� �ø���
		1) �Ϲ� - new ����
		2) �߻� - �ڽ��� new ����
		3) �������̽� - implements �� �ڽ��� new ����.
		�ٵ�, �� ����� 2,3 ���� �� �ڽĵ��� new ���� �ʴ��� �����ϴ� ����� api ���� �����ϴ� ��찡 �� ����.
		*/
		Color c=new Color(0,255,255);
		frame.setBackground(c);

		// üũ�ڽ� ����
		Checkbox cb1=new Checkbox("����");
		Checkbox cb2=new Checkbox("����");
		Checkbox cb3=new Checkbox("����");
		Checkbox cb4=new Checkbox("�");

		frame.add(cb1);
		frame.add(cb2);
		frame.add(cb3);
		frame.add(cb4);

		// html ������ select �� �ڹٿ����� Choice �� �Ѵ�.
		// ��� ���� �ٳ���
		Choice choice=new Choice();
		choice.add("���");
		choice.add("����");
		choice.add("�ٳ���");

		frame.add(choice);

		// ������ �̿��Ͽ� ��,���� üũ�Ѵ�.
		// ����) java ������ ������� ���� ����.
		// checkbox �� �׷�ȭ ���Ѿ� �Ѵ�.
		CheckboxGroup group = new CheckboxGroup();
		Checkbox c1= new Checkbox("��", group, false);
		Checkbox c2= new Checkbox("��", group, true);

		frame.add(c1);		
		frame.add(c2);		

		// Textarea ����
		TextArea ta=new TextArea(30,20);

		frame.add(ta);

	}
}
