package ex20190520;

public interface RemoteControl {
	/*�������̽�(interface)
	 * 1.�������̽��� main �ڵ�� ��ü���� ���� ������ ��.
	 * 2.��ü�� �������� �����ϴµ� ������.
	 * 3.�������̽��� ���� ���
	 * 	3.1 ��� �ʵ常 ������ ������.
	 * 		�Ϲ����� �ʵ�� �����ص� ������ ��������
	 * 		static final �� �ڵ����� ����.
	 * 	3.2 �߻�޼ҵ带 ����.
	 * 	3.3 ����Ʈ �޼ҵ� ����.
	 * 		�������� default�� �ƴ϶� �⺻���� �������ִ� �޼ҵ尳��.
	 * 	3.4����(static)�޼ҵ� ����.
	 * 		�������̽��� ��üȭ ���� �ʰ� ���� ȣ�� ����.
	 */
	//�ʵ弱��
	//�������̽��� ��� �ʵ常 ����.
	//static final�� ������ �ʾƵ� �ڵ����� �����.
	public int MAX_VOLUME=10;
	public int MIN_VOLUME=0;
	//�޼ҵ� ����
	//�������̽����� �߻� �޼ҵ� ���� ����
	//abstract �� ������ �ʾƵ� �ڵ����� �����.
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	//����Ʈ�޼ҵ� ����
	default void setMute(boolean mute) {//����Ʈ��� �����. �Ⱦ��� �߻�޼ҵ�� �ν���.
		if(mute) {
			System.out.println("���� ó�� �մϴ�.");
		}else {
			System.out.println("���� ���� �մϴ�.");
		}
		//����(static void)�޼ҵ� ���� =>�ǵ����̸� �����ʴ°� ����.
		
	}
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}		
	}

