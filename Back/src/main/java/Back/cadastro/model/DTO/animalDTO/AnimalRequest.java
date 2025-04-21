package Back.cadastro.model.DTO.animalDTO;

import Back.cadastro.model.entity.cadastro.AnimalEspecie;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AnimalRequest {

    private String nome;
    private LocalDate aniversario;
    private AnimalEspecie especie;
    private Integer tutor;
}
