package Back.model.entity.cadastro;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
public class Enderecos {

    @Column(name = "logra", length = 50)
    private String logradouro;
    @Column(name = "nr", length = 6)
    private String numero;

}
