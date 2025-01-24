package com.serasRest.serasRest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.serasRest.serasRest.entities.Cliente;

@Repository

public interface ClienteRepository extends JpaRepository <Cliente, Long> {
}