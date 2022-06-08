package hospital_app.controller_Address;

import hospital_app.dto.Address;
import hospital_app.service.AddressService;

public class UpdateAddressByBranchId {
	
	public static void main(String[] args) {
		Address address=new Address();
		address.setCity("Rourkela");
		AddressService addressService=new AddressService();
		Address address2=addressService.updateAddressByBranchId(3, address);
		if(address2!=null)
		{
			System.out.println("Data Updated");
		}
		else
		{
			System.out.println("Data not Updated");
		}
	}

}
