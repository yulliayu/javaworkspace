package animal.fish;

public class Fish{
	String name="난 물고기";

	// 상속관계에서 부모클래스가 인수 있는 생성자를 명시할 경우,
	// 디폴트 생성자를 사용하지 않게 되므로 에러가 발생할 수 있다.
	public Fish(String name){
	}

	/*
	public Fish(){
		int x=3; // super 보다 위에 들어가면 에러. 부모(super) 생성보다 우선되는 코드는 존재할 수 없기 때문에
		             // super() 를 아래 명시하지 않았다면, int x=3; 위에 있는 것으로 간주한다.
		super(); // 기본적으로 들어 있다.
    }
	*/

	public void swim(){
		System.out.println("물고기가 수영쳐요");
	}
}
