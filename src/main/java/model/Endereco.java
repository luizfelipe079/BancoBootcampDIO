package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Endereco
{
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private int numero;

    protected void imprimirEndereco()
    {
        System.out.println("==================== Endereco ====================");
        System.out.println(String.format("Estado: %s", this.estado));
        System.out.println(String.format("Cidade: %s", this.cidade));
        System.out.println(String.format("Bairro: %s", this.bairro));
        System.out.println(String.format("Rua: %s", this.rua));
        System.out.println(String.format("Número: %d", this.numero));
    }
}
