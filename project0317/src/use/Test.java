/*
sun ���� �����ϴ� ������ Ŭ�������� ������ ������ API ��� �ϸ�,
�� API ��ü�鿡 ���� ������ ������ API Document
*/
package use;

class Test{

	int a=3;
	//Dog d;   // import ���� ������ ������.
	String s; // import ���� �ʾƵ� ���� �ȳ�.
	              // String Ŭ������ sun ���� �����ϴ� �⺻ API ��ü �� �ϳ�����. 
				  // ���� java.lang ��Ű���� ��� �ۼ��� �ʹ��� �⺻������ �ʿ��� �͵� �̹Ƿ� 
				  // �����ڰ� import ���� �ʾƵ� �ȴ�.

	public static void main(String[] args){
		Test t=new Test();

		//System.out.println(t.a);

		String  str="korea vs japan";
		String  s="a vs j";

        for (int i=0; i<str.length(); i++)
        {
			char c=str.charAt(i);
			System.out.print(c);
        }

		System.out.println("");

		//System.out.println(str.substring(str.indexOf(s), str.indexOf(s)+s.length()));
		//System.out.println(s.lastIndexOf(s));
		int index=str.indexOf("r"); // ù��° ���鹮�� ã�� index ��ȯ
		//System.out.println("������ index = "+index);
		System.out.println(str.substring(index-1, index+8));
		System.out.println(index);

		//System.out.println(str.matches(str));


	}
}
