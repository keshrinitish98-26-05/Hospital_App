package hospital_app.controller_Person;

import hospital_app.dto.Person;
import hospital_app.service.PersonService;

public class GetPersonDetailsById {
	
	public static void main(String[] args) {
		PersonService personService=new PersonService();
		Person person=personService.getPersonById(1);
		if(person!=null)
		{
			System.out.println(""+person.getName());
			System.out.println(""+person.getAge());
			System.out.println(""+person.getEmail());
		}
		else
		{
			System.out.println("no such id present ");
		}
	}

}
