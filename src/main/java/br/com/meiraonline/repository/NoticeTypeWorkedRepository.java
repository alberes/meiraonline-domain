package br.com.meiraonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.meiraonline.domain.NoticeTypeWorked;

@Repository
public interface NoticeTypeWorkedRepository extends JpaRepository<NoticeTypeWorked, Long> {

}
