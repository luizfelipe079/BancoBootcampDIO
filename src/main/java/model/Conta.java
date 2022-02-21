package model;

import Utils.AcoesConta;
import lombok.Data;

@Data
public abstract class Conta implements AcoesConta
{
    protected static int AGENCIA_PADRAO = 001;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta()
    {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }


    @Override
    public void sacar(double valor)
    {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor)
    {
        saldo += valor;
    }

    @Override
    public void tranferir(double valor, Conta contaDestino)
    {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirDadosComuns()
    {
        System.out.println(String.format("Titular: %s", this.cliente.getNome() + this.cliente.getSobrenome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

}
