package com.matheusrayol.classes;

public abstract class Conta implements IConta {

    private static final int AGENCIA_DEFAULT = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_DEFAULT;
        this.numeroConta = Conta.SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void efetuarSaque(double valor) {
        System.out.println("Dinheiro retirado: R$" + valor);
        this.saldo -= valor;
    }

    @Override
    public void efetuarDeposito(double valor) {
        System.out.println("Dinheiro depositado: R$" + valor);
        this.saldo += valor;
    }

    @Override
    public void efetuarTransferencia(double valor, IConta contaDestino) {
        System.out.println("Valor da transferência: R$" + valor);
        this.efetuarSaque(valor);
        contaDestino.efetuarDeposito(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void imprimeResumo() {
        System.out.println("Titular: " + this.cliente.getNome());
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Conta: " + this.numeroConta);
        System.out.println("Saldo: R$" + this.saldo);
    }
}
