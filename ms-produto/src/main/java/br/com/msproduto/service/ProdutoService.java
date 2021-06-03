/**
 * 
 */
package br.com.msproduto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.msproduto.model.Produto;
import br.com.msproduto.repository.ProdutoRepository;

/**
 * @author Mario Sergio
 *
 */
@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repository;
	
	public List<Produto> produtos () {
		
		return this.repository.findAll();
	}

}
