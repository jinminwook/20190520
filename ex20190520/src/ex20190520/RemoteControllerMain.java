package ex20190520;

public class RemoteControllerMain {

	public static  void main(String[] args) {
		
		//�������̽� Ÿ���� ���� rc�� ����
		RemoteControl rc;
		//rc�� TV��ü�� �����ؼ� TV�� �� �޼ҵ带 ȣ���ϰ�.
		rc= new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		rc.setMute(false);
		//rc�� Audio ��ü�� �� ���ؼ� Audio�� �� �޼ҵ� ȣ��
		rc=new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		rc.setMute(false);
		//smartTelevision�� �� �޼ҵ� ȣ��
		rc=new SmartTelevision();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		rc.setMute(false);
		//changeBattery �޼ҵ� ȣ��
		SmartTelevision smtv = new SmartTelevision();
		smtv.turnOn();
		smtv.turnOff();
		smtv.setVolume(5);
		smtv.search("����");
		RemoteControl.changeBattery();
		
		
		
	}

}
