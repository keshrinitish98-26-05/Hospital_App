package hospital_app.dao;

import java.util.List;

import hospital_app.dto.Person;

public interface PersonIterfaceDao {
	public abstract Person savePerson(Person person);
	public abstract Person getPersonById(int id);
	public abstract boolean deletePersonById(int id);
	public abstract Person updateUserById(int id,Person person);
	public abstract List<Person> getAllPerson();
	

}
