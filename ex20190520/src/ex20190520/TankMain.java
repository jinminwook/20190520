package ex20190520;

public abstract class TankMain {

	public static void main(String[] args) {
		Tank nana = new Tank();
		nana.work();
		nana.fire();
		
		Ccar car;
		car = new Tank();
		car.work();//car�������̽� Ÿ���� �����̱� ����
		//work �޼ҵ常 ȣ�� ����
		
		Cannon cannon;
		cannon = new Tank();
		cannon.fire();
		
	}

}
