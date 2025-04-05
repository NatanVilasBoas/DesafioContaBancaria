package com.contaBancaria.conta;

public class ContaBancaria {
    private String nomeTitular;
    private String numeroConta;
    private double saldo = 0.0;
    private TipoConta tipoConta;

    public ContaBancaria(String nomeTitular, String numeroConta, TipoConta tipoConta){
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTipoConta() {
        return tipoConta.getValue();
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNomeTitular(String nomeTitular){
        if(nomeTitular == null || nomeTitular.trim().isEmpty()){
            System.out.println("Não foi possível alterar o nome, valor inválido.");
            return;
        }
        this.nomeTitular = nomeTitular;
    }

    public void depositar(double value){
        System.out.println("Depositando: " + value);
        this.saldo += value;
        System.out.println("saldo atual: " + saldo);
    }

    public void sacar(double value){
        System.out.println("Sacando: " + value);
        if(value > this.saldo){
            System.out.println("Transação negada. Valor de saque maior que o saldo!");
            return;
        }
        this.saldo -= value;
        System.out.println("Saque realizado, saldo atual: " + saldo);
    }

    public void apresentarResumo(){
        System.out.println("Resumo da conta" );
        System.out.println("nome do titular: " + getNomeTitular());
        System.out.println("número da conta: " + getNumeroConta());
        System.out.println("tipo da conta: " + getTipoConta());
        System.out.println("saldo: " + getSaldo());
    }
}
