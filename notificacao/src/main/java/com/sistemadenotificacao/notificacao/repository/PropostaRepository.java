package com.sistemadenotificacao.notificacao.repository;

import com.sistemadenotificacao.notificacao.model.PropostaEmprestimo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropostaRepository extends JpaRepository<PropostaEmprestimo, String> {
}
