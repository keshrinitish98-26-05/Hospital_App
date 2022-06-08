package hospital_app.dao;
import hospital_app.dto.Hospital;
import java.util.List;

public interface HospitalIterfaceDao {
	
	public abstract Hospital saveHospital(Hospital hospital);
	public abstract List<Hospital> getAllHospital();
	public abstract Hospital getHospitalById(int id);
	public abstract List<Hospital> getHospitalByName(String name);
	public abstract Hospital updateHospitalById(int id,Hospital hospital);
	public abstract boolean deleteHospitalById(int id);

}
