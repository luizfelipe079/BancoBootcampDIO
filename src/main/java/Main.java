import model.*;

import java.util.ArrayList;
import java.util.List;

public class Main
{

    public static void main(String[] args)
    {
        Banco banco = new Banco();
        banco.setNome("BancoDIO");

        Cliente cliente = new Cliente();
        cliente.setNome("Luiz");
        cliente.setSobrenome("Oliveira");

        Endereco enderecoCliente = new Endereco();
        enderecoCliente.setEstado("PE");
        enderecoCliente.setCidade("Recife");
        enderecoCliente.setBairro("Casa amarela");
        enderecoCliente.setRua("Rua A");
        enderecoCliente.setNumero(1502);

        Endereco enderecoBanco = new Endereco();
        enderecoBanco.setEstado("PE");
        enderecoBanco.setCidade("Recife");
        enderecoBanco.setBairro("Casa amarela");
        enderecoBanco.setRua("Rua B");
        enderecoBanco.setNumero(1553);

        banco.setEndereco(enderecoBanco);

        cliente.setEndereco(enderecoCliente);

        Conta cc = new ContaCorrente();
        cc.setCliente(cliente);
        cc.depositar(100);

        Conta cp = new ContaPoupanca();
        cp.setCliente(cliente);
        cp.depositar(250);

        List<Conta> contas = new ArrayList<>();
        contas.add(cc);
        contas.add(cp);

        cc.tranferir(75, cp);

        cliente.setContas(contas);

        banco.imprimirBanco();
        cliente.imprimirCliente();

        for(int i = 0; i < cliente.getContas().size(); i++)
        {
            cliente.getContas().get(i).imprimirExtrato();
        }
    }
}
