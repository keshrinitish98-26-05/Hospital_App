package hospital_app.controller_Hospital;

import hospital_app.dto.Hospital;
import hospital_app.service.HospitalService;

public class UpdateHospitalById {
	public static void main(String[] args) {
		HospitalService hospitalService = new HospitalService();
		Hospital hospital = new Hospital();
		hospital.setGstNo("SUMBBSR");
		Hospital hospital2 = hospitalService.updateHospitalById(1, hospital);
		if (hospital2 != null) {
			System.out.println("Data Updated");
		} else {
			System.out.println("Data not updated");
		}
	}

}
