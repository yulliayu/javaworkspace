
package api;

class UseWrapper{
	public static void main(String[] args){
		Integer i=new Integer("3"); // ���� 3�� �־ ���� 3���� ����.
		//i=5; // �⺻�ڷ����� ��ü�ڷ������� �޾����Ƿ�  unBoxing

		int x=3;
		x=i;    // ��ü�ڷ����� �⺻�ڷ������� �޾����Ƿ� Boxing
	}
}
