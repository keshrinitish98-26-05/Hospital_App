package hospital_app.controller_Observation;

import java.time.LocalDateTime;

import hospital_app.dto.Observation;
import hospital_app.service.EncounterService;
import hospital_app.service.ObservationService;

public class SaveObservation {
	
	public static void main(String[] args) {
		Observation observation=new Observation();
		observation.setDateTime(LocalDateTime.now());
		observation.setDescription("ffhuhfunbh");
		
		EncounterService encounterService=new EncounterService();
		observation.setEncounter(encounterService.getEncounterById(2));
		
		ObservationService observationService=new ObservationService();
		Observation observation2=observationService.saveObservation(observation);
		if(observation2!=null)
		{
			System.out.println("Data inserted");
		}
		else
		{
			System.out.println("Data not inserted");
		}
		
		
	}

}
