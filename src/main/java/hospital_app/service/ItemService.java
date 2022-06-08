package hospital_app.service;

import java.util.List;

import hospital_app.dao.ItemDao;
import hospital_app.dto.Item;

public class ItemService {
    ItemDao itemDao=new ItemDao();
	public Item saveItem(int id,Item item) {
		return itemDao.saveItem(id,item);
	}

	public Item getItemById(int id) {
		return itemDao.getItemById(id);
	}

	public List<Item> getAllItem() {
		return itemDao.getAllItem();
	}

	public double calculateCost(int id) {
		return 0;
	}

}
