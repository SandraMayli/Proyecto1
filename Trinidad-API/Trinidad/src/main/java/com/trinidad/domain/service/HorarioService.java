package com.trinidad.domain.service;

import com.trinidad.domain.entities.Horario;

import java.util.List;

public interface HorarioService {

    Horario createHorario(Horario horario);
    List<Horario> listHorarios();
    Horario getHorario(Integer id);
    Horario updateHorario(Horario horario);
    void deleteHorario(Integer idHorario);

}
