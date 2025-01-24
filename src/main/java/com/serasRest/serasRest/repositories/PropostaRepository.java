package com.serasRest.serasRest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.serasRest.serasRest.entities.PropostaEmprestimo;

@Repository
public interface PropostaRepository extends JpaRepository<PropostaEmprestimo, Long> {
}
