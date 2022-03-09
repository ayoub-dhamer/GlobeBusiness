package tn.globebusiness.spring.Repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import tn.globebusiness.spring.Entities.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {
	public List<Company> findByName(String n);
	public Page<Company> findByName(String n,Pageable pageable);
	public boolean existsByEmail(String email);
	public boolean existsByLogin(String login);
	public Optional<Company> findByLogin(String login);
	public Iterable<Company> findByPwd(String pwd);
	
}