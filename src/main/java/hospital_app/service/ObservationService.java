package hospital_app.service;

import hospital_app.dao.ObservationDao;
import hospital_app.dto.Observation;

public class ObservationService {
	ObservationDao observationDao=new ObservationDao();
	public Observation saveObservation(Observation observation) {
		return observationDao.saveObservation(observation);
	}

	public Observation getObservationById(int id) {
		return observationDao.getObservationById(id);
	}

	public Observation updateObserVationById(int id) {
		return observationDao.updateObserVationById(id);
	}


}
