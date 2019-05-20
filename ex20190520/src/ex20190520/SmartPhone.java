package ex20190520;
//PDA를 상속받고
//MP3,MobilePhone 을 구현
public class SmartPhone extends PDA implements MP3,MobilePhone{

	@Override
	public void Tell() {
		System.out.println("전화를 합니다.");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화를 받습니다.");
	}

	@Override
	public void massege() {
		System.out.println("메세지를 보냅니다.");
	}

	@Override
	public void receivemassege() {
		System.out.println("메세지를 받습니다.");
	}

	@Override
	public void play() {
		System.out.println("음악을 재생합니다.");
	}

	@Override
	public void stop() {
		System.out.println("음악을 정지합니다.");
	}

	
	
}
