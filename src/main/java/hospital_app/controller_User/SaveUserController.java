package hospital_app.controller_User;

import java.util.Set;

import hospital_app.dto.User;
import hospital_app.service.UserService;

public class SaveUserController {
	
	public static void main(String[] args) {
		
		User user=new User();
		user.setEmail("madhu@gmail.com");
		user.setName("Madhu");
		user.setPhone(3456543);
		user.setRole("Nurse");
		user.setPassword("madhu");
		UserService userService=new UserService();
		User user2=userService.saveUser(user);
		if(user2!=null)
		{
			System.out.println("User Data inserted");
		}
		else
		{
			System.out.println("User data not inserted");
		}
		
		
	}

}
