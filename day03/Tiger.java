class Tiger{
	String name="호랑이";
	// Tiger 클래스의 생성자를 정의한다.
	// 생성자를 사용하는 이유?
	// 일반 데이터가 아니라, 적어도 사물을 생서한다는 것은 상당히 복잡하다.
	// 따라서 객체가 생성되는 시점에 개발자가 원하는 스타일의 객체에 대한 초기화의 기회를 주기 위해
	// sun 에서는 new 연산자 뒤에 생성자란 이름으로 불리는 메서드를 무조건 호츨해 놓았다.
	// 생성자는 new 연산자 뒤에서 호출을 강제하기 때문에 코드내에 존재하지 않을 경우 에러가 발생하게 되어 있따.
	// 이 문제를 해결하기 위해 sun 에서는 개발자가 생성자의 초기화 의도가 없는 경우 디폴트 생성자를 자동으로 넣어준다.
	public Tiger(){
		System.out.println("디폴트 생성자 호출");
	}

	// new 연산자 뒤에 언제나 호출 해야하는 메서드를 생성자 메서드라 한다.
	// 생성자 메서드의 역할은?
	//   - 객체의 인스턴스 생성시 개발자로 하여금 초기화의 기회를 준것이다.
	public static void main(String[] args){
		Tiger t1=new Tiger(); // 
	}
}
