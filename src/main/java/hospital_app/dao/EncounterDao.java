package hospital_app.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import hospital_app.dto.Branch;
import hospital_app.dto.Encounter;
import hospital_app.dto.Person;

public class EncounterDao implements EncounterIterfaceDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Encounter createEncounter(int bid, int pid, Encounter encounter) {
		Branch branch = entityManager.find(Branch.class, bid);
		if (branch != null) {
			encounter.setBranch(branch);
			Person person = entityManager.find(Person.class, pid);
			if (person != null) {
				encounter.setPerson(person);
				entityTransaction.begin();
				entityManager.persist(encounter);
				entityTransaction.commit();
				return entityManager.find(Encounter.class, encounter.getEncounterId());
			} else {
				return null;
			}

		} else {
			return null;
		}
	}

	public Encounter getEncounterById(int id) {
		return entityManager.find(Encounter.class, id);
	}

	public Encounter updateEncounterById(int id, Encounter encounter) {
		Encounter encounter2 = entityManager.find(Encounter.class, id);
		if (encounter2 != null) {
			if (encounter.getAdmitDateTime() != null) {
				encounter2.setAdmitDateTime(encounter.getAdmitDateTime());
			}
			if (encounter.getDischargeDateTime() != null) {
				encounter2.setDischargeDateTime(encounter.getDischargeDateTime());
			}
			if (encounter.getReason() != null) {
				encounter2.setReason(encounter.getReason());
			}
			entityTransaction.begin();
			entityManager.merge(encounter2);
			entityTransaction.commit();
			return entityManager.find(Encounter.class, id);
		} else {
			return null;
		}
	}

	public boolean deleteEncounterById(int id) {
		Encounter encounter = entityManager.find(Encounter.class, id);
		entityTransaction.begin();
		entityManager.remove(encounter);
		entityTransaction.commit();
		if (entityManager.find(Encounter.class, id) == null) {
			return true;
		} else {
			return false;
		}

	}

	public List<Encounter> getAllEncounter() {
		String sql = "select e from Encounter e";
		Query query = entityManager.createQuery(sql);
		List<Encounter> list = query.getResultList();
		return list;
	}

	public List<Encounter> getAllEncounterByPersonId(int id) {
		Person person = entityManager.find(Person.class, id);
		return person.getEncounter();
	}

}
