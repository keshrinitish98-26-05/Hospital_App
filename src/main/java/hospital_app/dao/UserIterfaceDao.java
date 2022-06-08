package hospital_app.dao;

import java.util.List;

import hospital_app.dto.User;

public interface UserIterfaceDao {
	
	public abstract User saveUser(User user);
	public abstract User getUserById(int id);
	public abstract List<User> validateUser(String email,String password);
	public abstract User updateUserById(int id,User user);
	public abstract List<User> getAllUser();
	public abstract boolean deleteUserById(int id);
	public abstract List<User> getAllUserByRole();
	public abstract List<User> getUserByName(String name);	

}
