package br.com.meiraonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.meiraonline.domain.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long>{

}
