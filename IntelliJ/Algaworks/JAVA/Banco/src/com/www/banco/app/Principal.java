package com.www.banco.app;

import com.www.banco.modelo.Conta;
import com.www.banco.modelo.Pessoa;

public class Principal {
    public static void main(String[] args) {

        Pessoa titular1 = new Pessoa();
        titular1.setNome("jow mcrow");
        titular1.setDocumento ("3453453453453");

        Pessoa titular2 = new Pessoa();
        titular2.setNome("Maria Jose");
        titular2.setDocumento("8797897897897");

        Conta minhaConta = new Conta(titular1, 222, 987);
        Conta suaConta = new Conta(titular2, 234, 678);

        minhaConta.depositar(3_000);
        suaConta.depositar(4_000);
        minhaConta.sacar(2_000, 55);
        suaConta.depositar(1);

        System.out.println("Titular: "+minhaConta. getTitular().getNome());
        System.out.println("Saldo: "+minhaConta.getSaldo());

        System.out.println("Titular: "+suaConta.getTitular().getNome());
        System.out.println("Saldo: "+suaConta.getSaldo());

    }
}
