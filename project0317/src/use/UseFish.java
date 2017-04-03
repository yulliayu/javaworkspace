/* 물고기들을 써보자
*/
package use;
import   animal.fish.Fish;
import   animal.fish.Nimo;

class UseFish{

	public static void main(String[] args){
		Fish f1 = new Fish("삼치");
		Nimo n1=new Nimo();
		System.out.println(f1.equals(n1));
		Object obj=f1; // 가능.
		//System.out.println(n1.name); // Nimo 의 name
		//System.out.println(super.name); // UseFish 는 static 이기 때문에 인스턴스가 아니다.
		                                                  // 
		n1.swim();

		//f1.swim();
		// 형변환 해보자. 같은 자료형끼리 가능.
		// Fish 와 Nimo 는 같은 자료형이다.
		//f1=n1;
		//n1=(Nimo)f1;
	}
}
