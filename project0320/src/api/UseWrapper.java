
package api;

class UseWrapper{
	public static void main(String[] args){
		Integer i=new Integer("3"); // 문자 3을 넣어도 정수 3으로 지정.
		//i=5; // 기본자료형을 객체자료형으로 받았으므로  unBoxing

		int x=3;
		x=i;    // 객체자료형을 기본자료형으로 받았으므로 Boxing
	}
}
