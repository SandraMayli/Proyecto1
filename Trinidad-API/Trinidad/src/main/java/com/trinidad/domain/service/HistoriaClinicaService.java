package com.trinidad.domain.service;

import com.trinidad.domain.entities.HistoriaClinica;

import java.util.List;

public interface HistoriaClinicaService {
    HistoriaClinica registrarHistoriaClinica(HistoriaClinica historiaClinica);
    HistoriaClinica modificarHistoriaClinica(HistoriaClinica historiaClinica);
    HistoriaClinica obtenerHistoriaClinicaPorId(Integer idhistoriaClinica);
    List<HistoriaClinica> listarHistoriaClinica();
    void eliminarHistoriaClinica(Integer idhistoriaClinica);
}

