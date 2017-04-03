/*수정자에 대해 학습한다.
static : 클래스변수, 클래스 메서드를 선언하기 위한 수정자
abstract : 클래스에 붙이면 = 추상클래스
                메서드에 붙이면 = 추상메서드
				변수에 붙이면 에러.
final : 마지막...
         변수에 붙이면    = 더이상 값을 변경시킬 수 없다.
		 메서드에 붙이면 = 자식에 의해 더이상 오버라이딩 금지
		 클래스에 붙이면 = 상속 금지(그 집안의 종료)
*/
package api;

class FinalTest{
	public static void main(String[] args){
		// static public 순서로 써도 가능
		final int a=3;
		a=7; // a 변수에 final 이 지정되어 할당 불가능.
	}
}
