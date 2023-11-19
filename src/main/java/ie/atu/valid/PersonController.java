package ie.atu.valid;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/person")
@RestController
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/person/createPerson")
    public String addPerson(@RequestBody @Valid Person person) {
        return "Details added";
    }

    @GetMapping("/person/{employeeId}")
    public ResponseEntity<?> getPerson(@PathVariable String employeeId) {
        if(employeeId.length() > 5 || employeeId.isBlank()) {
            return ResponseEntity.badRequest().body("EmployeeId is invalid");
        }
        Person person = personService.getPersonByEmployeeId(employeeId);

        if(person == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(person);
    }
}
