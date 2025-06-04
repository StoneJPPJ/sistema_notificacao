package com.sistemadenotificacao.notificacao.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "clientes_cadastrados")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    private String nomeCliente;
    private String email;

    @OneToMany(mappedBy = "cliente")
    private List<PropostaEmprestimo> propostas;

    // Getters e Setters
    public Long getIdCliente() { return idCliente; }
    public void setIdCliente(Long idCliente) { this.idCliente = idCliente; }

    public String getNomeCliente() { return nomeCliente; }
    public void setNomeCliente(String nomeCliente) { this.nomeCliente = nomeCliente; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public List<PropostaEmprestimo> getPropostas() {
        return propostas;
    }

    public void setPropostas(List<PropostaEmprestimo> propostas) {
        this.propostas = propostas;
    }
}