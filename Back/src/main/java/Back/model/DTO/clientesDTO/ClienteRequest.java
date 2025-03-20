package Back.model.DTO.clientesDTO;

import Back.model.entity.cadastro.Enderecos;
import Back.model.entity.cadastro.Perfil;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import lombok.Data;

@Data
public class ClienteRequest {

    private String nome;
    private Perfil perfil;
    private Enderecos endereco;


}
