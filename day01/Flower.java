/*
꽃을 정의해 보자.
속성 메서드 : 색상, 향기 (변수)
동작들 : 핀다, 진다 (함수지만, 명칭은 메서드)
*/
class Flower{
	String color="빨강";
	String scent="";
	int      leaf=20;
	boolean isMan=true;

	//  피는 행위를 표현할 메서드
	public void open(){
		System.out.println("꽃이 핍니다");
	}

	// 지는 행위를 표현할 메서드
	public void close(){
		System.out.println("꽃이 집니다");
	}
}
