/* ���� ����� ���� */
class UseFlower{
	// ���� �޼���. ��, ������̴�.
	public static void main(String[] args){
		// �� 3���� �޸𸮿� �ø���, ������ ���� open, close �� ȣ���� ����.

		Flower f1=new Flower();
		Flower f2=new Flower();
		Flower f3=new Flower();

		f1.open();
		f1.close();

		f2.open();
		f2.close();

		f3.open();
		f3.close();

		System.out.println(f1.color);
	}
}
