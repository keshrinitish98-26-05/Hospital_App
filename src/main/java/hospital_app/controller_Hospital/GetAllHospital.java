package hospital_app.controller_Hospital;

import java.util.List;

import hospital_app.dto.Hospital;
import hospital_app.service.HospitalService;

public class GetAllHospital {
	public static void main(String[] args) {
		HospitalService hospitalService = new HospitalService();
		List<Hospital> list = hospitalService.getAllHospital();
		if (list != null) {
			for (Hospital h : list) {
				System.out.println("-----------------------");
				System.out.println("" + h.getName());
				System.out.println("" + h.getGstNo());
			}
		} else {
			System.out.println("Not a single hospital present ");
		}
	}

}
