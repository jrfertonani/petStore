package Back.model.entity.atendimento;

import Back.model.entity.cadastro.AnimaisEntity;
import Back.model.entity.cadastro.Cadastros;
import Back.model.entity.cadastro.ProdutosServicos;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class Atendimentos {

    private Integer id;
    private AtendimentoTipo tipo;
    private AtendimentoStatus status;
    private String descricao;
    private LocalDate date;
    private LocalTime hora;

    private Cadastros solicitante;
    private ProdutosServicos servico;
    private AnimaisEntity paciente;
    private Double valor;

}
