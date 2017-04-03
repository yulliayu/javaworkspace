// 이긍열 상원이 만들게 될 MP3Player 
package music;

// 상속시 부모가 불완전한 추상클래스 일 경우
// 완전하게 코드를 완성할 의무는 자식에게 주어진다.
// 
public class MP3player extends MusicPlayer implements Jet{
	                             /* is a */                  /* is a */ 
	// 이퀄라이져를 이용한 시각화 기능
	public void equalizer(){
		System.out.println("오르락 내이락");
	}

	// 부모가 완성 못한 메서드를 여기서 완성한다.
	public void playMP3(){
		System.out.println("MP3 플레이중...");
	}

	public void setVolume(){
	}

	// Jet 에 있는 메서드
	public void fly(){  
	}
}
