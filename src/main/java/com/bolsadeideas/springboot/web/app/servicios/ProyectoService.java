package com.bolsadeideas.springboot.web.app.servicios;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.web.app.dao.IproyectoDAO;
import com.bolsadeideas.springboot.web.app.entidades.Proyecto;


@Service
public class ProyectoService implements IProyectoService{
	
	@Autowired
	private IproyectoDAO proyectoDao;
	
	@Override
	public List<Proyecto> findAll() {
		
		return (List<Proyecto>) proyectoDao.findAll();
	}

	@Override
	@Transactional
	public void save(Proyecto proyecto) {
		// TODO Auto-generated method stub
		proyectoDao.save(proyecto);
	}

	@Override
	public Proyecto findById(Long id) {
		// TODO Auto-generated method stub
		return proyectoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		proyectoDao.deleteById(id);
		
	}
	
		
	
	
	

}
