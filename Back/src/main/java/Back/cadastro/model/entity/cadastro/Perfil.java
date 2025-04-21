package Back.cadastro.model.entity.cadastro;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter     @Setter
public class Perfil {

    private boolean cliente;
    private boolean fornecedor;
    private boolean prestador;



}
