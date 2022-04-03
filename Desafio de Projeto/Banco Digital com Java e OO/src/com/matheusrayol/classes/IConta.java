package com.matheusrayol.classes;

public interface IConta {

    void efetuarSaque(double valor);
    void efetuarDeposito(double valor);
    void efetuarTransferencia(double valor, IConta contaDestino);
    void imprimeResumo();
}
