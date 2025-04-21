package Back.atendimento.model.DTO.atendimentosDTO;

import Back.atendimento.model.AtendimentoStatus;
import Back.atendimento.model.AtendimentoTipo;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AtendimentoRequest {

    private String descricao;
    private LocalDate date;
    private Double valor;
    private boolean emergencia;
    private AtendimentoTipo tipo;
    private AtendimentoStatus status;
    private Integer animais;
    private Integer produtosServico;
    private Integer cadastros;

}
