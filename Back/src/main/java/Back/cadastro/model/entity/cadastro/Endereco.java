package Back.cadastro.model.entity.cadastro;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter     @Setter
public class Endereco {

    @Column(name = "logra", length = 50)
    private String logradouro;
    @Column(name = "numero", length = 6)
    private String numero;

}
