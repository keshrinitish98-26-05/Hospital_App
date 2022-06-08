package hospital_app.controller_Address;

import hospital_app.dto.Address;
import hospital_app.service.AddressService;

public class GetAddressByBranchId {
	
	public static void main(String[] args) {
		AddressService addressService=new AddressService();
		Address address=addressService.getAddressByBranchId(3);
		if(address!=null)
		{
			System.out.println(""+address.getCity());
			System.out.println(""+address.getState());
		}
	}

}
