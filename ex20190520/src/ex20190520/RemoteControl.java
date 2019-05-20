package ex20190520;

public interface RemoteControl {
	/*인터페이스(interface)
	 * 1.인터페이스는 main 코드와 객체간의 접점 역할을 함.
	 * 2.객체의 다형성을 구현하는데 용이함.
	 * 3.인터페이스의 구성 요소
	 * 	3.1 상수 필드만 선언이 가능함.
	 * 		일반적인 필드로 선언해도 컴파일 과정에서
	 * 		static final 이 자동으로 붙음.
	 * 	3.2 추상메소드를 가짐.
	 * 	3.3 디폴트 메소드 가짐.
	 * 		접근제한 default가 아니라 기본으로 가지고있는 메소드개념.
	 * 	3.4정적(static)메소드 가짐.
	 * 		인터페이스를 객체화 하지 않고도 직접 호출 가능.
	 */
	//필드선언
	//인터페이스는 상수 필드만 가짐.
	//static final을 붙이지 않아도 자동으로 적용됨.
	public int MAX_VOLUME=10;
	public int MIN_VOLUME=0;
	//메소드 선언
	//인터페이스에는 추상 메소드 선언만 가능
	//abstract 를 붙이지 않아도 자동으로 적용됨.
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	//디폴트메소드 선언
	default void setMute(boolean mute) {//디폴트라고 써야함. 안쓰면 추상메소드로 인식함.
		if(mute) {
			System.out.println("무음 처리 합니다.");
		}else {
			System.out.println("무음 해제 합니다.");
		}
		//정적(static void)메소드 선언 =>되도록이면 쓰지않는게 좋다.
		
	}
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}		
	}

