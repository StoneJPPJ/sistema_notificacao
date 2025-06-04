package com.sistemadenotificacao.notificacao.service;

import com.sistemadenotificacao.notificacao.repository.PropostaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropostaService {

    @Autowired
    private PropostaRepository propostaRepository;

    // Podemos adicionar futuras lógicas de negócio para Proposta aqui
}
