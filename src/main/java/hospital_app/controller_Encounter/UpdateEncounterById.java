package hospital_app.controller_Encounter;

import hospital_app.dto.Encounter;
import hospital_app.service.EncounterService;

public class UpdateEncounterById {
	public static void main(String[] args) {
		Encounter encounter=new Encounter();
		encounter.setReason("Cold Fever");
		EncounterService encounterService=new EncounterService();
		Encounter encounter1=encounterService.updateEncounterById(2,encounter);
		if(encounter!=null)
		{
			System.out.println("Data update");
		}
		else
		{
			System.out.println("Data  not updated");
		}
	}

}
