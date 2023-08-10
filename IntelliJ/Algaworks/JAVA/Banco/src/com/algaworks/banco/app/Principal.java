package com.algaworks.banco.app;

import com.algaworks.banco.modelo.Conta;
import com.algaworks.banco.modelo.Pessoa;

public class Principal {
    public static void main(String[] args) {

        Pessoa titular1 = new Pessoa();
        titular1.setNome("Ederson Araujo");
        titular1.setDocumento("12313213213");

        Pessoa titular2 = new Pessoa();
        titular2.setNome("Maria da Cruz");
        titular2.setDocumento("456456465465");

        Conta minhaConta = new Conta(titular1, 123, 987);
        Conta suaConta = new Conta(titular2, 222, 333);

        suaConta.depositar(5_000);
        minhaConta.depositar(25_000);

        minhaConta.sacar(5_000, 10);

        System.out.println("Titular: " + minhaConta.getTitular().getNome());
        System.out.println("Saldo: " + minhaConta.getSaldo());

        System.out.println("Titular: " + suaConta.getTitular().getNome());
        System.out.println("Saldo: " + suaConta.getSaldo());

    }
}
