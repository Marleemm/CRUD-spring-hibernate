package com.example.controllers;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Mascota;
import com.example.service.MascotaService;
@RestController
@RequestMapping("/api")
public class Rest {
	private MascotaService mascotaS;

	public void setMascotaS(MascotaService mascotaS) {
		this.mascotaS = mascotaS;
	}
	
	@GetMapping("/mostrar")

	public List<Mascota> mostrar() {
		
		return mascotaS.mostrarTodos();

	}
	
	@DeleteMapping("/borrar/{id}")
	public String borrar(@PathVariable("id") int id) {

		Mascota mascota = mascotaS.buscarId(id);
		mascotaS.eliminar(mascota);
		return "eliminado";

	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Mascota mascota) {
		
	mascotaS.actualizar(mascota);

	}
	
	@PostMapping("/crear")
	public String guardarMascota(@RequestBody Mascota mascota) {
		mascotaS.guardar(mascota);

		return "guardado";

	}
	
	
	
}
