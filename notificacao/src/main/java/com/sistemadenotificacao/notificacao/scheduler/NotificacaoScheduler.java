package com.sistemadenotificacao.notificacao.scheduler;

import com.sistemadenotificacao.notificacao.model.Cliente;
import com.sistemadenotificacao.notificacao.model.PropostaEmprestimo;
import com.sistemadenotificacao.notificacao.repository.ClienteRepository;
import com.sistemadenotificacao.notificacao.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NotificacaoScheduler {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EmailService emailService;

    @Scheduled(cron = "0 * * * * *") // Executa todos os dias às 9h da manhã
    public void enviarNotificacoesPendentes() {
        System.out.println("Iniciando verificação de propostas pendentes...");

        List<Cliente> clientesComPendencias = clienteRepository.buscarClientesComPropostaPendente();

        for (Cliente cliente : clientesComPendencias) {
            // Agora vamos simular pegando a primeira proposta pendente do cliente
            List<PropostaEmprestimo> propostas = cliente.getPropostas(); // Supondo relacionamento no model

            if (propostas != null && !propostas.isEmpty()) {
                PropostaEmprestimo proposta = propostas.get(0); // Pegando uma proposta pendente

                emailService.enviarNotificacao(cliente, proposta);
            }
        }

        System.out.println("Envio de notificações concluído.");
    }
}
