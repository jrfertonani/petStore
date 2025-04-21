package Back.cadastro.service;

import Back.cadastro.model.DTO.clienteDTO.CadastroRequest;
import Back.cadastro.model.DTO.clienteDTO.CadastroResponse;
import Back.cadastro.model.entity.cadastro.CadastroEntity;
import Back.cadastro.repository.CadastrosRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CadastroService {


    @Autowired
    public CadastrosRepository repository;

    public List<CadastroResponse> listAll(){
        List<CadastroEntity> entities = repository.findAll();
        List<CadastroResponse> response = new ArrayList<>();
        for(CadastroEntity e: entities){
            CadastroResponse res = new CadastroResponse();
            BeanUtils.copyProperties(e, res);
            response.add(res);
        }
        return response;
    }

    public Integer post(CadastroRequest request){
        CadastroEntity entities = new CadastroEntity();
        BeanUtils.copyProperties(request, entities);
        return repository.save(entities).getId();
    }

    public Integer put(Integer id, CadastroRequest request){
        CadastroEntity entities = repository.findById(id).orElse(null);
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
