package com.trinidad.domain.repositories;

import com.trinidad.domain.entities.Veterinario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface VeterinarioRepository extends JpaRepository<Veterinario, Integer>{
    //List<Veterinario> findTop6ByOrderByTitleAsc();
}
