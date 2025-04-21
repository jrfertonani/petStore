package Back.cadastro.repository;

import Back.cadastro.model.entity.cadastro.ProdutoServico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutosServicosRepository extends JpaRepository<ProdutoServico, Integer> {
}
