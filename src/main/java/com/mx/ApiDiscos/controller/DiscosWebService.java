package com.mx.ApiDiscos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.ApiDiscos.model.Discos;
import com.mx.ApiDiscos.service.DiscosImplementacion;

//empezamos aqui
@RestController
@RequestMapping(path = "DiscosWebService") //en path se coloca el nombre de public class
@CrossOrigin
public class DiscosWebService {

	@Autowired
	DiscosImplementacion imp;
	
	//http://localhost:9000/DiscosWebService/listar
	@GetMapping(path = "listar")
	public List<Discos> listar() {
		// TODO Auto-generated constructor stub
		return imp.listar();
	}
	
	//http://localhost:9000/DiscosWebService/guardar
	@PostMapping(path = "guardar")
	public void guardar(@RequestBody Discos disco) {
		// TODO Auto-generated constructor stub
		imp.guardar(disco);
	}
	
	//http://localhost:9000/DiscosWebService/buscar
	@PostMapping(path = "buscar")
	public Discos disco(@RequestBody Discos disco) {
		// TODO Auto-generated constructor stub
		return imp.buscar(disco.getIdD());
	}
	
	//http://localhost:9000/DiscosWebService/editar
	@PostMapping(path = "editar")
	public void editar(@RequestBody Discos disco) {
		// TODO Auto-generated constructor stub
		imp.editar(disco);
	}
	
	//http://localhost:9000/DiscosWebService/eliminar
	@PostMapping(path = "eliminar")
	public void eliminar(@RequestBody Discos disco) {
		// TODO Auto-generated constructor stub
		imp.eliminar(disco.getIdD());
	}
	
}
