package hospital_app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.metamodel.model.domain.spi.SetPersistentAttribute;

import hospital_app.dto.Branch;
import hospital_app.dto.Encounter;
import hospital_app.dto.Hospital;

public class BranchDao implements BranchIterfaceDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Branch saveBranch(int id, Branch branch) {
		Hospital hospital = entityManager.find(Hospital.class, id);
		if (hospital != null) {
			branch.setHospital(hospital);
			entityTransaction.begin();
			entityManager.persist(branch);
			entityTransaction.commit();
			return entityManager.find(Branch.class, branch.getBranchId());
		} else {
			return null;
		}
	}

	public Branch getBranchBYId(int id) {
		return entityManager.find(Branch.class, id);
	}

	public List<Branch> getAllBranch() {
		String sql = "select b from Branch b";
		Query query = entityManager.createQuery(sql);
		List<Branch> list = query.getResultList();
		return list;
	}

	public Branch updateBranchById(Branch branch, int id) {
		Branch branch2 = entityManager.find(Branch.class, id);
		if (branch2 != null) {
			if (branch.getEmail() != null) {
				branch2.setEmail(branch.getEmail());
			}
			if (branch.getName() != null) {
				branch2.setName(branch.getName());
			}
			if (branch.getNoOfStaff() != 0) {
				branch2.setNoOfStaff(branch.getNoOfStaff());
			}
			if (branch.getPhone() != 0l) {
				branch2.setPhone(branch.getPhone());
			}
			entityTransaction.begin();
			entityManager.merge(branch2);
			entityTransaction.commit();
			return entityManager.find(Branch.class, branch2.getBranchId());
		} else {
			return null;
		}
	}

	public boolean deleteBranchById(int id) {
		Branch branch = entityManager.find(Branch.class, id);
		if (branch != null) {
			entityTransaction.begin();
			entityManager.remove(branch);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}

	public List<Branch> getBranchByName(String name) {
		String sql = "select b from Branch b where b.name=?1";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, name);
		List<Branch> list = query.getResultList();
		return list;
	}
}
