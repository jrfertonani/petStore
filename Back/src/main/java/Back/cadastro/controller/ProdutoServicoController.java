package Back.cadastro.controller;

import Back.cadastro.model.entity.cadastro.AnimalEntity;
import Back.cadastro.model.entity.cadastro.ProdutoServico;
import Back.cadastro.repository.AnimaisRepository;
import Back.cadastro.repository.ProdutosServicosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoServicoController {


    @Autowired
    public ProdutosServicosRepository repository;

    @GetMapping
    public List<ProdutoServico> listar(){
        return repository.findAll();
    }

    @PostMapping
    public Integer gravar(@RequestBody  ProdutoServico request){
        repository.save(request);
        return request.getId();
    }

    @PutMapping("/{id}")
    public Integer alterar(@PathVariable("id") Integer id,
                           @RequestBody  ProdutoServico request){
        request.setId(id);
        repository.save(request);
        return request.getId();
    }

    @DeleteMapping("/{id}")
    public Void alterar(@PathVariable("id") Integer id){
        repository.deleteById(id);
        return null;
    }



}
