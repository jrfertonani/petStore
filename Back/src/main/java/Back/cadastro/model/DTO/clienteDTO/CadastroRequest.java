package Back.cadastro.model.DTO.clienteDTO;

import Back.cadastro.model.entity.cadastro.Endereco;
import Back.cadastro.model.entity.cadastro.Perfil;
import lombok.Data;

@Data
public class CadastroRequest {

    private String nome;
    private Perfil perfil;
    private Endereco endereco;

}
