package auto;

class UseCar{

	public static void main(String[] args){
		CarBody cb=new CarBody();

		// w �� null �ƴϵ��� ó���ϱ�.
		cb.w = new Wheel(); // ������ �ø���.
		System.out.println(cb.w);

		cb.h = new Handle();
		System.out.println(cb.h);

		cb.e = new Engine();
		System.out.println(cb.e);

	}
	
}
