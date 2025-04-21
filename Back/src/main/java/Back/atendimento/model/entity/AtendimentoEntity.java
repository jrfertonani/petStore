package Back.atendimento.model.entity;

import Back.atendimento.model.AtendimentoStatus;
import Back.atendimento.model.AtendimentoTipo;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "tab_atendimento")
@Data
@Getter     @Setter
public class AtendimentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Integer id;

    private String descricao;
    private LocalDate date;
    private LocalTime hora;
    private Double valor;
    private boolean emergencia;

    @Enumerated(EnumType.STRING)
    private AtendimentoTipo tipo;

    @Enumerated(EnumType.STRING)
    private AtendimentoStatus status;

    @Column(name = "pet_id")
    private Integer animal;
    @Column(name = "prod_serv_id")
    private Integer produtoServico;
    @Column(name = "cad_id")
    private Integer cadastros;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
