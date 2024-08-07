package br.com.magalums.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.magalums.entity.Status;

public interface StatusRepository extends JpaRepository<Status, Long> {
}
