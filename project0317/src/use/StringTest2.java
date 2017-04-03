package use;

class StringTest2{

	public static void main(String[] args){
		String str="korea java";  

		// (1) 문자열에서 4번째 위치한 'e' 문자만 추출하여 출력하세요
		//System.out.println(str.indexOf("e"));
		System.out.println("(1)="+str.substring(str.indexOf("e"),str.indexOf("e")+1));

		// (2) 문장 중 첫번째 a의 index (순번)를 출력하세요
		System.out.println("(2)=" + str.indexOf("a"));

		// (3) 문장 중 마지막 a의 index 를 출력하세요
		System.out.println("(3)=" + str.lastIndexOf("a"));

		// (4) 문자열의 총 길이를 출력하세요
		System.out.println("(4)=" + str.length());

		//(5) korea 를 "코리아"로 대체하여 "코리아 java"를 출력하세요
		System.out.println("(5)=" + str.replace("korea","코리아"));

		// (6) 3번째부터 8번째 문자열까지 추출하여 출력하세요
		System.out.println("(6)=" + str.substring(3,8));

		// (7) 대문자로 변환하여 "KOREA JAVA" 를 출력하세요
		System.out.println("(7)=" + str.toUpperCase());

	}
	
}
