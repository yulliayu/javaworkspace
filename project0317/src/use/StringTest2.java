package use;

class StringTest2{

	public static void main(String[] args){
		String str="korea java";  

		// (1) ���ڿ����� 4��° ��ġ�� 'e' ���ڸ� �����Ͽ� ����ϼ���
		//System.out.println(str.indexOf("e"));
		System.out.println("(1)="+str.substring(str.indexOf("e"),str.indexOf("e")+1));

		// (2) ���� �� ù��° a�� index (����)�� ����ϼ���
		System.out.println("(2)=" + str.indexOf("a"));

		// (3) ���� �� ������ a�� index �� ����ϼ���
		System.out.println("(3)=" + str.lastIndexOf("a"));

		// (4) ���ڿ��� �� ���̸� ����ϼ���
		System.out.println("(4)=" + str.length());

		//(5) korea �� "�ڸ���"�� ��ü�Ͽ� "�ڸ��� java"�� ����ϼ���
		System.out.println("(5)=" + str.replace("korea","�ڸ���"));

		// (6) 3��°���� 8��° ���ڿ����� �����Ͽ� ����ϼ���
		System.out.println("(6)=" + str.substring(3,8));

		// (7) �빮�ڷ� ��ȯ�Ͽ� "KOREA JAVA" �� ����ϼ���
		System.out.println("(7)=" + str.toUpperCase());

	}
	
}
