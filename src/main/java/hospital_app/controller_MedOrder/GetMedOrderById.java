package hospital_app.controller_MedOrder;

import hospital_app.dto.MedOrder;
import hospital_app.service.MedOrderService;

public class GetMedOrderById {
	public static void main(String[] args) {
		MedOrderService medOrderService=new MedOrderService();
		MedOrder medOrder=medOrderService.getMedOrderById(3);
		if(medOrder!=null)
		{
			System.out.println(""+medOrder.getMedOrderId());
			System.out.println(""+medOrder.getDescription());
			System.out.println(""+medOrder.getCost());
		}
		else
		{
			System.out.println("No such id present");
		}
	}

}
