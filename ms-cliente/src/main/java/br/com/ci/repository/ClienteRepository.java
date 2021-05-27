
package br.com.ci.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ci.model.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	
}
