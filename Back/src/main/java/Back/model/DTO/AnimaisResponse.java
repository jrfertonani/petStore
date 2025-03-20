package Back.model.DTO;

import Back.model.entity.cadastro.AnimalEspecie;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AnimaisResponse {

    private Integer id;
    private String nome;
    private LocalDate aniversario;
    private AnimalEspecie especie;
    
}
