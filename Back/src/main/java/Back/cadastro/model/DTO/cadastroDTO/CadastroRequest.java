package Back.cadastro.model.DTO.cadastroDTO;

import Back.cadastro.model.entity.cadastro.Enderecos;
import Back.cadastro.model.entity.cadastro.Perfil;
import lombok.Data;

@Data
public class CadastroRequest {

    private String nome;
    private Perfil perfil;
    private Enderecos endereco;


}
