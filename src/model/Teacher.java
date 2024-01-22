package model;

public class Teacher {
	private String teacherId;
	private String teacherName;
	private byte teacherStatus;
	
	public Teacher() {
	}
	
	public Teacher(String teacherId, String teacherName, byte teacherStatus) {
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.teacherStatus = teacherStatus;
	}
	
	public String getTeacherId() {
		return teacherId;
	}
	
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	
	public String getTeacherName() {
		return teacherName;
	}
	
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	
	public byte getTeacherStatus() {
		return teacherStatus;
	}
	
	public void setTeacherStatus(byte teacherStatus) {
		this.teacherStatus = teacherStatus;
	}
}
