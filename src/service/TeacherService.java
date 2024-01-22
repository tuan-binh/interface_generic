package service;

import model.Teacher;

public class TeacherService implements IGenericService<Teacher,String>{
	
	private static Teacher[] teachers = new Teacher[0];
	@Override
	public Teacher[] findAll() {
		return new Teacher[0];
	}
	
	@Override
	public Teacher findById(String id) {
		for (Teacher t: teachers) {
			if(t.getTeacherId().equals(id)) {
				return t;
			}
		}
		return null;
	}
	
	@Override
	public void save(Teacher teacher) {
	
	}
	
	@Override
	public void delete(String id) {
	
	}
}
