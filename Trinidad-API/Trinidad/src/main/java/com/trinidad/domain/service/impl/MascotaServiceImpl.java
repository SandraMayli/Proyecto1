package com.trinidad.domain.service.impl;

import com.trinidad.domain.entities.Mascota;
import com.trinidad.domain.repositories.MascotaRepository;
import com.trinidad.domain.service.MascotaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaServiceImpl implements MascotaService {
    private final MascotaRepository mascotaRepository;

    public MascotaServiceImpl(MascotaRepository mascotaRepository) {
        this.mascotaRepository = mascotaRepository;
    }

    @Override
    public Mascota registrarMascota(Mascota mascota) {
        return mascotaRepository.save(mascota);
    }

    @Override
    public Mascota modificarMascota(Mascota mascota) {
        return mascotaRepository.save(mascota);
    }

    @Override
    public List<Mascota> listarMascotas() {
        return mascotaRepository.findAll();
    }

    @Override
    public Mascota obtenerMascotaPorId(Integer idMascota) {
        return mascotaRepository.findById (idMascota).orElse (new Mascota());
    }

    @Override
    public void eliminarMascota(Integer idMascota) {
        mascotaRepository.deleteById(idMascota);
    }
}

