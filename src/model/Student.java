package model;

import java.util.Date;

public class Student {
	private int studentId;
	private String studentName;
	private Date dateOfBirth;
	private byte studentStatus;
	
	public Student() {
	}
	
	public Student(int studentId, String studentName, Date dateOfBirth, byte studentStatus) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.dateOfBirth = dateOfBirth;
		this.studentStatus = studentStatus;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public byte getStudentStatus() {
		return studentStatus;
	}
	
	public void setStudentStatus(byte studentStatus) {
		this.studentStatus = studentStatus;
	}
}
