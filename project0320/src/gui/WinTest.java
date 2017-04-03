/*
자바 언어로도 GUI(Graphic User Interface)
 (그래픽 적으로 어플리케이션을 자숑할 수 있도록 제공하는 환경.)
어플리케이션을 제작할 수 있다
그리고 자바를 가장 잘 할 수 있는 기회, 찰나이다.

모든 그래픽 프로그램은 윈도우 상에서 실행되므로,
자바에서 윈도우를 띄우는 법을 배우자.
*/
package gui;
import    java.awt.Frame;
import    java.awt.Button;
import    java.awt.FlowLayout;  // 배치 관리자.
import    java.awt.TextField;
import    java.awt.Color;
import    java.awt.Checkbox;
import    java.awt.CheckboxGroup;
import    java.awt.Choice;
import    java.awt.TextArea;

class WinTest{
	public static void main(String[] args){
		Frame frame = new Frame();
		// 컴포넌트가 너무 대왕으로 만들어 지므로, 이 문제를 해결하기 위해 레이아웃을 적용한다.(이따가 배움)
		FlowLayout flow=new FlowLayout();
		frame.setLayout(flow); // 레이아웃 적용. 쓰지 않을 경우 frome 전체에 버튼이 크게 만들어짐.

		// Frame 은 디폴트로 보이지 않는 속성가짐
		// 따라서 보이게 처리하자.
		frame.setVisible(true);
		frame.setSize(300,400);
		frame.setTitle("My Window");

		Button bt; // null
		bt = new Button("왕버튼");

		frame.add(bt);

		// 텍스트 입력 박스 생성
		TextField txt;
		txt = new TextField(20);

		frame.add(txt);

		// 윈도우 색상을 주자
		// 난생 처음 보는 객체에 대한 대처법
		/*
		자바의 모든 객체는 결국 일반, 추상, 인터페이스 중 하나이다.
		따라서 처음 보는 객체라 할지라도 결국 메모리에 올려서 사용하라고 준것이기 때문에
		셋 중 어느 케이스에 속하는 지 먼저 조사한 후,
		그 객체에 맞게 메모리에 올리자
		1) 일반 - new 하자
		2) 추상 - 자식을 new 하자
		3) 인터페이스 - implements 한 자식을 new 하자.
		근데, 내 경험상 2,3 번은 꼭 자식들을 new 하지 않더라도 생성하는 방법을 api 에서 제공하는 경우가 더 많다.
		*/
		Color c=new Color(0,255,255);
		frame.setBackground(c);

		// 체크박스 생성
		Checkbox cb1=new Checkbox("여행");
		Checkbox cb2=new Checkbox("게임");
		Checkbox cb3=new Checkbox("독서");
		Checkbox cb4=new Checkbox("운동");

		frame.add(cb1);
		frame.add(cb2);
		frame.add(cb3);
		frame.add(cb4);

		// html 에서의 select 는 자바에서는 Choice 라 한다.
		// 사과 딸기 바나다
		Choice choice=new Choice();
		choice.add("사과");
		choice.add("딸기");
		choice.add("바나나");

		frame.add(choice);

		// 라디오를 이용하여 남,여를 체크한다.
		// 주의) java 에서는 라디오라는 말이 없다.
		// checkbox 를 그룹화 시켜야 한다.
		CheckboxGroup group = new CheckboxGroup();
		Checkbox c1= new Checkbox("남", group, false);
		Checkbox c2= new Checkbox("여", group, true);

		frame.add(c1);		
		frame.add(c2);		

		// Textarea 동일
		TextArea ta=new TextArea(30,20);

		frame.add(ta);

	}
}
