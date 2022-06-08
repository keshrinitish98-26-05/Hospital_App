package hospital_app.controller_Person;

import java.util.List;

import hospital_app.dto.Person;
import hospital_app.service.PersonService;

public class GetAllPerson {
	
	public static void main(String[] args) {
		PersonService personService=new PersonService();
		List<Person> persons=personService.getAllPerson();
		if(persons!=null)
		{
			for(Person e: persons)
			{
				System.out.println("----------------------------------");
				System.out.println(""+e.getName());
				System.out.println(""+e.getEmail());
				System.out.println(""+e.getAge());
				System.out.println(""+e.getDob());
			}
		}
		else
		{
			System.out.println("not a singel person present");
		}
		
	}

}
