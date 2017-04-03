package auto;

class UseCar{

	public static void main(String[] args){
		CarBody cb=new CarBody();

		// w 가 null 아니도록 처리하기.
		cb.w = new Wheel(); // 바퀴를 올린다.
		System.out.println(cb.w);

		cb.h = new Handle();
		System.out.println(cb.h);

		cb.e = new Engine();
		System.out.println(cb.e);

	}
	
}
