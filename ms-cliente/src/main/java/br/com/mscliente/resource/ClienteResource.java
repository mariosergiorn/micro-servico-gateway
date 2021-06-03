/**
 * 
 */
package br.com.mscliente.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mscliente.model.Cliente;
import br.com.mscliente.service.ClienteService;

/**
 * @author Mario Sergio
 *
 */
@RestController
@RequestMapping("/v1/api/cliente")
public class ClienteResource {
	
	@Autowired
	private ClienteService service;
	
	@GetMapping
	public ResponseEntity<List<Cliente>> getAllProdutos () {
		
		return ResponseEntity.ok(this.service.clientes());
	}

}
