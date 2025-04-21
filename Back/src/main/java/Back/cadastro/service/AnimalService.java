package Back.cadastro.service;

import Back.cadastro.model.DTO.animalDTO.AnimalRequest;
import Back.cadastro.model.DTO.animalDTO.AnimalResponse;
import Back.cadastro.model.entity.cadastro.AnimalEntity;
import Back.cadastro.repository.AnimaisRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalService {

    @Autowired
    public AnimaisRepository repository;

    public List<AnimalResponse> listAll(){
        List<AnimalEntity> entities = repository.findAll();
        List<AnimalResponse> response = new ArrayList<>();
        for(AnimalEntity e: entities){
            AnimalResponse res = new AnimalResponse();
            BeanUtils.copyProperties(e, res);
            response.add(res);
        }
        return response;
    }

    public Integer post(AnimalRequest request){
        AnimalEntity entities = new AnimalEntity();
        BeanUtils.copyProperties(request, entities);
        return repository.save(entities).getId();
    }

    public Integer put(Integer id, AnimalRequest request){
        AnimalEntity entities = repository.findById(id).orElse(null);
        if(entities != null){
            BeanUtils.copyProperties(request, entities);
            return  repository.save(entities).getId();
        }
        return null;
    }

    public void deletar(Integer id){
        repository.deleteById(id);
    }

}
