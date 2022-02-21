package model;

import lombok.Data;

import java.util.List;

@Data
public class Banco
{
    private String nome;
    private List<Cliente> clientes;
    private Endereco endereco;

    public void imprimirBanco()
    {
        System.out.println("==================== Banco ====================");
        System.out.println(String.format("Nome: %s", this.getNome()));
        endereco.imprimirEndereco();
    }
}
