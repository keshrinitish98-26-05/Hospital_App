package hospital_app.service;

import java.util.List;

import hospital_app.dao.PersonDao;
import hospital_app.dto.Person;

public class PersonService {
	PersonDao personDao=new PersonDao();
	
	public Person savePerson(Person person) {
		return personDao.savePerson(person);
	}
	
	public Person getPersonById(int id) {
		return personDao.getPersonById(id);
	}

	public boolean deletePersonById(int id) {
		return personDao.deletePersonById(id);
	}

	public Person updateUserById(int id, Person person) {
		return personDao.updateUserById(id, person);
	}

	public List<Person> getAllPerson() {
		return personDao.getAllPerson();
	}

}
