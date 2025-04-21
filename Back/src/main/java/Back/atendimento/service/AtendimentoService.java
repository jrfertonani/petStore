package Back.atendimento.service;

import Back.atendimento.model.DTO.atendimentosDTO.AtendimentoRequest;
import Back.atendimento.model.DTO.atendimentosDTO.AtendimentoResponse;
import Back.atendimento.model.entity.AtendimentoEntity;
import Back.atendimento.repository.AtendimentoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AtendimentoService {

    @Autowired
    public AtendimentoRepository repository;

    public List<AtendimentoResponse> listAll(){
        List<AtendimentoEntity> entities = repository.findAll();
        List<AtendimentoResponse> response = new ArrayList<>();
        for(AtendimentoEntity e: entities){
            AtendimentoResponse res = new AtendimentoResponse();
            BeanUtils.copyProperties(e, res);
            response.add(res);
        }
        return response;
    }

    public Integer post(AtendimentoRequest request){
        AtendimentoEntity entities = new AtendimentoEntity();
        BeanUtils.copyProperties(request, entities);
        return repository.save(entities).getId();
    }


    public Integer put(Integer id, AtendimentoRequest request){
        AtendimentoEntity entities = repository.findById(id).orElse(null);
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
