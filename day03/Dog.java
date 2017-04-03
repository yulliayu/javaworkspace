/*
메서드는 함수이므로, 일반적인 언어의 함수의 적용되는 원리는 자바의 메서드에도 동일하게 적용된다.
따라서, 반환값, 매개변수의 개념이 같다.
*/
class Dog{
	String name="뽀미";
	String type="말티즈";

	public void setName(String n, String t){
		this.name=n;
		this.type = t;
	}

	// 자바와 같은 일반적인 응용프로그램에서는 (c, c#등의 대부분 언어)
	// return 값이 있는 함수의 경우, 반드시 해당 리턴값에 알맞는 자료형을 메서드명 앞에 명시해야 한다.
	public String getName(){
		return name;
	}
}
