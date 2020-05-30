package br.com.meiraonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.meiraonline.domain.NoticeType;

@Repository
public interface NoticeTypeRepository extends JpaRepository<NoticeType, Long> {

}
