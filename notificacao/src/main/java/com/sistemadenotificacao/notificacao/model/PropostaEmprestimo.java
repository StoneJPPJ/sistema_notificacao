package com.sistemadenotificacao.notificacao.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "propostas_emprestimo")
public class PropostaEmprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProposta;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    private BigDecimal valor;
    private Integer parcelas;
    private LocalDate dataSolicitacao;
    private LocalDate dataDeposito;

    // Getters e Setters
    public Long getIdProposta() { return idProposta; }
    public void setIdProposta(Long idProposta) { this.idProposta = idProposta; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public BigDecimal getValor() { return valor; }
    public void setValor(BigDecimal valor) { this.valor = valor; }

    public Integer getParcelas() { return parcelas; }
    public void setParcelas(Integer parcelas) { this.parcelas = parcelas; }

    public LocalDate getDataSolicitacao() { return dataSolicitacao; }
    public void setDataSolicitacao(LocalDate dataSolicitacao) { this.dataSolicitacao = dataSolicitacao; }

    public LocalDate getDataDeposito() { return dataDeposito; }
    public void setDataDeposito(LocalDate dataDeposito) { this.dataDeposito = dataDeposito; }
}