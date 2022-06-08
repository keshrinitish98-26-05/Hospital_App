package hospital_app.service;

import hospital_app.dao.AddressDao;
import hospital_app.dto.Address;

public class AddressService {
	AddressDao addressDao=new AddressDao();
	public Address saveAddress(int id,Address address) {
		return addressDao.saveAddress(id,address);
	}

	public Address getAddressByBranchId(int id) {
		return addressDao.getAddressByBranchId(id);
	}

	public Address updateAddressByBranchId(int id,Address address) {
		return addressDao.updateAddressByBranchId(id,address);
	}

}
