package ex20190520;

public class CarMain {

	public static void main(String[] args) {
		//�ʵ��� ������
		
		//Car Ŭ���� ��ü ����
		Car nana = new Car();
		nana.run();
		
		nana.ms=new KumhoTire();
		nana.mz=new KumhoTire();
		
		nana.run();
	}
	
	
	
	
}
