/* String �� ���� �ڼ��� �˾ƺ��� */
package use;

class StringTest1{

	public static void main(String[] args){
		// implicit(������,�Ͻ���) ������
		// ��ġ �Ϲݺ���ó�� �����ϴ� ���
		// heap ������ ���Ǯ�� "kroea" �� ����. ���Ǯ������ �ߺ��������� �ʱ� ������ 
		// ������ ���������� String ��ü�� �����ϸ� Constant Pool �� ��ü�� �����ǹǷ�
		// �̹� �����ϴ� ���ڿ� ��ü�� ��� �ߺ� �������� �ʴ´�.
		// ����, �Ʒ��� �� �����ڴ� �ּҺ� ����.
		String s1="korea";
		String s2="korea";

		// explicit(����� ������)
		// ��ü�������� �״�� ����� ���
		String s3=new String("korea");
		String s4=new String("korea");

		System.out.println(s3.equals(s4));
	}
	
}
