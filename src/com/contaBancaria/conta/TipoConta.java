package com.contaBancaria.conta;

public enum TipoConta {
    CORRENTE ("corrente"),
    POUPANCA ("poupança"),
    SALARIO ("salário");

    private String value;

    private TipoConta(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
