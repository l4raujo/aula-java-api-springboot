package com.equipe1.sistema_escolar.repositories;

import com.equipe1.sistema_escolar.model.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface SalaRepository extends JpaRepository<Sala, Long> {
}
