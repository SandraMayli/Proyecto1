package com.trinidad.domain.repositories;

import com.trinidad.domain.entities.Horario;
import com.trinidad.domain.entities.Veterinario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HorarioRepository extends JpaRepository<Horario, Integer> {

    List<Horario> getByIdVeterinario(Veterinario veterinario);
}
