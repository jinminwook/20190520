package ex20190520;

public class Car  {
	
	
	
	Tire hk = new HankookTire();
	Tire kh = new HankookTire();
	Tire ms = new HankookTire();
	Tire mz = new HankookTire();
	
	void run() {
		hk.roll();
		kh.roll();
		ms.roll();
		mz.roll();
		
	}
	
}
