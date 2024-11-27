package com.mx.ApiDiscos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.ApiDiscos.dao.DiscosDao;
import com.mx.ApiDiscos.model.Discos;

@Service  //Agregamos un estereotipo donde indicaremos que vamos a realizar un servicio

//despues agregamos implementaciones en public class
public class DiscosImplementacion implements DiscosServ{

	@Autowired
	DiscosDao discosDao;
	
	@Transactional(readOnly = true) //no realiza cambios a la base de datos
	
	@Override
	public List<Discos> listar() {
		// TODO Auto-generated method stub
		return discosDao.findAll();
	}

	@Override
	public void guardar(Discos disco) {
		// TODO Auto-generated method stub
		discosDao.save(disco);
	}

	@Transactional(readOnly = true)
	@Override
	public Discos buscar(Integer id) {
		// TODO Auto-generated method stub
		return discosDao.findById(id).orElse(null);
	}

	@Transactional
	@Override
	public void editar(Discos disco) {
		// TODO Auto-generated method stub
		discosDao.save(disco);
	}

	@Transactional
	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		discosDao.deleteById(id);
	}

}
