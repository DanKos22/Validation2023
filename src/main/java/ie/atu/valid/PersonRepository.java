package ie.atu.valid;

import org.springframework.data.jpa.repository.JpaRepository;

// Create an interface to have access to all different CRUD operations
public interface PersonRepository extends JpaRepository<Person, Long> {

    Person findByEmployeeId(String employeeId);
}
