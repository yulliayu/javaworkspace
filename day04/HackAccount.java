/*Account Ŭ������ ����Ϸ��� ������ Ŭ����!!*/
class HackAccount{
	public static void main(String[] args){
		// Account Ŭ������ �ν��Ͻ��� ������ �ϱ�.
		Account acc=new Account();
		//acc.money=-10000;

		//System.out.println(acc.money);
		acc.setMoney(-1000);

		// �ݿ����θ� ����� ����
		int total = acc.getMoney();
		System.out.println(total);

	}
}
