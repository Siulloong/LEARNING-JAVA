package com.www.banco.modelo;

public class ContaInvestimento extends Conta {

    public ContaInvestimento(Pessoa titular, int agencia, int numero) {
        super(titular, agencia,numero);
    }

    public void creditarRendimentos(double percentual Juros) {
        double valorRencimentos = getSaldo() * percentualJuros / 100;
        depositar (valorRencimentos);
    }

}
