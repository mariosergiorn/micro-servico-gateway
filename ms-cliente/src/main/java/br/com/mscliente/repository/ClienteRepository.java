/**
 * 
 */
package br.com.mscliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mscliente.model.Cliente;

/**
 * @author Mario Sergio
 *
 */
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
