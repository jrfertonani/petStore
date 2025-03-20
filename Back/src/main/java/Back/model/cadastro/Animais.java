package Back.model.cadastro;

import lombok.Data;

import java.time.LocalDate;
@Data
public class Animais {

    private Integer id;
    private String nome;
    private LocalDate aniversario;
}
