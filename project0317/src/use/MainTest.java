package use;

class MainTest{

	// main �޼���� �ý����� ȣ���ϹǷ�, 
	// �� java.exe ����� ȣ���ع����Ƿ� �����ڰ� ȣ���� �� ����.
	public static void main(String[] args){
		/*
		mario.jpg �� ���� ���������� �μ��� ������
		�� �м������ �����ֱ�

		���ϸ��� mario
		Ȯ���ڴ� jpg

		int len = args.length;
		//System.out.println("����� �ѱ� �迭�� ���̴� "+ len);

		// Integer.parseInt �� return �� static int �̱� ������ Interger ���� ���� ��� ����.
		// �μ��� �ѱ� ���ڿ��� ���� ����ȭ ��Ŵ.
		int dan = Integer.parseInt(args[0]); 
		//System.out.println(args[0]);

		for (int i=1; i<=9; i++)
		{
			System.out.println(dan + " * "+i + " = "+(dan*i));
		}

		*/

		String[] arr=args[0].split("\\.");

		System.out.println("���ϸ��� " + arr[0]);
		System.out.println("Ȯ���ڴ� " + arr[1]);

	}
}
