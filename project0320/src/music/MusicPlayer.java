/*
������� �����ؼ��� �ȵ����Ƿ�, ���α׷��� ��� �������� ������ ��ġ�� ���غ���.
*/
package music;
// �� �ϳ��� �߻�޼��带 ���� Ŭ������ ������ �߻� Ŭ������ �Ѵ�.
abstract public class MusicPlayer{
	// mp3 play ���
	// ������� ���� � ������ ©�� ������ �Ұ����ϱ� ������ 
	// �ֻ��� ��ü���� ������ �̸� ���� ���� ����.
	// �޼��忡 ��ü�� ������, �߻�޼���� �ϰ�
	// abstract �����ڶ� �Ҹ��� Ű���带 �ٿ��� �Ѵ�.
	// ����, �Ⱥ��̸� �Ǽ��� ���� {} �� ������ �� �˰� ������ ������ �߻��Ѵ�.
	// ���� ��ü���� �ݵ�� ����� ����� ����(���̵�)�Ҷ� ����� �� �ִ�.
	abstract public void playMP3();

	// ���� ����� ������ �ڽ��� �ڱ� ��Ȳ�� �°� �����ؾ� �ϹǷ�,
	// �߻� Ŭ���� ������ ������ �ۼ��� �� ���� ���̴�.
	abstract public void setVolume();
}