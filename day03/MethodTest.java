/*
�ڹپ��� �ڷ����� �� 4����.
��ü���� �ڷ����̴�.
�޼��� ȣ��� �ѱ�� ���� ������ ũ�� �ΰ��� ������ �ִ�.
1. �⺻ �ڷ���
   - �⺻ �ڷ����� �޼����� �μ��� �ѱ涧�� ȣ��� �Ȱ��� ���� ����Ǿ�, ���� �Ѿ��.
     ���� �ش� ���� ������ ������ ������ �ȹ޴´�. (call by value)
2. ��ü �ڷ���
   - �޼��� ȣ��� �μ��� �ѱ� �����Ͱ� ��ü���� ��� �� �ּҰ��� �Ѿ�Ƿ�, �ش� ��ü�� ������ �޴´�. 
     (call by reference)
*/
class MethodTest{
	public void test1(Food food){
		food.name="��ġ ������";
	}

	public static void main(String[] args){
		Food f1=new Food();
		System.out.println(f1.name);

	    MethodTest mt=new MethodTest();

		mt.test1(f1);
	}
}
