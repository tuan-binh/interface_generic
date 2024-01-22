package service;

// T là kiểu dữ liệu của đối tượng (Object) và E là đại diện cho kiểu dữ liệu của id
public interface IGenericService<X,E> {
	
	X[] findAll();
	
	X findById(E id);
	
	void save(X t);
	
	void delete(E id);
}
