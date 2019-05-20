package ex20190520;

public class Tank implements Ccar,Cannon{

	@Override
	public void fire() {
			System.out.println("대포를 발사합니다.");
	}

	@Override
	public void work() {
		System.out.println("탱크가 이동하고 있어요!");
	}
	
}
