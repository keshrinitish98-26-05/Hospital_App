package hospital_app.controller_Item;

import hospital_app.dto.Item;
import hospital_app.service.ItemService;

public class GetItemById {
	public static void main(String[] args) {
		ItemService itemService = new ItemService();
		Item item = itemService.getItemById(1);
		if (item != null) {
			System.out.println("" + item.getName());
			System.out.println("" + item.getQuantity());
			System.out.println("" + item.getQuantity());
			System.out.println("" + item.getCost());
		} else {
			System.out.println("No such id present");
		}
	}

}
