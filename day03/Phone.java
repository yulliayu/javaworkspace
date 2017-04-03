public class Phone {
	
	int memory=300; //A
	int price; //B : 인스턴스 변수는 자동 초기화 됨.
	
	public void call(){
		int n; //C : 초기화 하지 않았으나 여기서는 에러 안남.
		//System.out.println("n의 값은 "+n); //D : n 이 초기화되지 않아서 에러남. 초기화하지 않은 변수는 쓰려고 할때 에러남.
	}
}
