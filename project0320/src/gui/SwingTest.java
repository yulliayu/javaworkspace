/*
자바의 그래픽 객체들은 awt 에서 지원하지만,
awt 가 os 에서 따라 그 모습이 달라지는 단점이 있기 때문에
이를 개선한 GUI 컴포넌트 패키지가swing 이다. 부담갖지 말자.
awt 와 프로그램 방식이 달라지는 것은 없고 
단지 패키지명과 클래스명이 좀 틀려진다.
주의) awt 는 눈에 보여지지 않는 부분(배치관리자)이나, 이벤트 구현시엔 여전히 사용된다.
결론) GUI 프로그램시 awt + swing 조함

개발시 명명규칙
1. 클래스 
   - 시작 단어는 반드시 대문자로 시작하라.
   - 2개 이상의 복합어일 경우 낙타기법을 이용
2. 메서드
   - 메서드명은 반드시 소문자로 시작하라.
3. 변수
   - 소문자로 시작할 것
   - 특수문자로 시작하지 말 것.
     (예외 - 언더바(_)와 $ 는 가능
   - 숫자로 시작 불가  (ex : 2x=3 불가)
4. 상수 
   - 모두 대문자로 표기할 것
      약속 어기면 에러는 안나지만, 다른 개발자가 일반변수인 줄 알고 혼동한다.
5. 레퍼런스 변수 선언시 소문자로 갈 것.

주의) 한번 swing 을 쓰면 모두 swing 으로 쓰되, 없는 것만 awt 를 쓴다. 예) Layout
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
		JButton bt = new JButton("나 눌러봐");

		frame = new JFrame("난 윈도우");
		t_pass = new JPasswordField(20);

		frame.setLayout(new FlowLayout());
		frame.add(t_pass);
		frame.add(bt);

		// 윈도우 창이 닫히면, 프로그램 즉 프로세스도 죽이는 메서드 호출
		// 계속하려면 아무키나 누르세요... 메세지 나옴.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setSize(300,400);
		frame.setVisible(true);
	}
}
