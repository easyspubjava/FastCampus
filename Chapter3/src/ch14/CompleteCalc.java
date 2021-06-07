package ch14;

public class CompleteCalc extends Calculator{
	
	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if( num2 == 0 )
			return ERROR;
		else 
			return num1 / num2;
	}
	
	public void showInfo() {
		System.out.println("모두 구현하였습니다.");
	}

	@Override
	public void description() {
		System.out.println("CompleteCalc에서 재정의한 default 메서드");
		//super.description();
	}
	
	
}
