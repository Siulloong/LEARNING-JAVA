package com.www.banco.app;

import com.www.banco.modelo.Conta;
import com.www.banco.modelo.ContaEspecial;
import com.www.banco.modelo.ContaInvestimento;
import com.www.banco.modelo.Pessoa;

public class Principal {
    public static void main(String[] args) {

        Pessoa titular1 = new Pessoa();
        titular1.setNome("jow mcrow");
        titular1.setDocumento ("3453453453453");

        Pessoa titular2 = new Pessoa();
        titular2.setNome("Maria Jose");
        titular2.setDocumento("1571461461456");

//        Conta minhaConta = new Conta(titular1, 222, 987);
        //ContaInvestimento suaConta = new ContaInvestimento(titular1, 222, 987);
        ContaEspecial suaConta =
                new Conta(titular2, 234, 678, 1_000);

        suaConta.depositar(15_000);
        suaConta.sacar(15_500);
//        minhaConta.sacar(3_5 00, 55);
//        minhaConta.creditarRendimentos(0.8);

//        System.out.println("Titular: "+minhaConta. getTitular().getNome());
//        System.out.println("Saldo: "+minhaConta.getSaldo());

        System.out.println("Titular: "+suaConta.getTitular().getNome());
        System.out.println("Saldo: "+suaConta.getSaldo());

     }
}
