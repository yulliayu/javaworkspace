public class Flower {
	int leaf=10; //A : 인스턴스 변수
	static int height=30; //B : 클래스변수
	
	public void grow(){;//C
		int h=5;
	}
	
	public static void main(String[] args){
		height=20;//D
		
		Flower f1 = new Flower();
		Flower f2 = new Flower();
		
		f2.height=100; //E 
		System.out.println(height); //F
	}
} 
