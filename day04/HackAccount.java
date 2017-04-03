/*Account 클래스를 사용하려는 악의의 클래스!!*/
class HackAccount{
	public static void main(String[] args){
		// Account 클래스의 인스턴스에 나쁜짓 하기.
		Account acc=new Account();
		//acc.money=-10000;

		//System.out.println(acc.money);
		acc.setMoney(-1000);

		// 반영여부를 출력해 보자
		int total = acc.getMoney();
		System.out.println(total);

	}
}
