package com.sistemadenotificacao.notificacao.repository;

import com.sistemadenotificacao.notificacao.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, String> {

    @Query("SELECT c FROM Cliente c JOIN FETCH c.propostas p WHERE p.dataDeposito IS NULL")
    List<Cliente> buscarClientesComPropostaPendente();
}
