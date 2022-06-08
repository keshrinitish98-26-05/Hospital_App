package hospital_app.controller_Person;

import hospital_app.dto.Person;
import hospital_app.service.PersonService;

public class SavePerson {
	public static void main(String[] args) {
		Person person=new Person();
		person.setName("Anuj");
		person.setEmail("anuj@gmail.com");
		person.setAge(25);
		person.setBloodGroup("O+");
		person.setDob("29-06-1997");
		person.setPhone(83336789);
		
		PersonService personService=new PersonService();
	    Person person2=personService.savePerson(person);
	    if(person2!=null)
	    {
	    	System.out.println("Data Inserted");
	    }
	    else
	    {
	    	System.out.println("Data Not enserted");
	    }
	}

}
