package ex20190520;

public class Tank implements Ccar,Cannon{

	@Override
	public void fire() {
			System.out.println("������ �߻��մϴ�.");
	}

	@Override
	public void work() {
		System.out.println("��ũ�� �̵��ϰ� �־��!");
	}
	
}
