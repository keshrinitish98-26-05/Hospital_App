package hospital_app.service;

import java.util.List;

import hospital_app.dao.HospitalDao;
import hospital_app.dto.Hospital;

public class HospitalService {
	HospitalDao hospitalDao=new HospitalDao();
	public Hospital saveHospital(Hospital hospital) {
		
		return hospitalDao.saveHospital(hospital);
		
	}

	public List<Hospital> getAllHospital() {
		return hospitalDao.getAllHospital();
	}

	public Hospital getHospitalById(int id) {
		return hospitalDao.getHospitalById(id);
		
	}

	public List<Hospital> getHospitalByName(String name) {
		return hospitalDao.getHospitalByName(name);
	}

	public Hospital updateHospitalById(int id, Hospital hospital) {
		return hospitalDao.updateHospitalById(id, hospital);
	}

	public boolean deleteHospitalById(int id) {
		return hospitalDao.deleteHospitalById(id);
	}

}
