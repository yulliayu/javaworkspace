/*
�޼���� �Լ��̹Ƿ�, �Ϲ����� ����� �Լ��� ����Ǵ� ������ �ڹ��� �޼��忡�� �����ϰ� ����ȴ�.
����, ��ȯ��, �Ű������� ������ ����.
*/
class Dog{
	String name="�ǹ�";
	String type="��Ƽ��";

	public void setName(String n, String t){
		this.name=n;
		this.type = t;
	}

	// �ڹٿ� ���� �Ϲ����� �������α׷������� (c, c#���� ��κ� ���)
	// return ���� �ִ� �Լ��� ���, �ݵ�� �ش� ���ϰ��� �˸´� �ڷ����� �޼���� �տ� ����ؾ� �Ѵ�.
	public String getName(){
		return name;
	}
}
