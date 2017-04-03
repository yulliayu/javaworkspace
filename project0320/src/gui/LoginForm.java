/* �α��� �� ����� */
package gui;
import   java.awt.*; // ���̳� ���������� ȭ���� ����Ǿ� ������ ����Ѵ�.

class LoginForm{
	public static void main(String[] args){

		// ��ü ����
		// ���������� �����ڰ� �ʱ�ȭ ���� ������
		// �ڵ����� �ʱ�ȭ���� �����Ƿ� �Ʒ��� ��ü�鿡 ���� 
		// ���۷��� ������ �ƹ��� ���� ������� �ʴ�. null �� �ƴϴ�.
		Frame		frame=null; // FM 
		Panel			p_center, p_south, p_container;
		Label			la_id, la_pw;
		TextField	t_id, t_pw;
		Button		bt_login, bt_regist;

		// ��ü ����
		frame		= new Frame("�α��� ��");
		p_center	= new Panel();
		p_south	= new Panel();
		p_container = new Panel();
		la_id			= new Label("�α���");
		la_pw		= new Label("PassWord");
		t_id			= new TextField(20);
		t_pw			= new TextField(20);
		bt_login		=new Button("�α���");
		bt_regist	= new Button("ȸ������");

		// center ���� �����ϱ�
		// ���̱� ���� Layout �� ���� �����ؾ� �Ѵ�.
		// Panel �� ����Ʈ�� FlowLayout �̹Ƿ�, GridLayout ���� ��������.
		p_center.setLayout(new GridLayout(2,2));
		p_center.add(la_id);   // 1�� 1��
		p_center.add(t_id);    // 1�� 2��

		p_center.add(la_pw); // 2�� 1��
		p_center.add(t_pw);  // 2�� 2��

		// ���� ���п� ��ư ����
		p_south.add(bt_login);
		p_south.add(bt_regist);

		// ������ ��� BorderLayout �� ������ container
		p_container.setLayout(new BorderLayout());

		// �гε��� �����ӿ� ������.
		p_container.add(p_center, BorderLayout.CENTER);
		p_container.add(p_south, BorderLayout.SOUTH);

		// �������� Layout �� Flow�� ��ȯ
		frame.setLayout(new FlowLayout());

		// ������ ũ�� �� ���̱� ����
		frame.add(p_container);
		frame.setSize(300, 150);
		frame.setVisible(true);

	}
}
