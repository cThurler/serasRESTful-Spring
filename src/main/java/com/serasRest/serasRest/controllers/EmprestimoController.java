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

import com.serasRest.serasRest.entities.Emprestimo;
import com.serasRest.serasRest.repositories.EmprestimoRepository;

@RestController
@RequestMapping(value = "/emprestimos")
public class EmprestimoController {

    @Autowired
    private EmprestimoRepository repository;

    @GetMapping
    public List<Emprestimo> findAll() {
        return repository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Emprestimo findById(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PostMapping
    public Emprestimo insert(@RequestBody Emprestimo emprestimo) {
        return repository.save(emprestimo);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PutMapping
    public Emprestimo update(@RequestBody Emprestimo emprestimo) {
        return repository.save(emprestimo);
    }
}
