class Desk{
	String color="red"; // 인스턴스 변수
	static String color1="red"; // 클래스 변수.
	public static void main(String[] args){
		color="yellow"; // 에러
		color1="yellow"; // static 이고 main 이 같은 클래스 Desk 안에 있으므로 가능.
		
	}
	
}
