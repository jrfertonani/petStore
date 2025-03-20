package Back.model.cadastro;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Entity
@Table(name = "tab_cadastro")
@Data
public class Cadastros {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Integer id;

    @Column(length = 50, nullable = false)
    private String nome;

    @Embedded
    private Perfil perfil;
    @Embedded
    private Enderecos endereco;


}
