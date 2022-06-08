package hospital_app.dao;

import java.util.List;

import hospital_app.dto.Item;

public interface ItemIterfaceDao {
	
	public abstract Item saveItem(int id,Item item);
	public abstract Item getItemById(int id);
	//public abstract Item updateItemById(int id);
	public abstract List<Item> getAllItem();
	//public abstract boolean deleteItem(int id);
	public abstract double calculateCost(int id);

}
