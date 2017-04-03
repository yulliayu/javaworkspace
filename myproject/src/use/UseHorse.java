// 나와는 다른 위치에 존재하는 horse 을 사용해 보자.
// 자바는 나와는 다른 패키지에 있는 클래스를 참조시 오직 classpath 환경변수만 쳐다본다.
// 따라서 아래의 import 문에 aminal.Horse 의 경우 앞에 그 앞에 환경변수의 값이 생략되어 있다고 이해.
// 환경변수 : classpath = C:\java_workspace\myproject\bin 로 지정되어야 함. 쓰고자 하는 dir 지정.
package use;
// 내가 사용할 객체의 경로 표시. 
import animal.Horse;

class UseHorse{
	public static void main(String[] args){
		Horse h=new Horse();
		System.out.println("UseHorse 실행");
	}
}
