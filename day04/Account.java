// 은행 계좌를 정의한다.
/* 데이터를 보호하기 위한 자바의 보안 관련 4가지 접근제한자
    public < protected < default < private
	개발자가 접근 제한자를 지정하지 않으면 default 접근 제한자가 적용된다.
	주의) default 접근 제한자는 명시해서는 안되고, 그냥 두변 된다.

	public : 보안이 아니다. 모든 클래스가 접근할 수 있다.

	protected : 상속 관계에 있는 클래스간 접근 허용
	                  + 같은 패키지내에 있는 클래스.

	default : 같은 패키지내에 있는 클래스만 접근 허용.

	private : 외부의 모든 클래스의 접근을 불허한다.
	              맴버메서드만이 접근 가능.

은닉화란?
 - 클래스의 데이터를 담는 변수에 대한 접근을 private 으로 제한을 기하고,
   이 변수에 대해 제어할 수 있는 방법을 메서드를 통해 제공하는 클래스 작성 기법을 은닉화, 캡슐화(encaptulation)라 한다.

*/
class Account{
	String num="123-456-777";
	String name="수빈";
	private int   money=10000;

/*	// 데이터의 직접 접근은 막고, 이 데이터에 대한 사용은 
	//  개발자가 제공하는 메서드에 의해 제어할 수 있도록 허용해 주자.
	객체지향 언너에서 private 막아놓은 변수를 제어할 숭 ㅣㅆㄷ도록 정의되는 메서드들은 전세계 개바자들간의 명명규칙을 따라 정의해야 한다.
	값 변경을 위한 메서드를 setter 라 하고,
	값을 반환받기 위한 메서드를 getter 란 한다.
	getter, setter 표기 규칙
	단어와 단어가 만나면 뒷단어의 첫철자를 대문자로 표기해야 한다.
*/
	public void setMoney(int money){
		this.money=money;
	}

	public int getMoney(){
		return this.money;
	}

	public void setName(String name){
		this.name = name;
	}

}
