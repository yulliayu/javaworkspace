/* �ڹ��� �޼��忡 ���� �н��Ѵ�. 
    1. �Ű����� �ִ� �Լ�
	2. ��ȯ�� �ִ� �Լ�
*/
class Phone{
	// �Ű����� �ִ� (�ν��Ͻ�) �޼���
	// this ��? �ν��Ͻ��� �ڱ� �ڽ��� ����Ű�� ���� ���۷��� ���� �̴�.
	public void call(int a){
		//this.getPrice(); // ������. �׳� getPrice() �� �ᵵ ������.
		System.out.println(this);
	}

	// ��ȯ�� �ִ� (�ν��Ͻ�) �޼���
	// ��ȯ���� ���� ��쿣, �ݵ�� �� ��ȯ���� �ش��ϴ� �ڷ����� �޼��� �� �տ� ����ؾ� �Ѵ�.
	public int getPrice(){
		return 5;
	}

	public static void main(String[] args){
		// Phone �� �ν��Ͻ� �޼��常 �����ϰ� �����Ƿ�,
		// �޼��带 ����ϱ� ���ؼ��� ���� Phone �� �ν��Ͻ��� �޸𸮿� �������� �켱�̴�.
		Phone p = new Phone();
		p.call(70);
		System.out.println(p);
		
		int y=p.getPrice();
		System.out.println(y);
	}
}
