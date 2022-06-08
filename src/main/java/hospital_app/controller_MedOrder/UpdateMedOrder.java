package hospital_app.controller_MedOrder;

import hospital_app.dto.MedOrder;
import hospital_app.service.MedOrderService;

public class UpdateMedOrder {
	public static void main(String[] args) {
		
		MedOrder medOrder=new MedOrder();
		medOrder.setDescription("rrrrrrrrr");
		MedOrderService medOrderService=new MedOrderService();
		MedOrder medOrder2=medOrderService.updateMedOrder(3,medOrder);
		if(medOrder2!=null)
		{
			System.out.println("Data updated");
		}
		else
		{
			System.out.println("Data not updated");
		}
	}

}
