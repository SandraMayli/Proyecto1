package com.trinidad.domain.service;

import com.trinidad.domain.entities.Veterinario;

import java.util.List;

public interface VeterinarioService {

    Veterinario registrarVeterinario(Veterinario veterinario);
    Veterinario modificarVeterinario (Veterinario veterinario);
    List<Veterinario> listarVeterinario();
    Veterinario obtenerVeterinarioPorId (Integer idVeterinario);
}
