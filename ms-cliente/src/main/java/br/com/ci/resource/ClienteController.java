/**
 * 
 */
package br.com.ci.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.ci.model.Cliente;
import br.com.ci.service.ClienteService;


@RestController
@RequestMapping("/v1/api/clientes")
public class ClienteController {

	@Autowired
	private ClienteService service;
	
	
	@GetMapping
	public ResponseEntity<List<Cliente>> lista(){
		return ResponseEntity.ok(this.service.lista());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> buscarPorID(@PathVariable Long id){
		return ResponseEntity.ok(this.service.findById(id));
	}
	
	@PostMapping
	public  ResponseEntity<Cliente> salve(@RequestBody Cliente cliente){
		return ResponseEntity.ok(this.service.salve(cliente));
	}
	
	@DeleteMapping
	public ResponseEntity<Void> excluaPorId(@RequestParam("id")Long id){
		this.service.exclua(id);
		return ResponseEntity.noContent().build();
	}

}
