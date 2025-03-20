package Back.model.atendimento;

import Back.model.cadastro.Animais;
import Back.model.cadastro.Cadastros;
import Back.model.cadastro.ProdutosServicos;
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
    private Animais paciente;
    private Double valor;

}
