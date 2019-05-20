package ex20190520;

public class CarMain {

	public static void main(String[] args) {
		//필드의 다형성
		
		//Car 클래스 객체 선언
		Car nana = new Car();
		nana.run();
		
		nana.ms=new KumhoTire();
		nana.mz=new KumhoTire();
		
		nana.run();
	}
	
	
	
	
}
