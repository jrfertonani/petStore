package Back.repository;

import Back.model.entity.cadastro.Cadastros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastros, Integer> {
}
