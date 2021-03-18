package com.devsuperior.dscatalog.cap01.repositories;

import com.devsuperior.dscatalog.cap01.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
