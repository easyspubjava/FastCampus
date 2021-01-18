package ch02;

public class EqualTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student Lee = new Student(100, "Lee");
		Student Lee2 = Lee;
		Student Shun = new Student(100, "Lee");
		
		System.out.println(Lee == Shun);
		System.out.println(Lee.equals(Shun));
		
		System.out.println(Lee.hashCode());
		System.out.println(Shun.hashCode());
		
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));
		
		Student Lee3 = (Student)Lee.clone();
		System.out.println(System.identityHashCode(Lee));
		System.out.println(System.identityHashCode(Lee3));
		

	}
}
