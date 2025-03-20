package Back.repository;

import Back.model.entity.cadastro.AnimaisEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimaisRepository extends JpaRepository<AnimaisEntity, Integer> {
}
