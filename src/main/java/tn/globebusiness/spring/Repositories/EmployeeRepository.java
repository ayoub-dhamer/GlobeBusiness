package tn.globebusiness.spring.Repositories;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.globebusiness.spring.Entities.Employee;
import tn.globebusiness.spring.Entities.Post;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long>,JpaRepository <Employee, Long> {
    Employee findByName(String name);

}
