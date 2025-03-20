package Back.model.DTO.cadastroDTO;

import Back.model.entity.cadastro.Enderecos;
import Back.model.entity.cadastro.Perfil;
import lombok.Data;

@Data
public class CadastroRequest {

    private String nome;
    private Perfil perfil;
    private Enderecos endereco;


}
