package Back.model.DTO.animaisDTO;

import Back.model.entity.cadastro.AnimalEspecie;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AnimaisRequest{

    private String nome;
    private LocalDate aniversario;
    private AnimalEspecie especie;
    private Integer tutor;
}
