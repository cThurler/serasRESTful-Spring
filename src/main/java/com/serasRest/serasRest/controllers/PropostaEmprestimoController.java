package com.serasRest.serasRest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.serasRest.serasRest.entities.PropostaEmprestimo;
import com.serasRest.serasRest.repositories.PropostaRepository;

@RestController
@RequestMapping(value = "/propostas")
public class PropostaEmprestimoController {

    @Autowired
    private PropostaRepository repository;

    @GetMapping
    public List<PropostaEmprestimo> findAll() {
        return repository.findAll();
    }

    @GetMapping(value = "/{id}")
    public PropostaEmprestimo findById(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PostMapping
    public PropostaEmprestimo insert(@RequestBody PropostaEmprestimo proposta) {
        return repository.save(proposta);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PutMapping
    public PropostaEmprestimo update(@RequestBody PropostaEmprestimo proposta) {
        return repository.save(proposta);
    }
}
