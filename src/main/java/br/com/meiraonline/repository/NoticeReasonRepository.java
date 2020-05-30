package br.com.meiraonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.meiraonline.domain.NoticeReason;

@Repository
public interface NoticeReasonRepository extends JpaRepository<NoticeReason, Long> {

}
