package com.mycompany.banco;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.setSaldo(0);
        //this 
        this.setStatus(false);
        System.out.println("Conta Aberta com sucesso");
    }

    public ContaBanco(int numConta, String tipo, String dono, float saldo, boolean status) {
        this.setNumConta(numConta);
        this.setTipo(tipo);
        this.setDono(dono);
        this.setSaldo(0);
        this.setStatus(false);
        System.out.println("Conta Aberta com sucesso");
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
            //igual == this.saldo = 50;
        } else if (t == "CP") {
            this.setSaldo(150);
            //igual == this.saldo = 150;
        }
    }

    public void fecharConta() {

        if (this.getSaldo() > 0) {
            //if (this.saldo == 0) {
            System.out.println("Conta com dinheiro!!");
        } else if (this.getSaldo() < 0) {
            //} else if (this.saldo < 0) {
            System.out.println("Conta em débito, caloteiro!!");
        } else {
            setStatus(false);
            System.out.println("Sua conta foi fechada com sucesso!");
        }
    }

    public void depositar(float valor) {
        if (this.getStatus()) {
            //if (this.status == true) {
            setSaldo(getSaldo() + valor); // pegue o saldo atual, modifique ele e acrescente o valor
            //this.Saldo = this.Saldo += valor;
        } else {
            System.out.println("ERROR!! Conta fechada!!");
        }
    }

    public void sacar(float valor) {
        if (this.getStatus() == true) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
            } else {
                System.out.println("Você não tem saldo suficiente para efetuar o saque!!");
            }
        } else {
            System.out.println("Impossivel Sacar, conta fechada!!");
        }
    }

    public void pagarMensal() {
        int valor = 0;
        if (this.getTipo() == "CC") {
            valor = 12;
        } else if (this.getTipo() == "CP") {
            valor = 20;
        }

        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else {
            System.out.println("Impossivel efetuar o pagamento");
        }
    }

    public void estadoAtual() {
        System.out.println("----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
}
