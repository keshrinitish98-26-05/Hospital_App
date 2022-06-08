package hospital_app.controller_Hospital;

import hospital_app.dto.Hospital;
import hospital_app.service.HospitalService;

public class GetHospitalById {
	public static void main(String[] args) {
		HospitalService hospitalService = new HospitalService();
		Hospital hospital = hospitalService.getHospitalById(4);
		if (hospital != null) {
			System.out.println("" + hospital.getHospitalId());
			System.out.println("" + hospital.getName());
			System.out.println("" + hospital.getGstNo());

		} else {
			System.out.println("No such Hospital is present of this Id");
		}

	}

}
