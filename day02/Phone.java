/* 자바의 메서드에 대해 학습한다. 
    1. 매개변수 있는 함수
	2. 반환값 있는 함수
*/
class Phone{
	// 매개변수 있는 (인스턴스) 메서드
	// this 란? 인스턴스가 자기 자신을 가리키기 위한 레퍼런스 변수 이다.
	public void call(int a){
		//this.getPrice(); // 가능함. 그냥 getPrice() 로 써도 가능함.
		System.out.println(this);
	}

	// 반환값 있는 (인스턴스) 메서드
	// 반환값이 있을 경우엔, 반드시 그 반환값에 해당하는 자료형을 메서드 명 앞에 명시해야 한다.
	public int getPrice(){
		return 5;
	}

	public static void main(String[] args){
		// Phone 은 인스턴스 메서드만 보유하고 있으므로,
		// 메서드를 사용하기 위해서는 먼저 Phone 의 인스턴스를 메모리에 생성함이 우선이다.
		Phone p = new Phone();
		p.call(70);
		System.out.println(p);
		
		int y=p.getPrice();
		System.out.println(y);
	}
}
