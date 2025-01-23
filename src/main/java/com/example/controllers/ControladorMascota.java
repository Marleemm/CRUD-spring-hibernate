package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.entities.Mascota;
import com.example.service.MascotaService;

@Controller

public class ControladorMascota {
	private MascotaService mascotaS;

	public void setMascotaS(MascotaService mascotaS) {
		this.mascotaS = mascotaS;
	}

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	// ruta
	@RequestMapping("/registro")
	public String registro() {

		return "registro";

	}

	@RequestMapping("/guardarmascota")
	// ModelAttribute para manejar los datos entre la vista y el controlador y este
	// recibe
	// Model proporciona
	public String guardarMascota(@ModelAttribute Mascota mascota) {
		mascotaS.guardar(mascota);

		return "redirect:/mostrar";

	}

	@GetMapping("/borrar/{id}")
	public String borrar(@PathVariable("id") int id) {

		Mascota mascota = mascotaS.buscarId(id);
		mascotaS.eliminar(mascota);
		return "redirect:/mostrar";

	}

	// ruta
	@RequestMapping("/editar/{id}")
	public String editar(@PathVariable("id") int id,Model model) {

		Mascota mascota = mascotaS.buscarId(id);
		
		model.addAttribute("mascota", mascota);

		return "editar";

	}
	@RequestMapping("/actualizar")
	public String actualizar(@ModelAttribute Mascota mascota) {
		mascotaS.actualizar(mascota);

		return "redirect:/mostrar";

	}

	// ruta
	@RequestMapping("/buscar")
	public String buscar() {
		return "buscar";

	}

	// ruta
	@RequestMapping("/mostrar")

	public String mostrar(Model modelo) {
		modelo.addAttribute("mascotass", mascotaS.mostrarTodos());
		return "mostrar";

	}

}
