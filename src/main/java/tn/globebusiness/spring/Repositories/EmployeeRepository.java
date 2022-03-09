package tn.globebusiness.spring.Repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


import tn.globebusiness.spring.Entities.Employee;


public interface EmployeeRepository  extends JpaRepository<Employee, Long> {
	public List<Employee> findByName(String n);
	 public Page<Employee> findByName(String n,Pageable pageable);
	public boolean existsByEmail(String email);
	public boolean existsByLogin(String login);
	public Optional<Employee> findByLogin(String login);
	public Iterable<Employee> findByPwd(String pwd);
}

