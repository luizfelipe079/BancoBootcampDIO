package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente
{
    private String nome;
    private String sobrenome;
    private List<Conta> contas;
    private Endereco endereco;

    public void imprimirCliente()
    {
        System.out.println("==================== Cliente ====================");
        System.out.println(String.format("Nome: %s", this.getNome()));
        System.out.println(String.format("Sobrenome: %s", this.getSobrenome()));
        endereco.imprimirEndereco();
    }
}
