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

import br.com.ci.model.Produto;
import br.com.ci.service.ProdutoService;


@RestController
@RequestMapping("/v1/api/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoService service;
	
	
	@GetMapping
	public ResponseEntity<List<Produto>> lista(){
		return ResponseEntity.ok(this.service.lista());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Produto> buscarPorID(@PathVariable Long id){
		return ResponseEntity.ok(this.service.findById(id));
	}
	
	@PostMapping
	public  ResponseEntity<Produto> salve(@RequestBody Produto produto){
		return ResponseEntity.ok(this.service.salve(produto));
	}
	
	@DeleteMapping
	public ResponseEntity<Void> excluaPorId(@RequestParam("id")Long id){
		this.service.exclua(id);
		return ResponseEntity.noContent().build();
	}

}
