/*
�ڹ��� �ڷ����� 4�� �̸� ��ü�ڷ����� �ڷ����̴�.
����, �⺻ �ڷ��������� ����ȯ�� ��Ģ�� ��ü�ڷ������� ����ȴ�.

*/
package animal.fish;
public class Nimo extends Fish{
	                      /*is a ���� : �� ���� �ڷ����� �ȴ�. */
	public String name="�� �ϸ��";

	public Nimo(){
		super("Fish");
	}

	public void swim(){
		System.out.println(super.name+"�� �����Ŀ�");
	}
}
