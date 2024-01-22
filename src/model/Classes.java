package model;

public class Classes {
	private int classId;
	
	private String className;
	private byte classStatus;
	private Teacher teacher;
	private Student[] students = new Student[25];
	private Subject[] subjects = new Subject[5];
	
	public Classes() {
	}
	
	public Classes(int classId, String className, byte classStatus, Teacher teacher, Student[] students, Subject[] subjects) {
		this.classId = classId;
		this.className = className;
		this.classStatus = classStatus;
		this.teacher = teacher;
		this.students = students;
		this.subjects = subjects;
	}
	
	public int getClassId() {
		return classId;
	}
	
	public void setClassId(int classId) {
		this.classId = classId;
	}
	
	public String getClassName() {
		return className;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}
	
	public byte getClassStatus() {
		return classStatus;
	}
	
	public void setClassStatus(byte classStatus) {
		this.classStatus = classStatus;
	}
	
	public Teacher getTeacher() {
		return teacher;
	}
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public Student[] getStudents() {
		return students;
	}
	
	public void setStudents(Student[] students) {
		this.students = students;
	}
	
	public Subject[] getSubjects() {
		return subjects;
	}
	
	public void setSubjects(Subject[] subjects) {
		this.subjects = subjects;
	}
}
