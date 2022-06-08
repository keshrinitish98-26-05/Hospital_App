package hospital_app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital_app.dto.Encounter;
import hospital_app.dto.MedOrder;

public class MedOrderDao implements MedOrderIterfaceDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	/* This method is used to store MedOrder data in the DB
	 * By taking Encounter Id and medOrder object
	 * it saves the medOrder for the particular encounter*/
	
	public MedOrder saveMedOrder(int id, MedOrder medOrder) {
		Encounter encounter = entityManager.find(Encounter.class, id);
		if (encounter != null) {
			medOrder.setEncounter(encounter);
			entityTransaction.begin();
			entityManager.persist(medOrder);
			entityTransaction.commit();
			MedOrder medOrder2 = entityManager.find(MedOrder.class, medOrder.getMedOrderId());
			return medOrder2;
		} else {
			return null;
		}
	}
	/* In this method we pass the medOrder Id and this method returns the 
	 * object associated with this id*/

	public MedOrder getMedOrderById(int id) {
		return entityManager.find(MedOrder.class, id);
	}
	
    /* this methods returns all medOrder object.
     * here select query is return to get all the medorder Object*/
	public List<MedOrder> getAllMedOrder() {
		String sql = "select m from MedOrder m";
		Query query = entityManager.createQuery(sql);
		List<MedOrder> list = query.getResultList();
		return list;
	}

	public MedOrder updateMedOrder(int id, MedOrder medOrder) {
		MedOrder medOrder2 = entityManager.find(MedOrder.class, id);
		if (medOrder2 != null) {
			if (medOrder.getDescription() != null) {
				medOrder2.setDescription(medOrder.getDescription());
			}
			if (medOrder.getCost() != 0d) {
				medOrder2.setCost(medOrder.getCost());
			}
			entityTransaction.begin();
			entityManager.merge(medOrder2);
			entityTransaction.commit();
			return entityManager.find(MedOrder.class, medOrder2.getMedOrderId());

		}
		return null;
	}

}
