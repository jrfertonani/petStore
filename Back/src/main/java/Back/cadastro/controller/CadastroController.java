package Back.cadastro.controller;

import Back.cadastro.model.DTO.clienteDTO.CadastroRequest;
import Back.cadastro.model.DTO.clienteDTO.CadastroResponse;
import Back.cadastro.service.CadastroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cadastros")
public class CadastroController {


    @Autowired
    public CadastroService service;

    @GetMapping
    public List<CadastroResponse> get(){
        return service.listAll();
    }

    @PostMapping
    public Integer gravar(@RequestBody CadastroRequest request){
        return service.post(request);
    }

    @PutMapping("/{id}")
    public Integer alterar(@PathVariable("id") Integer id,
                           @RequestBody CadastroRequest request){
        return service.put(id, request);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") Integer id){
        service.deletar(id);
    }
    

}
