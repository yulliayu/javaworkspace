/* 로그인 폼 만들기 */
package gui;
import   java.awt.*; // 맥이나 리눅스에서 화면이 변경되어 스윙을 사용한다.

class LoginForm{
	public static void main(String[] args){

		// 객체 선언
		// 지역변수는 개발자가 초기화 하지 않으면
		// 자동으로 초기화되지 않으므로 아래의 객체들에 대한 
		// 레퍼런스 변수엔 아무런 값도 들어있지 않다. null 도 아니다.
		Frame		frame=null; // FM 
		Panel			p_center, p_south, p_container;
		Label			la_id, la_pw;
		TextField	t_id, t_pw;
		Button		bt_login, bt_regist;

		// 객체 생성
		frame		= new Frame("로그인 폼");
		p_center	= new Panel();
		p_south	= new Panel();
		p_container = new Panel();
		la_id			= new Label("로그인");
		la_pw		= new Label("PassWord");
		t_id			= new TextField(20);
		t_pw			= new TextField(20);
		bt_login		=new Button("로그인");
		bt_regist	= new Button("회원가입");

		// center 영역 조합하기
		// 붙이기 전에 Layout 을 먼저 결정해야 한다.
		// Panel 은 디폴트가 FlowLayout 이므로, GridLayout 으로 변경하자.
		p_center.setLayout(new GridLayout(2,2));
		p_center.add(la_id);   // 1행 1열
		p_center.add(t_id);    // 1행 2열

		p_center.add(la_pw); // 2행 1열
		p_center.add(t_pw);  // 2행 2열

		// 남쪽 패털에 버튼 부착
		p_south.add(bt_login);
		p_south.add(bt_regist);

		// 프레임 대신 BorderLayout 을 적용할 container
		p_container.setLayout(new BorderLayout());

		// 패널들을 프레임에 붙이자.
		p_container.add(p_center, BorderLayout.CENTER);
		p_container.add(p_south, BorderLayout.SOUTH);

		// 윈도우의 Layout 을 Flow로 전환
		frame.setLayout(new FlowLayout());

		// 윈도우 크기 및 보이기 설정
		frame.add(p_container);
		frame.setSize(300, 150);
		frame.setVisible(true);

	}
}
