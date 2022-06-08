package hospital_app.controller_MedOrder;

import hospital_app.dto.MedOrder;
import hospital_app.service.EncounterService;
import hospital_app.service.MedOrderService;

public class SaveMedOrder {
	
	public static void main(String[] args) {
		MedOrder medOrder=new MedOrder();
		medOrder.setDescription("ccqdyc");
		medOrder.setCost(300);

		MedOrderService medOrderService=new MedOrderService();
		MedOrder medOrder2=medOrderService.saveMedOrder(2,medOrder);
		if(medOrder2!=null)
		{
			System.out.println("Data inserted");
		}
		else
		{
			System.out.println("Data not inserted");
		}
	}

}
