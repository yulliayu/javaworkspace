// �̱࿭ ����� ����� �� MP3Player 
package music;

// ��ӽ� �θ� �ҿ����� �߻�Ŭ���� �� ���
// �����ϰ� �ڵ带 �ϼ��� �ǹ��� �ڽĿ��� �־�����.
// 
public class MP3player extends MusicPlayer implements Jet{
	                             /* is a */                  /* is a */ 
	// ������������ �̿��� �ð�ȭ ���
	public void equalizer(){
		System.out.println("������ ���̶�");
	}

	// �θ� �ϼ� ���� �޼��带 ���⼭ �ϼ��Ѵ�.
	public void playMP3(){
		System.out.println("MP3 �÷�����...");
	}

	public void setVolume(){
	}

	// Jet �� �ִ� �޼���
	public void fly(){  
	}
}
