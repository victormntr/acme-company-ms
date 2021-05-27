
package br.com.ci.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ci.model.Produto;


@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	
}
