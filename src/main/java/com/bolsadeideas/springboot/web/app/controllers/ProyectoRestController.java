package com.bolsadeideas.springboot.web.app.controllers;

import java.util.Date;
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

import com.bolsadeideas.springboot.web.app.entidades.Proyecto;
import com.bolsadeideas.springboot.web.app.servicios.IProyectoService;


@CrossOrigin
@RestController
@RequestMapping("/api")

public class ProyectoRestController {
	
	@Autowired
	private IProyectoService proyectoService;
	
	
	@GetMapping("/proyectos")
	public List<Proyecto> index(){
		return proyectoService.findAll();
	}
	
	
	@GetMapping("/proyectos/{id}")
	public Proyecto index(@PathVariable Long id){
		return proyectoService.findById(id);
	}
	
	
	
	
	@PostMapping("/proyectos")
	@ResponseStatus(HttpStatus.CREATED)
	public Proyecto create(@RequestBody Proyecto proyecto) {
		proyecto.setCreateAt(new Date());
		proyectoService.save(proyecto);
		return proyecto;
	}
	

	@DeleteMapping("/proyectos/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		Proyecto clienteActual = proyectoService.findById(id);
		proyectoService.delete(clienteActual.getId());
	}
	
	
	@PutMapping("/proyectos/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Proyecto update(@RequestBody Proyecto proyecto, @PathVariable Long id) {
		
		Proyecto proyectoActual = proyectoService.findById(id);
		proyectoActual.setReferencia(proyecto.getReferencia());
		proyectoActual.setTitulo(proyecto.getTitulo());
		proyectoActual.setTipo(proyecto.getTipo());
		proyectoActual.setZonificacion(proyecto.getZonificacion());
		proyectoActual.setCatastro(proyecto.getCatastro());
		proyectoActual.setCliente(proyecto.getCliente());
		proyectoActual.setUbicacion(proyecto.getUbicacion());
		proyectoActual.setComercial(proyecto.getComercial());
		proyectoActual.setFases(proyecto.getFases());
		proyectoActual.setPresupuesto(proyecto.getPresupuesto());
		proyectoActual.setActivo(proyecto.isActivo());
		proyectoService.save(proyectoActual);
		return proyectoActual;
		
		
	}
	
}
