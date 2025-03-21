package Back.cadastro.repository;

import Back.cadastro.model.entity.cadastro.CadastrosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastrosRepository extends JpaRepository<CadastrosEntity, Integer> {
}
