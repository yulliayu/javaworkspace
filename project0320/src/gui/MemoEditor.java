/*
�޸����� ����� ����
*/
package gui;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.Font;

class MemoEditor extends JFrame{
	JMenuBar bar; // null �ʱⰪ
	JMenu  m_file, m_edit, m_font, m_view, m_help;
	JTextArea area;
	JScrollPane scroll;
	JMenuItem  item_new, item_open, item_save, item_saveas, item_page, item_print, item_exit;

	// �޸��� �����찡 �¾��, �� ��ǰ�� ���ÿ� �¾�� �ϹǷ�
	// �������� ��ȸ�� ��ġ�� ����
	public MemoEditor(){
		super("���� ���� - �޸���");
		bar=new JMenuBar();

		// �޴����� ��������.
		m_file = new JMenu("����");
		m_edit = new JMenu("����");
		m_font = new JMenu("����");
		m_view = new JMenu("����");
		m_help = new JMenu("����");

		area = new JTextArea(20,25);
		scroll = new JScrollPane(area);

		// �޴� item
		item_new = new JMenuItem("���� �����");
		item_open = new JMenuItem("����");
		item_save = new JMenuItem("����");
		item_saveas = new JMenuItem("�ٸ� �̸����� ����");

		item_page = new JMenuItem("������ ����");
		item_print = new JMenuItem("�μ�");

		item_exit = new JMenuItem("������");

		m_file.add(item_new);
		m_file.add(item_open);
		m_file.add(item_save);
		m_file.add(item_saveas);
		m_file.addSeparator();
		m_file.add(item_page);
		m_file.add(item_print);
		m_file.addSeparator();
		m_file.add(item_exit);

		bar.add(m_file);
		bar.add(m_edit);
		bar.add(m_font);
		bar.add(m_view);
		bar.add(m_help);

		setJMenuBar(bar);

		// area ����, ����ũ��
		area.setFont(new Font("Dotum", Font.BOLD, 20));

		add(scroll); // scroll �� area �� ��������Ƿ�, scroll �� �����ؾ� ��.
		area.setForeground(Color.RED);

		this.setBounds(200, 100, 600, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args){
		new MemoEditor();
	}
}
