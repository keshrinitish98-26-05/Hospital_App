package hospital_app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital_app.dto.Person;
import hospital_app.dto.User;

public class UserDao implements UserIterfaceDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	public User saveUser(User user) {
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		User user2=entityManager.find(User.class, user.getUserId());
		return user2;
		
	}

	public User getUserById(int id) {
		return entityManager.find(User.class, id);
	}

	public List<User> validateUser(String email, String password) {
		String sql = "select u from User u where u.email=?1 and u.password=?2";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, email);
		query.setParameter(2, password);
		List<User> list = query.getResultList();
		return list;
		
	}

	public User updateUserById(int id, User user) {
		User user2=entityManager.find(User.class, id);
		if(user2!=null)
		{
			if(user.getEmail()!=null)
			{
				user2.setEmail(user.getEmail());
			}
			if(user.getName()!=null)
			{
				
			}
		}
		return null;
	}

	public List<User> getAllUser() {
		String sql = "select u from User u";
		Query query = entityManager.createQuery(sql);
		List<User> list = query.getResultList();
		return list;
		
	}

	public boolean deleteUserById(int id) {
		return false;
	}

	public List<User> getAllUserByRole() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getUserByName(String name) {
		String sql = "select u from User u where name=?1";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1,name);
		List<User> list = query.getResultList();
		return list;
	}

}
