package com.bolsadeideas.springboot.web.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.springboot.web.app.entidades.Fase;
import com.bolsadeideas.springboot.web.app.servicios.IFaseService;


@CrossOrigin
@RestController
@RequestMapping("/api")

public class FaseRestController {

	
	@Autowired
	private IFaseService faseService;
	
	
	@GetMapping("/fases")
	public List<Fase> index(){
		return faseService.findAll();
	}
	
	
	@GetMapping("/fases/{id}")
	public Fase index(@PathVariable Long id){
		return faseService.findById(id);
	}
	
	
	
	
	@PostMapping("/fases")
	@ResponseStatus(HttpStatus.CREATED)
	public Fase create(@RequestBody Fase fase) {
		faseService.save(fase);
		return fase;
	}
	

	@DeleteMapping("/fases/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		Fase faseActual = faseService.findById(id);
		faseService.delete(faseActual.getId());
	}
	
	
	@PutMapping("/fases/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Fase update(@RequestBody Fase fase, @PathVariable Long id) {
		
		Fase faseActual = faseService.findById(id);
		faseActual.setNombre(fase.getNombre());
		faseService.save(faseActual);
		return faseActual;
		
		
	}
	
	
}
