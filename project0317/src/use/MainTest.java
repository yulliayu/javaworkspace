package use;

class MainTest{

	// main 메서드는 시스템이 호출하므로, 
	// 즉 java.exe 실행시 호출해버리므로 개발자가 호출할 수 없다.
	public static void main(String[] args){
		/*
		mario.jpg 와 같이 파일정보를 인수로 넣으면
		그 분석결과를 보여주기

		파일명은 mario
		확장자는 jpg

		int len = args.length;
		//System.out.println("당신이 넘긴 배열의 길이는 "+ len);

		// Integer.parseInt 는 return 이 static int 이기 때문에 Interger 선언 없이 사용 가능.
		// 인수로 넘긴 문자열을 실제 정수화 시킴.
		int dan = Integer.parseInt(args[0]); 
		//System.out.println(args[0]);

		for (int i=1; i<=9; i++)
		{
			System.out.println(dan + " * "+i + " = "+(dan*i));
		}

		*/

		String[] arr=args[0].split("\\.");

		System.out.println("파일명은 " + arr[0]);
		System.out.println("확장자는 " + arr[1]);

	}
}
