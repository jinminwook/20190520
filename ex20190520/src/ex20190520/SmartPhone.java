package ex20190520;
//PDA�� ��ӹް�
//MP3,MobilePhone �� ����
public class SmartPhone extends PDA implements MP3,MobilePhone{

	@Override
	public void Tell() {
		System.out.println("��ȭ�� �մϴ�.");
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ�� �޽��ϴ�.");
	}

	@Override
	public void massege() {
		System.out.println("�޼����� �����ϴ�.");
	}

	@Override
	public void receivemassege() {
		System.out.println("�޼����� �޽��ϴ�.");
	}

	@Override
	public void play() {
		System.out.println("������ ����մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("������ �����մϴ�.");
	}

	
	
}
