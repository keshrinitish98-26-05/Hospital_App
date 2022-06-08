package hospital_app.controller_Encounter;

import java.util.List;

import hospital_app.dto.Encounter;
import hospital_app.service.EncounterService;

public class GetAllEncounterByPersonId {
	
	public static void main(String[] args) {
		EncounterService encounterService=new EncounterService();
		List<Encounter> encounters=encounterService.getAllEncounterByPersonId(1);
		if(encounters!=null)
		{
			for(Encounter e: encounters)
			{
				System.out.println("------------------------------");
				System.out.println(e.getReason());
				System.out.println(e.getAdmitDateTime());
				System.out.println(e.getDischargeDateTime());
			}
		}
		else
		{
			System.out.println("no such Encounter present of this id");
		}
	}

}
