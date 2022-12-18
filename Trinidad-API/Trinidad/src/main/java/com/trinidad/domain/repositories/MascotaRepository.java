package com.trinidad.domain.repositories;

import com.trinidad.domain.entities.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MascotaRepository extends JpaRepository<Mascota, Integer> {

}
