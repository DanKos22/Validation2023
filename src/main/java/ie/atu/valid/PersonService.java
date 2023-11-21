package ie.atu.valid;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

// @Service annotation is used with classes that provide some business functionalities
@Service
public class PersonService {

    // Placeholder method to save a person
    public void savePerson(Person person) {
        System.out.println("Person saved: " + person);
    }

    public Person getPersonByEmployeeId(String employeeId) {
        Person someOne = new Person();
        someOne.getEmployeeId();
        return someOne;
        //return new Person("Person retrieved" + employeeId);
        //String message = "Person retrieved: " + employeeId;
    }

}
