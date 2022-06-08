package hospital_app.dao;

import hospital_app.dto.Observation;

public interface ObservationIterfaceDao {
  
	public abstract Observation saveObservation(Observation observation);
	public abstract Observation getObservationById(int id);
	public abstract Observation updateObserVationById(int id);
	//public abstract boolean deleteObservationById(int id);
}
