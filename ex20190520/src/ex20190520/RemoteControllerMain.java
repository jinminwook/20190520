package ex20190520;

public class RemoteControllerMain {

	public static  void main(String[] args) {
		
		//인터페이스 타입의 변수 rc를 선언
		RemoteControl rc;
		//rc에 TV객체를 대입해서 TV의 각 메소드를 호출하고.
		rc= new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		rc.setMute(false);
		//rc에 Audio 객체를 대 입해서 Audio의 각 메소드 호출
		rc=new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		rc.setMute(false);
		//smartTelevision의 각 메소드 호출
		rc=new SmartTelevision();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		rc.setMute(false);
		//changeBattery 메소드 호출
		SmartTelevision smtv = new SmartTelevision();
		smtv.turnOn();
		smtv.turnOff();
		smtv.setVolume(5);
		smtv.search("구글");
		RemoteControl.changeBattery();
		
		
		
	}

}
