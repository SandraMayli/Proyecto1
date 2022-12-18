package com.trinidad.domain.service.impl;

import com.trinidad.domain.entities.Horario;
import com.trinidad.domain.repositories.HorarioRepository;
import com.trinidad.domain.service.HorarioService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HorarioServiceImpl implements HorarioService {

    private final HorarioRepository horarioRepository;

    HorarioServiceImpl(HorarioRepository horarioRepository){
        this.horarioRepository = horarioRepository;
    }

    @Override
    public Horario createHorario(Horario horario) {
        return this.horarioRepository.save(horario);
    }

    @Override
    public List<Horario> listHorarios() {
        return null;
    }

    @Override
    public Horario getHorario(Integer id) {
        return this.horarioRepository.getById(id);
    }

    @Override
    public Horario updateHorario(Horario horario) {
        return this.horarioRepository.save(horario);
    }

    @Override
    public void deleteHorario(Integer idHorario) {
        this.horarioRepository.deleteById(idHorario);
    }
}
