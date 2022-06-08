package hospital_app.dao;

import java.util.List;

import hospital_app.dto.Branch;
import hospital_app.dto.Encounter;
import hospital_app.dto.Person;

public interface EncounterIterfaceDao {
	
	public abstract Encounter createEncounter(int bid,int pid,Encounter encounter);
	public abstract Encounter getEncounterById(int id);
	public abstract Encounter updateEncounterById(int id,Encounter encounter);
    public abstract boolean deleteEncounterById(int id);
    public abstract List<Encounter> getAllEncounter();
    public abstract List<Encounter> getAllEncounterByPersonId(int id);

}
