// 나와는 다른 위치에 존재하는 클래스를 사용해 본다
// 주의) 자바는 클래스 위치를 알기 위해 classpath 만을 쳐다 본다.
package use;  // 저장할 dir 지정.
import animal.bird.Duck;  // Duck 클래스를 사용하기 위해 지정.

class UseDuck{
	public static void main(String[] args){
		Duck d=new Duck();
	}
	
}
