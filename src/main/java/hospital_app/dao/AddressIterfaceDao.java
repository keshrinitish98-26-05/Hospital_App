package hospital_app.dao;

import hospital_app.dto.Address;

public interface AddressIterfaceDao {
	
	public abstract Address saveAddress(int id,Address address);
	public abstract Address getAddressByBranchId(int id);
	public abstract Address updateAddressByBranchId(int id,Address address);
}
