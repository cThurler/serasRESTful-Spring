package com.serasRest.serasRest.entities;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "emprestimo")
public class Emprestimo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Long propostaId;
    
    private double valorAprovado;
    private int numeroParcelas;
    private double saldoDevedor;
    private Date dataInicio;
    private double taxaJurosMensal;


    public Emprestimo(Long id, Long propostaId, double valorAprovado, int numeroParcelas, double saldoDevedor,
			Date dataInicio, double taxaJurosMensal) {
		this.id = id;
		this.propostaId = propostaId;
		this.valorAprovado = valorAprovado;
		this.numeroParcelas = numeroParcelas;
		this.saldoDevedor = saldoDevedor;
		this.dataInicio = dataInicio;
		this.taxaJurosMensal = taxaJurosMensal;
	}
    public Emprestimo(){
    	
    }
	// Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPropostaId() {
        return propostaId;
    }

    public void setPropostaId(Long propostaId) {
        this.propostaId = propostaId;
    }

    public double getValorAprovado() {
        return valorAprovado;
    }

    public void setValorAprovado(double valorAprovado) {
        this.valorAprovado = valorAprovado;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    public double getSaldoDevedor() {
        return saldoDevedor;
    }

    public void setSaldoDevedor(double saldoDevedor) {
        this.saldoDevedor = saldoDevedor;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public double getTaxaJurosMensal() {
        return taxaJurosMensal;
    }

    public void setTaxaJurosMensal(double taxaJurosMensal) {
        this.taxaJurosMensal = taxaJurosMensal;
    }

    public void calcularSaldoDevedor() {
        this.saldoDevedor = this.valorAprovado + (this.valorAprovado * ((this.taxaJurosMensal / 100) * this.numeroParcelas));
    }
}
