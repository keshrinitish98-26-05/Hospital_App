package hospital_app.controller_Item;

import hospital_app.dto.Item;
import hospital_app.service.ItemService;
import hospital_app.service.MedOrderService;

public class SaveItem {
     public static void main(String[] args) {
		Item item=new Item();
		item.setName("grfgr");
		item.setQuantity(2);
		item.setCost(600);
		
		ItemService itemService=new ItemService();
		Item item2=itemService.saveItem(3,item);
		if(item2!=null)
		{
			System.out.println("Data Inserted");
		}
		else
		{
			System.out.println("Data not inserted");
		}
	}
}
