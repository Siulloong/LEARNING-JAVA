package com.www.banco.modelo;

import java.util.Objects;

public class Conta {

     private Pessoa titular;
     private int agencia;
     private int numero;
     private double saldo;

     //construtor
     Conta () {
     }

     public Conta(Pessoa titular, int agencia, int numero ){
          Objects.requireNonNull(titular);

          this.titular = titular;
          this.agencia = agencia;
          this.numero = numero;
     }

     public void depositar(double valor) {

          if(valor<0) {
               throw new IllegalArgumentException("Saldo deve ser naior que zero");
          }
          saldo  = saldo + valor;
     }

     public void sacar(double valor){

          if(valor<=0) {
               throw new IllegalStateException("Saldo Insuficiente");
          }

          if(saldo - valor < 0) {
               throw new IllegalArgumentException("Saldo deve ser naior que zero");
          }

          saldo = saldo - valor;
     }

     //geters and setters
     public void sacar(double valor, double taxaSaque) {
          sacar(valor + taxaSaque);
     }

     public Pessoa getTitular() {
          return titular;
     }

     public int getAgencia() {
          return agencia;
     }

     public int getNumero() {
          return numero;
     }

     public double getSaldo() {
          return saldo;
     }


}
