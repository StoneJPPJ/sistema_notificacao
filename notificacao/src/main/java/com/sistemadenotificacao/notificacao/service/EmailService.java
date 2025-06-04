package com.sistemadenotificacao.notificacao.service;

import com.sistemadenotificacao.notificacao.model.Cliente;
import com.sistemadenotificacao.notificacao.model.PropostaEmprestimo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void enviarNotificacao(Cliente cliente, PropostaEmprestimo proposta) {
        SimpleMailMessage mensagem = new SimpleMailMessage();
        mensagem.setTo(cliente.getEmail());
        mensagem.setSubject("Notificação de Empréstimo Pendente");

        String corpo = "Prezado(a) " + cliente.getNomeCliente() + ",\n\n" +
                "Constatamos que há um empréstimo pendente em seu CPF no valor de R$ "
                + proposta.getValor() + ".\n" +
                "Caso tenha dúvidas, acesse o nosso chatbot de atendimento:\n\n" +
                "https://chatbot.sistemadenotificacao.com/atendimento\n\n" +
                "Atenciosamente,\n" +
                "Equipe Sistema de Notificação";

        mensagem.setText(corpo);
        mailSender.send(mensagem);
    }
}