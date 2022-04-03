package com.matheusrayol.contas;

import com.matheusrayol.classes.Cliente;
import com.matheusrayol.classes.Conta;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimeResumo() {
        System.out.println("\nConta Corrente - Extrato\n===========================");
        super.imprimeResumo();
        System.out.println("===========================\n");
    }
}
