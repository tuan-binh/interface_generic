package service;

import model.Subject;

public class SubjectService implements IGenericService<Subject,Integer> {
	
	private static Subject[] subjects = new Subject[0];
	@Override
	public Subject[] findAll() {
		return new Subject[0];
	}
	
	@Override
	public Subject findById(Integer id) {
		for (Subject s:subjects) {
			if(s.getSubjectId()==id) {
				return s	;
			}
		}
		return null;
	}
	
	@Override
	public void save(Subject subject) {
	
	}
	
	@Override
	public void delete(Integer id) {
	
	}
}
