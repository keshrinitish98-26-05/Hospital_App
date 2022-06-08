package hospital_app.controller_Person;

import hospital_app.dto.Person;
import hospital_app.service.PersonService;

public class UpdatePersonDetails {
	
	public static void main(String[] args) {
		Person person=new Person();
		person.setBloodGroup("o+");
		PersonService personService=new PersonService();
		Person person2=personService.updateUserById(2, person);
		if(person2!=null)
		{
			System.out.println("Data update");
		}
		else
		{
			System.out.println("Data  not updated");
		}
		
		
	}

}
