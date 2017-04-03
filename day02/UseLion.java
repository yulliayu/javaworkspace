class UseLion{
	
	public static void main(String[] args){
		int a=3;
		// 사자 2마리의 인스턴스를 생성하자.
		Lion lion1=new Lion();
		Lion lion2=new Lion();

		System.out.println(a);

		// 변수가 객체의 주소값을 담고 있을 경우 이러한 변수를 가리켜 
		//  레퍼런스 변수 reference (언급, 참조) 라 한다.
		// 참조 변수는 객체 자체를 보유하는 것이 아니라, 
		// 단지 그 객체가 heap 영역 중 어느 위치에 있는지 그 주소값만을 담고 있다.
		System.out.println(lion1);
	}
}
