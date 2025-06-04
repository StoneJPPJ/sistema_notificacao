package com.sistemadenotificacao.notificacao.controller;

import org.springframework.web.bind.annotation.RestController;
import com.sistemadenotificacao.notificacao.model.Cliente;
import com.sistemadenotificacao.notificacao.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @GetMapping
    public List<Cliente> listarClientes() {
        return service.listarTodos();
    }

    @PostMapping
    public Cliente criarCliente(@RequestBody Cliente cliente) {
        return service.salvar(cliente);
    }
}