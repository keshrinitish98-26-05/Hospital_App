package hospital_app.controller_Hospital;

import hospital_app.dto.Hospital;
import hospital_app.service.HospitalService;

public class DeleteHospitalById {
	public static void main(String[] args) {
		HospitalService hospitalService=new HospitalService();
		boolean b=hospitalService.deleteHospitalById(1);
		if(b==true)
		{
			System.out.println("Data deleted");
		}
		else
		{
			System.out.println("Data not deleted");
		}
	}

}
