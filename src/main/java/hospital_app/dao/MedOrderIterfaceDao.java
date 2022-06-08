package hospital_app.dao;

import java.util.List;

import hospital_app.dto.MedOrder;

public interface MedOrderIterfaceDao {
     
	public abstract MedOrder saveMedOrder(int id,MedOrder medOrder);
	public abstract MedOrder getMedOrderById(int id);
	public abstract List<MedOrder> getAllMedOrder();
	public abstract MedOrder updateMedOrder(int id,MedOrder medOrder);
	//public abstract double totalBill(int id);
	//public abstract boolean deleteMedOrderById(int id);
}
