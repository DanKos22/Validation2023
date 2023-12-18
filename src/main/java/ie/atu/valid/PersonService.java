package ie.atu.valid;

import org.springframework.stereotype.Service;

import java.util.List;

// @Service annotation is used with classes that provide some business functionalities
@Service
public class PersonService {

    // Placeholder method to save a person
    private final PersonRepository personRepo;

    public PersonService(PersonRepository personRepo) {
        this.personRepo = personRepo;
    }

    public void savePerson(Person person) {
        personRepo.save(person);
    }

    public Person getPersonByEmployeeId(String employeeId) {
        return personRepo.findByEmployeeId(employeeId);     // Call the jpa, use a query method findBy
        /*Person someOne = new Person();                    // Describe the field within the entity
        someOne.getEmployeeId();
        return someOne;*/
        //return new Person("Person retrieved" + employeeId);
        //String message = "Person retrieved: " + employeeId;
    }

    public List<Person> getAllPersons() {
        return personRepo.findAll();
    }
}
