package hospital_app.controller_MedOrder;

import java.util.List;

import hospital_app.dto.MedOrder;
import hospital_app.service.MedOrderService;

public class GetAllMedIOrder {
	public static void main(String[] args) {
		MedOrderService medOrderService=new MedOrderService();
		List<MedOrder> medOrder=medOrderService.getAllMedOrder();
		for(MedOrder m:medOrder)
		{
			System.out.println("------------------------");
			System.out.println(""+m.getMedOrderId());
			System.out.println(""+m.getDescription());
			System.out.println(""+m.getCost());
		}
	}

}
