/*
GridLayout 배치관리자

자바의 GUI 컴포넌트는 크게 2가지로 분류된다.
1. 남을 포함하는자  (컨테이너)
   Frame, Panel
   컨테이너는 다른 컴포넌트를 어떻게 올려 놓을지
   즉, 배치를 어떻게 할지를 고민하는 주체이므로
   모든 컨테이너는 setLayout 이라는 메서드가 지원되고 있다.
   만일 개발자가 아무것도 지정되지 않으면??
   Frame - BorderLayour 이 default 지정.
                그래서 아까 최초에 대왈버튼을 만났다.
	Panel - FlowLayout 이 default 지정.

2. 남에게 포함당하는 자 (비주얼컴포넌트)
   Button, TextField, Checkbox...... (1.번 외 나머지..)
*/
package gui;
import java.awt.*; // java.awt.* 라 하더라도 경로를 지정하는 것 뿐이지, 메모리에 영향을 미치지는 않는다.

class GridTest{
	public static void main(String[] args){
		
		Frame frame=new Frame("그리드 공부");
		frame.setVisible(true); // 보이게
		frame.setSize(200, 500);


		// 개발을 하다보면 기본자료형과 객체자료형 간의 형변환이라던가,
		// 기본자료형만으로는 할 수 없는 기능을 구형해야할 경우가 있다
		// 이때 지원되는 클래스가 바로 Wrapper 클래스인데,
		// 자바의 모든 기본자료형마다 1:1 대응하는 Wrapper 클래스가 있다.
		// byte  --> Byte
		// short --> Short
		// int  --> Integer
		// long   --> Long
		// float  --> Float
		// double --> Double
		// boolean --> Boolean
		// char      --> Character
		// Wrapper 클래스 목적 
		// 1) 기본자료형과 객체자료형 간의 형변화
		// 2) 기본자료형을 대상으로 보다 다양하고 복잡한 기능을 구현시
		//      객체차원으로 끌어올려 보다 많은 메서드를 이용하여 업무를 처리하기 위해 지원.
		// 문자 "21" 을 기본자료형으로 변환 --> 21
		// int a=Integer.parseInt("21");

		// Frame 은 디폴트가 BorderLayout 이므로 
		// GridLayout 을 지정해 보자.
		GridLayout grid = new GridLayout(5,2);  // 5층 2호수
		frame.setLayout(grid); // 그리드 적용.
		for (int i=1; i<=10; i++)
		{
			Button bt=new Button(Integer.toString(i)); // 기본자료형을 객체의 자료형으로..
			frame.add(bt);
		}
	}
}
