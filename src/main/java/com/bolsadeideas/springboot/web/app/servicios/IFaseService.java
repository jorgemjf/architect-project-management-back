package com.bolsadeideas.springboot.web.app.servicios;

import java.util.List;

import com.bolsadeideas.springboot.web.app.entidades.Fase;

public interface IFaseService {

	public List<Fase> findAll();
	
	public void save (Fase fase);
	
	public Fase findById (Long id);
	
	public void delete (Long id);
}
