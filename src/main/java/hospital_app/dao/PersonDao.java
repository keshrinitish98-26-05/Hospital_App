package hospital_app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import hospital_app.dto.Person;

public class PersonDao implements PersonIterfaceDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Person savePerson(Person person) {
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
		Person person2 = entityManager.find(Person.class, person.getPersonId());
		return person2;
	}

	public Person getPersonById(int id) {
		return entityManager.find(Person.class, id);
	}

	public boolean deletePersonById(int id) {
		Person person = entityManager.find(Person.class, id);
		entityTransaction.begin();
		entityManager.remove(person);
		entityTransaction.commit();
		if (entityManager.find(Person.class, id) != null) {
			return true;
		} else {
			return false;
		}
	}

	public Person updateUserById(int id, Person person) {
		Person person2 = entityManager.find(Person.class, id);
		if (person2 != null) {
			if (person.getAge() != 0) {
				person2.setAge(person.getAge());
			}
			if (person.getBloodGroup() != null) {
				person2.setBloodGroup(person.getBloodGroup());
			}
			if (person.getEmail() != null) {
				person2.setEmail(person.getEmail());
			}
			if (person.getName() != null) {
				person2.setName(person.getName());
			}
			if (person.getDob() != null) {
				person2.setDob(person.getDob());
			}
			if (person.getPhone() != 0l) {
				person2.setPhone(person2.getPhone());
			}
			entityTransaction.begin();
			entityManager.merge(person2);
			entityTransaction.commit();
			return entityManager.find(Person.class, id);
		} else {
			return null;
		}
	}

	public List<Person> getAllPerson() {
		String sql = "select p from Person p";
		Query query = entityManager.createQuery(sql);
		List<Person> list = query.getResultList();
		return list;
	}

}
