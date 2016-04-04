package practise;

public class StudentClass {
	
	String StudentName;
	String StudentID;
	Boolean  attendance;
	
	
	
	public StudentClass(String studentName, String studentID, Boolean attendance) {
		super();
		StudentName = studentName;
		StudentID = studentID;
		this.attendance = attendance;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public Boolean getAttendance() {
		return attendance;
	}
	public void setAttendance(Boolean attendance) {
		this.attendance = attendance;
	}
	public String getStudentID() {
		return StudentID;
	}
	public void setStudentID(String studentID) {
		StudentID = studentID;
	}

}
