package hospital_app.controller_Observation;

import hospital_app.dto.Observation;
import hospital_app.service.ObservationService;

public class GetObservationById {
	public static void main(String[] args) {
		ObservationService observationService=new ObservationService();
		Observation observation=observationService.getObservationById(3);
		if(observation!=null)
		{
			System.out.println(""+observation.getObservationId());
			System.out.println(""+observation.getDateTime());
			System.out.println(""+observation.getDateTime());
		}
		else
		{
			System.out.println("No such Id present");
		}
	}

}
