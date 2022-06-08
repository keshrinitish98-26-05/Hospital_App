package hospital_app.controller_Hospital;

import hospital_app.dto.Hospital;
import hospital_app.service.HospitalService;

public class SaveHospital {
	public static void main(String[] args) {
		Hospital hospital=new Hospital();
		hospital.setName("Apollo");
		hospital.setGstNo("3367654AP");
		
		HospitalService hospitalService=new HospitalService();
		Hospital hospital2=hospitalService.saveHospital(hospital);
		if(hospital2!=null)
		{
			System.out.println("Hospital data inserted");
		}
		else
		{
			System.out.println("Hospital data not inserted");
		}
	}

}
