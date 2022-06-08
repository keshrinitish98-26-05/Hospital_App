package hospital_app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital_app.dto.Hospital;
import hospital_app.dto.Person;

public class HospitalDao implements HospitalIterfaceDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Hospital saveHospital(Hospital hospital) {
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityTransaction.commit();
		Hospital hospital2 = entityManager.find(Hospital.class, hospital.getHospitalId());
		return hospital2;
	}

	public List<Hospital> getAllHospital() {
		String sql = "select h from Hospital h";
		Query query = entityManager.createQuery(sql);
		List<Hospital> list = query.getResultList();
		return list;
	}

	public Hospital getHospitalById(int id) {
		return entityManager.find(Hospital.class, id);

	}

	public List<Hospital> getHospitalByName(String name) {
		String sql = "select h from Hospital h where h.name=?1";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, name);
		List<Hospital> list = query.getResultList();
		return list;
	}

	public Hospital updateHospitalById(int id, Hospital hospital) {
		Hospital hospital2 = entityManager.find(Hospital.class, id);
		if (hospital2 != null) {
			if (hospital.getName() != null) {
				hospital2.setName(hospital.getName());
			}
			if (hospital.getGstNo() != null) {
				hospital2.setGstNo(hospital.getGstNo());
			}
			entityTransaction.begin();
			entityManager.merge(hospital2);
			entityTransaction.commit();

			return entityManager.find(Hospital.class, hospital2.getHospitalId());
		} else {
			return null;
		}
	}

	public boolean deleteHospitalById(int id) {
		Hospital hospital = entityManager.find(Hospital.class, id);
		if (hospital != null) {
			entityTransaction.begin();
			entityManager.remove(hospital);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}

	}

}
