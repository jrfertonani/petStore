package Back.repository;

import Back.model.cadastro.Animais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimaisRepository extends JpaRepository<Animais, Integer> {
}
