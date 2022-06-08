package hospital_app.controller_Encounter;

import java.time.LocalDateTime;

import hospital_app.dto.Branch;
import hospital_app.dto.Encounter;
import hospital_app.dto.Person;
import hospital_app.service.BranchService;
import hospital_app.service.EncounterService;
import hospital_app.service.PersonService;

public class saveEncounter {
	
	public static void main(String[] args) {
		Encounter encounter=new Encounter();
		encounter.setAdmitDateTime(LocalDateTime.now());
		encounter.setDischargeDateTime(LocalDateTime.now());
		encounter.setReason("Maleria");
		
		EncounterService encounterService=new EncounterService();
		Encounter encounter2=encounterService.createEncounter(1,2,encounter);
		System.out.println(encounter2);
		if(encounter2!=null)
		{
			System.out.println("Data inserted");
		}
		else
		{
			System.out.println("Data Not Inserted");
		}
		
		
		
	}

}
