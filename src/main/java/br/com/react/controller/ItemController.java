package br.com.react.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.react.model.Item;
import br.com.react.repository.ItemRepository;

@Controller
public class ItemController {
	@Autowired
	private ItemRepository itemRepository;

	@ResponseBody
	@GetMapping(value = "/lista")
	public ResponseEntity<List<Item>> lista() {

		List<Item> listaItem = itemRepository.findAll();

		return new ResponseEntity<List<Item>>(listaItem, HttpStatus.OK);
	}
	
	
	
	
	@ResponseBody
	@PostMapping(value = "/lista")
	public ResponseEntity<Item> salvar(@RequestBody Item item) {
		
		Item salva = itemRepository.save(item);

		
		return new ResponseEntity<Item>(salva,HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	@ResponseBody
	@GetMapping(value = "/lista/{id}")
	public ResponseEntity<List<Item>> listaporid(@PathVariable("id")Long id) {

		List<Item> listaItem = itemRepository.findByid(id);

		return new ResponseEntity<List<Item>>(listaItem,HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
	
	@ResponseBody
	@DeleteMapping(value = "/lista/{id}")
	public ResponseEntity<String> delete(@PathVariable("id")Long id) {

		
		       itemRepository.deleteById(id);
		        return new ResponseEntity<String>("Item deletado!!!", HttpStatus.CREATED);
		    }
		
	}


