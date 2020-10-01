package com.bolsadeideas.springboot.web.app.servicios;

import java.util.List;

import com.bolsadeideas.springboot.web.app.entidades.Proyecto;

public interface IProyectoService  {


	public List<Proyecto> findAll();
	
	public void save (Proyecto proyecto);
	
	public Proyecto findById (Long id);
	
	public void delete (Long id);

}
