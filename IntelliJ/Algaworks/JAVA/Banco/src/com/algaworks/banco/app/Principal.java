package com.algaworks.banco.app;

import com.algaworks.banco.modelo.Conta;
import com.algaworks.banco.modelo.ContaEspecial;
import com.algaworks.banco.modelo.ContaInvestimento;
import com.algaworks.banco.modelo.Pessoa;

public class Principal {
    public static void main(String[] args) {

        Pessoa titular1 = new Pessoa();
        titular1.setNome("Ederson Araujo");
        titular1.setDocumento("12313213213");

        Pessoa titular2 = new Pessoa();
        titular2.setNome("Maria da Cruz");
        titular2.setDocumento("456456465465");

        ContaInvestimento minhaConta = new ContaInvestimento(titular1, 123, 987);
        ContaEspecial suaConta = new ContaEspecial(titular2, 222, 333, 1000);

        suaConta.depositar(15_000);
        //minhaConta.depositar(25_000);

        suaConta.sacar(15_500);
//        minhaConta.creditarRendimentos(0.8);

        System.out.println("Titular: " + minhaConta.getTitular().getNome());
        System.out.println("Saldo: " + minhaConta.getSaldo());

        System.out.println("Titular: " + suaConta.getTitular().getNome());
        System.out.println("Saldo: " + suaConta.getSaldo());

    }
}
