package ch02;

public class Student implements Cloneable{

	private int studentId;
	private String studentName;

	public Student(int studentId, String studentName)
	{
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public boolean equals(Object obj) {
		if( obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentId == std.studentId )
				return true;
			else return false;
		}
		return false;
		
	}
	
	@Override
	public int hashCode() {
		return studentId;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
