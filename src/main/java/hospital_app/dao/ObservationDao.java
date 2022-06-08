package hospital_app.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hospital_app.dto.Observation;

public class ObservationDao implements ObservationIterfaceDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public Observation saveObservation(Observation observation) {
		entityTransaction.begin();
		entityManager.persist(observation);
		entityTransaction.commit();
		Observation observation2=entityManager.find(Observation.class, observation.getObservationId());
		return observation2;
	}

	public Observation getObservationById(int id) {
		return entityManager.find(Observation.class, id);
	}

	public Observation updateObserVationById(int id) {
		return null;
	}

}
