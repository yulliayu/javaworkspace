/*
메모장을 만들어 보자
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
	JMenuBar bar; // null 초기값
	JMenu  m_file, m_edit, m_font, m_view, m_help;
	JTextArea area;
	JScrollPane scroll;
	JMenuItem  item_new, item_open, item_save, item_saveas, item_page, item_print, item_exit;

	// 메모장 윈도우가 태어날때, 그 부품도 동시에 태어나야 하므로
	// 생성자의 기회를 놓치지 말자
	public MemoEditor(){
		super("제목 없음 - 메모장");
		bar=new JMenuBar();

		// 메뉴들을 생성하자.
		m_file = new JMenu("파일");
		m_edit = new JMenu("편집");
		m_font = new JMenu("서식");
		m_view = new JMenu("보기");
		m_help = new JMenu("도움말");

		area = new JTextArea(20,25);
		scroll = new JScrollPane(area);

		// 메뉴 item
		item_new = new JMenuItem("새로 만들기");
		item_open = new JMenuItem("열기");
		item_save = new JMenuItem("저장");
		item_saveas = new JMenuItem("다른 이름으로 저장");

		item_page = new JMenuItem("페이지 설정");
		item_print = new JMenuItem("인쇄");

		item_exit = new JMenuItem("끝내기");

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

		// area 색상, 글자크기
		area.setFont(new Font("Dotum", Font.BOLD, 20));

		add(scroll); // scroll 이 area 를 흡수했으므로, scroll 을 부착해야 함.
		area.setForeground(Color.RED);

		this.setBounds(200, 100, 600, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args){
		new MemoEditor();
	}
}
