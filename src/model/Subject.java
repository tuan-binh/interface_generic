package model;

public class Subject {
	private int subjectId;
	private String subjectName;
	private boolean subjectStatus;
	
	public Subject() {
	}
	
	public Subject(int subjectId, String subjectName, boolean subjectStatus) {
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.subjectStatus = subjectStatus;
	}
	
	public int getSubjectId() {
		return subjectId;
	}
	
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	
	public String getSubjectName() {
		return subjectName;
	}
	
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public boolean isSubjectStatus() {
		return subjectStatus;
	}
	
	public void setSubjectStatus(boolean subjectStatus) {
		this.subjectStatus = subjectStatus;
	}
}
