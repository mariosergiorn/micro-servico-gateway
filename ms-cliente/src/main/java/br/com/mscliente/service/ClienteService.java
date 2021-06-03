/**
 * 
 */
package br.com.mscliente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mscliente.model.Cliente;
import br.com.mscliente.repository.ClienteRepository;

/**
 * @author Mario Sergio
 *
 */
@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;
	
	public List<Cliente> clientes () {
		
		return this.repository.findAll();
	}

}
