package ch16.gamelevel;

public class BeginnerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("jump 못하지롱");
	}

	@Override
	public void turn() {
		System.out.println("turn 못하지롱");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("****** 초급자 레벨입니다. ******");
	}

}
