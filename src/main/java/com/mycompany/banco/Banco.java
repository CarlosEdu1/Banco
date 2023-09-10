package com.mycompany.banco;

public class Banco {

    public static void main(String[] args) {
      ContaBanco p1 = new ContaBanco();
      p1.setNumConta(1111);
      p1.setDono("Carlos");
      p1.abrirConta("CC");
      p1.depositar(300);
      p1.estadoAtual();
      
      ContaBanco p2 = new ContaBanco();
      p2.setNumConta(2222);
      p2.setDono("Lucas");
      p2.abrirConta("CP");
      p2.sacar(50);
      p2.estadoAtual();
    }
}
