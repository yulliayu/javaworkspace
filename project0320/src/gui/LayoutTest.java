package gui;
import java.awt.*;

class LayoutTest{
	public static void main(String[] args){
		Frame frame=new Frame();

		Button bt1=new Button("�� ��");
		Button bt2=new Button("�� ����");

		// �����̳ʴ� ���� �Ѱ��� ���̾ƿ��� ������ �� �����Ƿ�,
		// ������ ���� �� �Ϻο� ���� �ٸ� ���̾ƿ��� �����Ϸ���,
		// ������ �ȿ� �Ǵٸ� �����̳ʸ� ������ �ȴ�.
		// �ַ� ����ϴ� �����̳ʴ� Panel �̶� �Ҹ��� ��ü�̴�
		// Panel �� ����Ʈ�� FlowLayout �� ����Ǿ� �����Ƿ� ��ư�� ũ�Ⱑ ������ �ʴ´�.
		Panel p=new Panel();
		p.add(bt1);
		p.add(bt2);
		
		frame.add(p, BorderLayout.NORTH);
		frame.setVisible(true);
		frame.setSize(400, 100);
	}
}
