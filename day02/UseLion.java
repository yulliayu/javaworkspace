class UseLion{
	
	public static void main(String[] args){
		int a=3;
		// ���� 2������ �ν��Ͻ��� ��������.
		Lion lion1=new Lion();
		Lion lion2=new Lion();

		System.out.println(a);

		// ������ ��ü�� �ּҰ��� ��� ���� ��� �̷��� ������ ������ 
		//  ���۷��� ���� reference (���, ����) �� �Ѵ�.
		// ���� ������ ��ü ��ü�� �����ϴ� ���� �ƴ϶�, 
		// ���� �� ��ü�� heap ���� �� ��� ��ġ�� �ִ��� �� �ּҰ����� ��� �ִ�.
		System.out.println(lion1);
	}
}
