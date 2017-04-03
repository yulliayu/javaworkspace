/* String 에 대해 자세히 알아보기 */
package use;

class StringTest1{

	public static void main(String[] args){
		// implicit(묵시적,암시적) 생성법
		// 마치 일반변수처럼 생성하는 기법
		// heap 영역에 상수풀에 "kroea" 로 생성. 상수풀에서는 중복생성하지 않기 때문에 
		// 묵시적 생성법으로 String 객체를 생성하면 Constant Pool 에 객체가 생성되므로
		// 이미 존재하는 문자열 객체일 경우 중복 생성하지 않는다.
		// 따라서, 아래의 비교 연산자는 주소비교 였다.
		String s1="korea";
		String s2="korea";

		// explicit(명시적 생성법)
		// 객체생성법을 그대로 사용한 기법
		String s3=new String("korea");
		String s4=new String("korea");

		System.out.println(s3.equals(s4));
	}
	
}
