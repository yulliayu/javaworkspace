/* 아래 클래스에서 멤버변수중 그 자료형이 객체형인 경우만, has a 관계라 한다.
    즉, 관계라 하면 사물을 대상으로 한다.
*/
package auto;

public class CarBody{

	int price;
	String name;

	Handle h;
	Engine e;
	Wheel w; // 객체자료형의 컴파일러에 의한 디폴트 초기화으 값은? null
	               // 아무런 객체를 가리키고 있지 않은 레퍼런스 변수는 null 로 초기화됨.
				   // null 은?? 값이 없다는 뜻...
	boolean airType;	

	public CarBody(){
		h = new Handle();
		e = new Engine();
		w = new Wheel();
	}
}
