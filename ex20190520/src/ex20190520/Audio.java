package ex20190520;

public class Audio implements RemoteControl {

	private int volume;

	@Override
	public void turnOn() {
			System.out.println("오디오를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		}else if (volume<RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		System.out.println("현재 TV볼륨  : "+volume);
		
	}
	
	/*
	 * RemoteControl 인터 페이스의 구현 클래스로 선언
	 */
}
