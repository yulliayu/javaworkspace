/*
String �� ���� �� �� �˾ƺ���
*/
package api;

class StringTest{

	public static void main(String[] args){
		//StringTest st=new StringTest();
		// String �� �Һ��̴�. (immutable)
		String str="korea";    // ���Ǯ�� korea ��� str ����
		str=str+"fighting";     // ���Ǯ�� korea fighting str ����
		                                 // ��������� 2���� String �� �����ȴ�.
		// ���⼭ korea�� ������ ������ ����������
		// ��ǻ� String �� �ѹ� �����Ǹ� ���� ������� �ʴ� �����

		// �ذ�å) String �� �̿��Ͽ� ���� ���ڿ��� �����Ϸ��� �Ҷ��� ��� �ؾ� �ϳ�??
		//           ���氡���� ���ڿ��� ó�����ִ� api �̿�.
		StringBuffer sb = new StringBuffer();
		// StringBuffer �� �߰��� ���̸� ���ο� ���ڿ� ����� �������� �ʴ´�.
		// �� 1���� ���� ����.
		sb.append("korea");
		sb.append("fighting");
		sb.append("and");
		sb.append("forever");

		// sb �� String ���� �ƴϱ� ������, 
		// println �μ��� ������ (�ڵ� ��ȯ�Ǳ� ������)
		// ������� �����Ѵٸ� String ������ ��ȯ�ؾ� �Ѵ�.
		// object ��� �ֻ��� ��ü�� ������ �޼��� �� ��ü�� String ���� ��ȯ���ִ� �޼��尡 �ִ�. �ٷ�  toString()
		System.out.println(sb.toString());
	}
}
