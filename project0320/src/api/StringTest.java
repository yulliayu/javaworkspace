/*
String 에 대해 좀 더 알아보자
*/
package api;

class StringTest{

	public static void main(String[] args){
		//StringTest st=new StringTest();
		// String 은 불변이다. (immutable)
		String str="korea";    // 상수풀에 korea 라는 str 생성
		str=str+"fighting";     // 상수풀에 korea fighting str 생성
		                                 // 결과적으로 2개의 String 이 생성된다.
		// 여기서 korea가 수정될 것으로 생각되지만
		// 사실상 String 은 한번 생성되면 절대 변경되지 않는 상수다

		// 해결책) String 을 이용하여 많은 문자열을 조합하려고 할때는 어떻게 해야 하나??
		//           변경가능한 문자열을 처리해주는 api 이용.
		StringBuffer sb = new StringBuffer();
		// StringBuffer 에 추가될 뿐이며 새로운 문자열 상수를 생성하지 않는다.
		// 즉 1개로 개발 가능.
		sb.append("korea");
		sb.append("fighting");
		sb.append("and");
		sb.append("forever");

		// sb 는 String 형이 아니기 때문에, 
		// println 인수로 넣으면 (자동 변환되긴 하지만)
		// 정석대로 개발한다면 String 형으로 변환해야 한다.
		// object 라는 최상위 객체가 보유한 메서드 중 객체를 String 으로 변환해주는 메서드가 있다. 바로  toString()
		System.out.println(sb.toString());
	}
}
