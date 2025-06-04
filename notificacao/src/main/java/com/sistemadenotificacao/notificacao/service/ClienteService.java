package com.sistemadenotificacao.notificacao.service;

import com.sistemadenotificacao.notificacao.model.Cliente;
import com.sistemadenotificacao.notificacao.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> buscarClientesComPropostaPendente() {
        return clienteRepository.buscarClientesComPropostaPendente();
    }

    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }
    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

}