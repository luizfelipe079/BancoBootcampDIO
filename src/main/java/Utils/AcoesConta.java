package Utils;

import model.Conta;

public interface AcoesConta
{
    void sacar(double valor);

    void depositar(double valor);

    void tranferir(double valor, Conta contaDestino);

    void imprimirExtrato();
}
