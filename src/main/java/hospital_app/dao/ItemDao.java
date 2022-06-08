package hospital_app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital_app.dto.Hospital;
import hospital_app.dto.Item;
import hospital_app.dto.MedOrder;

public class ItemDao implements ItemIterfaceDao{
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public Item saveItem(int id,Item item) {
		MedOrder medOrder=entityManager.find(MedOrder.class, id);
		if(medOrder!=null)
		{
		item.setMedOrder(medOrder);
		entityTransaction.begin();
		entityManager.persist(item);
		entityTransaction.commit();
		Item item2=entityManager.find(Item.class,item.getItemId());
		return item2;
		}
		else
		{
			return null;
		}
	}

	public Item getItemById(int id) {
		return entityManager.find(Item.class,id);
	}

	public List<Item> getAllItem() {
		String sql="select h from Item h";
		Query query=entityManager.createQuery(sql);
        List<Item> list=query.getResultList();
        return list;
		
	}

	public double calculateCost(int id) {
		return 0;
	}

}
