package Back.cadastro.model.entity.cadastro;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter     @Setter
public class Perfil {

    private boolean cliente;
    private boolean fornecedor;
    private boolean prestador;



}
