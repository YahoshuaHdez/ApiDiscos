package com.mx.ApiDiscos.service;

import java.util.List;

import com.mx.ApiDiscos.model.Discos;

public interface DiscosServ {

	public List<Discos> listar();
	
	public void guardar(Discos disco);
	
	public Discos buscar(Integer id);
	
	public void editar(Discos disco);
	
	public void eliminar(Integer id);
	
}
