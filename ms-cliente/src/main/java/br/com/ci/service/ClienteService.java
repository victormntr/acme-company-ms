
package br.com.ci.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ci.model.Cliente;
import br.com.ci.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;
	
	public List<Cliente> lista(){
		return this.repository.findAll();
	}
	
	public Cliente findById(Long id) {
		return this.repository.findById(id).get();
	}
	
	public Cliente salve(Cliente cliente) {
		return this.repository.save(cliente);
	}
	
	public void exclua(Long id) {
		this.repository.deleteById(id);
	}
}
