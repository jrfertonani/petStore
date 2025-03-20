package Back.model.cadastro;

import lombok.Data;

@Data
public class ProdutosServicos {

    private Integer id;
    private String nome;
    private Double valor;
    private boolean servico;

}
