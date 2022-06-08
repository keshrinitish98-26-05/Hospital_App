package hospital_app.service;

import java.util.List;

import hospital_app.dao.MedOrderDao;
import hospital_app.dto.MedOrder;

public class MedOrderService {
	MedOrderDao medOrderDao=new MedOrderDao();
	public MedOrder saveMedOrder(int id,MedOrder medOrder) {
		return medOrderDao.saveMedOrder(id,medOrder);
	}

	public MedOrder getMedOrderById(int id) {
		return medOrderDao.getMedOrderById(id);
	}

	public List<MedOrder> getAllMedOrder() {
		return medOrderDao.getAllMedOrder();
	}

	public MedOrder updateMedOrder(int id,MedOrder medOrder) {
		return medOrderDao.updateMedOrder(id,medOrder);
	}

	public double totalBill(int id) {
		// TODO Auto-generated method stub
		return 0;
	}


}
