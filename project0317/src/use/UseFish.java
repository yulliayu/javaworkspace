/* �������� �Ẹ��
*/
package use;
import   animal.fish.Fish;
import   animal.fish.Nimo;

class UseFish{

	public static void main(String[] args){
		Fish f1 = new Fish("��ġ");
		Nimo n1=new Nimo();
		System.out.println(f1.equals(n1));
		Object obj=f1; // ����.
		//System.out.println(n1.name); // Nimo �� name
		//System.out.println(super.name); // UseFish �� static �̱� ������ �ν��Ͻ��� �ƴϴ�.
		                                                  // 
		n1.swim();

		//f1.swim();
		// ����ȯ �غ���. ���� �ڷ������� ����.
		// Fish �� Nimo �� ���� �ڷ����̴�.
		//f1=n1;
		//n1=(Nimo)f1;
	}
}
