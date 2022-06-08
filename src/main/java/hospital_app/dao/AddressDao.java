package hospital_app.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hospital_app.dto.Address;
import hospital_app.dto.Branch;

public class AddressDao implements AddressIterfaceDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Address saveAddress(int id,Address address) {
		Branch branch=entityManager.find(Branch.class, id);
		if(branch!=null)
		{
		address.setBranch(branch);	
		entityTransaction.begin();
		entityManager.persist(address);
		entityTransaction.commit();
		Address address2 = entityManager.find(Address.class, address.getAddressId());
		return address2;
		}
		else
		{
			return null;
		}
	}

	public Address getAddressByBranchId(int id) {
		Branch branch = entityManager.find(Branch.class, id);
		Address address= branch.getAddress();
		return address;
	}

	public Address updateAddressByBranchId(int id, Address address) {
		Branch branch = entityManager.find(Branch.class, id);
		if (branch != null) {
			Address address2 = branch.getAddress();
			if (address.getState() != null) {
				address2.setState(address.getState());
			}
			if (address.getCountry() != null) {
				address2.setCountry(address.getCountry());
			}
			if (address.getPincode() != 0) {
				address2.setPincode(address.getPincode());
			}
			if (address.getState() != null) {
				address2.setStreet(address.getStreet());
			}
			if(address.getCity()!=null) {
				address2.setCity(address.getCity());
			}
			entityTransaction.begin();
			entityManager.merge(address2);
			entityTransaction.commit();
			return entityManager.find(Address.class, address2.getAddressId());
		} else {
			return null;
		}
	}

}
