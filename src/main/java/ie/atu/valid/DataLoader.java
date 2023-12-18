package ie.atu.valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final PersonRepository personRepository;

    @Autowired
    public DataLoader(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public void run(String... args) throws Exception {
        //insert your test data here
        Person testData = new Person(1L, "Oskar","oskar@atu.ie", 29, "Mr", "12366", "student", "Electronics");
        Person testData1 = new Person(2L, "Julia","julia@atu.ie", 28, "Mrs", "12355", "student", "Computer Science");
        Person testData2 = new Person(3L, "Paulina","paulina@atu.ie", 26, "Mrs", "12377", "student", "Computer Science");
        personRepository.save(testData);
        personRepository.save(testData1);
        personRepository.save(testData2);
    }
}
