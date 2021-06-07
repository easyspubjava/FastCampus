package ch11;


public class Student {

	private String studentName;
	MyLogger myLogger = MyLogger.getLogger();
	
	public Student(String studentName){

		if(studentName == null){
		
			throw new StudentNameFormatException("name must not be null");
		}
		if( studentName.split(" ").length > 3)
			throw new StudentNameFormatException("이름이 너무 길어요");
		
		this.studentName = studentName;
	}

	
	public String getStudentName() {
		
		myLogger.fine("begin getStudentName()");
		
		return studentName;
	}
}
