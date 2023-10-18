package tech.ada.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.ada.ecommerce.model.Produtos;

@Repository
public interface ProdutoRepository extends JpaRepository<Produtos, Long> {
}