package ch16;

public class SwitchCaseUpTest {

	public static void main(String[] args) {
		
		int month = 10;
		
		int day = switch (month) {
	    	case 1, 3, 5, 7, 8, 10,12 -> {
	    		System.out.println("한 달은 31일입니다."); 
	    		yield 31;
	    	}
	    	case 4,6,9,11 -> {
	    		System.out.println("한 달은 30일입니다."); 
	    		yield 30;
	    	}
	    	case 2 ->{
	    		System.out.println("한 달은 28일입니다.");
	    		yield 28;
	    	}
	    	default->{
	    		System.out.println("존재하지 않는 달 입니다."); 
	    		yield 0;
	    	}
		};
		
		System.out.println(month + "월은 " + day + "일입니다.");
	}
}
