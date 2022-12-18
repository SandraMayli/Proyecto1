package com.trinidad.domain.service.impl;

import com.trinidad.domain.entities.Cliente;
import com.trinidad.domain.repositories.ClienteRepository;
import com.trinidad.domain.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository; //patron de diseño inyeccion de dependencias- inversion de control

    @Override
    public List<Cliente> listarCliente() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente registrarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente modificarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public void eliminarCliente(Integer idCliente) {clienteRepository.deleteById(idCliente);}

    @Override
    public Cliente obtenerClientePorId (Integer idCliente) {
        return clienteRepository.findById(idCliente).orElse(new Cliente());
    }
}
