package Back.atendimento.repository;

import Back.atendimento.model.entity.AtendimentosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtendimentoRepository extends JpaRepository<AtendimentosEntity, Integer> {
}
