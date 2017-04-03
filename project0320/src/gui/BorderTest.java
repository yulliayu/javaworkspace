/*
GUI 에서 콤포넌트를 내가 원하는 위치에 놓기 위해서는 배치를 알아야 한다.
자바 GUI 에서는 총 5개 유형의 배치관리자를 지원한다.
1.FlowLayout (★) : 고정되어 있지 않고, 일렬로 정렬되며 frame 사이즈에 따라 아래로 배치된다.
2.BorderLayout (★)
3.GridLayout
4.GridBagLayout
5.CardLayout
*/
package gui;

import java.awt.*;

class BorderTest{
	public static void main(String[] args){

		// width: 500, height : 400
		// BorderLayout 은 동서남부, 센터 라는 방위와 경계를 갖는 레이아웃이다.
		Frame frame = new Frame();

		// 프레임은 자신이 설정할 배치관리자를 결정하는 메서드를 가진다.
		frame.setLayout(new BorderLayout());
		frame.setSize(500,400);
		frame.setVisible(true);
		// 북쪽에 버튼 부착하자
		Button bt_north	=new Button("북쪽");
		Button bt_east		=new Button("동쪽");
		Button bt_south	=new Button("남쪽");
		Button bt_west		=new Button("서쪽");
		Button bt_center	=new Button("가운데");

		// 방위를 지정하지 않으면 센터에 위치한다.
		frame.add(bt_north, BorderLayout.NORTH); 
		frame.add(bt_east, BorderLayout.EAST); 
		frame.add(bt_south, BorderLayout.SOUTH); 
		frame.add(bt_west, BorderLayout.WEST); 
		frame.add(bt_center, BorderLayout.CENTER); 

	}
	
}
