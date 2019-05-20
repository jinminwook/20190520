package ex20190520;
//RemoteControl 인터페이스의 구현 클래스로 선언
public class Television implements RemoteControl {
	/*인터페이스의 구현 클래스는
	 * 일반클래스와 같이 필드,생성자,메소드를 가질 수 있으며
	 * 인터페이스에서 선언한 추상메소드에 대한 재정의는
	 * 꼭 해야함.
	 */
	//필드선언
	private int volume;
	//추상메소드 재정의
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
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
}
