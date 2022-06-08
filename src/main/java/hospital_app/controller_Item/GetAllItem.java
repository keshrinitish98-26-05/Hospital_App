package hospital_app.controller_Item;

import java.util.List;

import hospital_app.dto.Item;
import hospital_app.service.ItemService;

public class GetAllItem {
	public static void main(String[] args) {
		ItemService itemService=new ItemService();
		List<Item> list=itemService.getAllItem();
		for(Item e: list)
		{
			System.out.println(""+e.getName());
			System.out.println(""+e.getQuantity());
			System.out.println(""+e.getQuantity());
			System.out.println(""+e.getCost());
		}
	}

}
