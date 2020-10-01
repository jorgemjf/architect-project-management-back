package com.bolsadeideas.springboot.web.app.servicios;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.web.app.dao.IfaseDAO;
import com.bolsadeideas.springboot.web.app.entidades.Fase;

@Service
public class FaseService implements IFaseService{

	@Autowired
	private IfaseDAO faseDao;
	
	@Override
	public List<Fase> findAll() {
		
		return (List<Fase>) faseDao.findAll();
	}

	@Override
	@Transactional
	public void save(Fase fase) {
		// TODO Auto-generated method stub
		faseDao.save(fase);
	}

	@Override
	public Fase findById(Long id) {
		// TODO Auto-generated method stub
		return faseDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		faseDao.deleteById(id);
		
	}
}
