package hospital_app.controller_Encounter;

import hospital_app.service.EncounterService;

public class DeleteEncounterById {
	
	public static void main(String[] args) {
		EncounterService encounterService=new EncounterService();
		boolean b=encounterService.deleteEncounterById(1);
		if(b==true)
		{
			System.out.println("Data deleted");
		}
		else
		{
			System.out.println("No such id present");
		}
	}

}
