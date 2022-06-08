package hospital_app.service;

import java.util.List;

import hospital_app.dao.EncounterDao;
import hospital_app.dto.Encounter;

public class EncounterService {
	EncounterDao encounterDao=new EncounterDao();
	public Encounter createEncounter(int bid,int pid, Encounter encounter) {
		return encounterDao.createEncounter(bid,pid,encounter);
	}

	public Encounter getEncounterById(int id) {
		return encounterDao.getEncounterById(id);
	}

	public Encounter updateEncounterById(int id,Encounter encounter) {
		return encounterDao.updateEncounterById(id,encounter);
	}

	public boolean deleteEncounterById(int id) {
		return encounterDao.deleteEncounterById(id);
	}

	public List<Encounter> getAllEncounter() {
		return encounterDao.getAllEncounter();
	}

	public List<Encounter> getAllEncounterByPersonId(int id) {
		return encounterDao.getAllEncounterByPersonId(id);
	}


}
