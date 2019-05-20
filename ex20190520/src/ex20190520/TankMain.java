package ex20190520;

public abstract class TankMain {

	public static void main(String[] args) {
		Tank nana = new Tank();
		nana.work();
		nana.fire();
		
		Ccar car;
		car = new Tank();
		car.work();//car인터페이스 타입의 변수이기 때문
		//work 메소드만 호출 가능
		
		Cannon cannon;
		cannon = new Tank();
		cannon.fire();
		
	}

}
