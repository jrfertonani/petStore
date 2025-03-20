package Back.atendimento.model.entity;

import Back.atendimento.model.AtendimentoStatus;
import Back.atendimento.model.AtendimentoTipo;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "tab_atendimento")
@Data
public class AtendimentosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Integer id;

    private String descricao;
    private LocalDate date;
    private Double valor;
    private boolean emergencia;

    @Enumerated(EnumType.STRING)
    private AtendimentoTipo tipo;

    @Enumerated(EnumType.STRING)
    private AtendimentoStatus status;

    @Column(name = "pet_id")
    private Integer animais;
    @Column(name = "prod_serv_id")
    private Integer produtosServico;
    @Column(name = "cad_id")
    private Integer cadastros;

}
