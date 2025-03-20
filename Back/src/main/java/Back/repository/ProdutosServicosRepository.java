package Back.repository;

import Back.model.entity.cadastro.ProdutosServicos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutosServicosRepository extends JpaRepository<ProdutosServicos, Integer> {
}
