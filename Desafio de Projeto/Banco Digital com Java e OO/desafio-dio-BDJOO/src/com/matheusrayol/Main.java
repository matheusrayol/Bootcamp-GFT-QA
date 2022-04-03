package com.matheusrayol;

import com.matheusrayol.contas.ContaCorrente;
import com.matheusrayol.contas.ContaPoupanca;
import com.matheusrayol.classes.Cliente;
import com.matheusrayol.classes.Conta;

public class Main {

    public static void main(String[] args) {

        Cliente matheus = new Cliente();
        matheus.definirNome("Matheus");

        Conta corrente = new ContaCorrente(matheus);
        Conta poupanca = new ContaPoupanca(matheus);

        corrente.efetuarDeposito(900);
        corrente.efetuarTransferencia(289, poupanca);

        corrente.imprimeResumo();
        poupanca.imprimeResumo();
    }
}
