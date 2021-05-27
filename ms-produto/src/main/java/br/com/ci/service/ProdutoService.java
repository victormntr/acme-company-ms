
package br.com.ci.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ci.model.Produto;
import br.com.ci.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repository;
	
	public List<Produto> lista(){
		return this.repository.findAll();
	}
	
	public Produto findById(Long id) {
		return this.repository.findById(id).get();
	}
	
	public Produto salve(Produto produto) {
		return this.repository.save(produto);
	}
	
	public void exclua(Long id) {
		this.repository.deleteById(id);
	}
}
