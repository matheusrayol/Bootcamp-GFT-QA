package com.matheusrayol.contas;

import com.matheusrayol.classes.Cliente;
import com.matheusrayol.classes.Conta;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimeResumo() {
        System.out.println("\nConta Poupança - Extrato\n===========================");
        super.imprimeResumo();
        System.out.println("===========================\n");
    }
}
