package ex20190520;

public class SmartPhoneMain {

	public static void main(String[] args) {
		SmartPhone nana = new SmartPhone();
		nana.Tell();
		nana.receiveCall();
		nana.massege();
		nana.receivemassege();
		nana.play();
		nana.stop();
		System.out.println(nana.plus(10, 10));
		
		
	}	

}
