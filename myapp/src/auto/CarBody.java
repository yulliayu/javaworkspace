/* �Ʒ� Ŭ�������� ��������� �� �ڷ����� ��ü���� ��츸, has a ����� �Ѵ�.
    ��, ����� �ϸ� �繰�� ������� �Ѵ�.
*/
package auto;

public class CarBody{

	int price;
	String name;

	Handle h;
	Engine e;
	Wheel w; // ��ü�ڷ����� �����Ϸ��� ���� ����Ʈ �ʱ�ȭ�� ����? null
	               // �ƹ��� ��ü�� ����Ű�� ���� ���� ���۷��� ������ null �� �ʱ�ȭ��.
				   // null ��?? ���� ���ٴ� ��...
	boolean airType;	

	public CarBody(){
		h = new Handle();
		e = new Engine();
		w = new Wheel();
	}
}
