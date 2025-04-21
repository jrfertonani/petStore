package Back.atendimento.controller;

import Back.atendimento.model.DTO.atendimentosDTO.AtendimentoRequest;
import Back.atendimento.model.DTO.atendimentosDTO.AtendimentoResponse;
import Back.atendimento.service.AtendimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/antendimentos")
public class AtendomentoController {

    @Autowired
    public AtendimentoService service;

    @GetMapping
    public List<AtendimentoResponse> get(){
        return service.listAll();
    }


    @PostMapping
    public Integer gravar(@RequestBody AtendimentoRequest request){
        return service.post(request);
    }


    @PutMapping("/{id}")
    public Integer alterar(@PathVariable("id") Integer id,
                           @RequestBody  AtendimentoRequest request){
        return service.put(id, request);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") Integer id){
        service.deletar(id);
    }

}
