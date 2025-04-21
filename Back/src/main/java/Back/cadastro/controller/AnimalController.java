package Back.cadastro.controller;

import Back.cadastro.model.DTO.animalDTO.AnimalRequest;
import Back.cadastro.model.DTO.animalDTO.AnimalResponse;
import Back.cadastro.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/animais")
public class AnimalController {

    @Autowired
    public AnimalService service;

    @GetMapping
    public List<AnimalResponse> get(){
        return service.listAll();
    }

    @PostMapping
    public Integer gravar(@RequestBody AnimalRequest request){
        return service.post(request);
    }

    @PutMapping("/{id}")
    public Integer alterar(@PathVariable("id") Integer id,
                           @RequestBody  AnimalRequest request){
        return service.put(id, request);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") Integer id){
        service.deletar(id);
    }

}
