/*
생성자 정의 규칙
1) 클래스명과 동일 할 것
2) 반환형을 두지 말것!!
*/
class Ghost{
	String type;
	String color;

	// 구푸집에서 귀신을 생성할때 어떤 스타일로 생성할지를 아래의 메서드에서 결정.
	public Ghost(String type, String color){
		this.type=type;
		this.color=color;
	}

	public static void main(String[] args){

		Ghost g1=new Ghost("주온", "white");
		System.out.println(g1.type);
	}
}
