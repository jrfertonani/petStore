package Back.model.cadastro;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.Data;

@Embeddable
public class Perfil {

    private boolean cliente;
    private boolean fornecedor;
    private boolean prestador;

}
