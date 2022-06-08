package hospital_app.controller_Address;

import hospital_app.dto.Address;
import hospital_app.service.AddressService;
public class saveAddress {
	
	public static void main(String[] args) {
		
		Address address=new Address();
		address.setStreet("11thCross");
		address.setCity("Rourkela");
		address.setState("Odisha");
		address.setPincode(336787);
		address.setCountry("India");
		AddressService addressService=new AddressService();
		Address address2=addressService.saveAddress(4,address);
		if(address2!=null)
		{
			System.out.println("Data inserted");
		}
		else
		{
			System.out.println("data inserted");
		}
	}

}
