package music;

class UsePlayer{

	public static void main(String[] args){
		new MP3Player();
		//new MusicPlayer(); // 불완전한 클래스는 절대 new 로 생성할 수 없다.
		                             // new 할 수는 없지만, 자식이 생성될때 
									 // 부모의 인스턴스 먼저 생성되는 원칙에 따라 메모리에 올라간다.
	}
	
}
