/*
sun 에서 제공하는 수많은 클래스들의 집합을 가리켜 API 라고 하며,
이 API 객체들에 대한 설명서를 가리켜 API Document
*/
package use;

class Test{

	int a=3;
	//Dog d;   // import 하지 않으면 에러남.
	String s; // import 하지 않아도 에러 안남.
	              // String 클래스도 sun 에서 제공하는 기본 API 객체 중 하나였다. 
				  // 또한 java.lang 패키지는 언어 작성시 너무나 기본적으로 필요한 것들 이므로 
				  // 개발자가 import 하지 않아도 된다.

	public static void main(String[] args){
		Test t=new Test();

		//System.out.println(t.a);

		String  str="korea vs japan";
		String  s="a vs j";

        for (int i=0; i<str.length(); i++)
        {
			char c=str.charAt(i);
			System.out.print(c);
        }

		System.out.println("");

		//System.out.println(str.substring(str.indexOf(s), str.indexOf(s)+s.length()));
		//System.out.println(s.lastIndexOf(s));
		int index=str.indexOf("r"); // 첫번째 공백문자 찾아 index 반환
		//System.out.println("공백의 index = "+index);
		System.out.println(str.substring(index-1, index+8));
		System.out.println(index);

		//System.out.println(str.matches(str));


	}
}
