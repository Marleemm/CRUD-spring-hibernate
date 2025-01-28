package com.example.mascotas.dao;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.dao.Crud;
import com.example.entities.Mascota;
import com.example.service.MascotaService;

//PRUEBAS JUNIT SERVICES
@RunWith(SpringJUnit4ClassRunner.class)
//aplicationscontext tiene mis beans
@ContextConfiguration(locations = { "classpath:application-contex.xml" })

public class TestMascotaService {
	@Autowired
	@Qualifier("mascotaService")
	private MascotaService mascotaService;

	@Test
	@Ignore
	public void testCrearM() {
		assertNotNull(mascotaService);
		try {
			// crear mascota
			Mascota mascota = new Mascota();
			mascota.setNombre("Pink");
			mascota.setEdad(1);
			mascota.setTipo("gato");
			mascota.setDescripcion("Divertido y chistoso prueba");

			// usamos la inyeccion de dependencia
			mascotaService.guardar(mascota);
			// se asegura que lo que este adentro sea verdadero
			// hace referencia si la operacion es exitosa
			assertTrue(true);

		} catch (Exception e) {
			// testeo fallido
			fail(e.getMessage());
		}

	}

	@Test
	@Ignore
	public void testEliminar() {
		assertNotNull(mascotaService);
		try {
			int mascotaId = 27;
			Mascota mascota = mascotaService.buscarId(mascotaId);
			mascotaService.eliminar(mascota);
		} catch (Exception e) {
			// testeo fallido
			fail(e.getMessage());
		}
	}

	@Test
	@Ignore
	public void testActualizar() {
		assertNotNull(mascotaService);
		try {
			int idmascota = 24;
			Mascota mascota = mascotaService.buscarId(idmascota);
			mascota.setNombre("Terry");
			mascota.setEdad(12);
			mascotaService.actualizar(mascota);
		} catch (Exception e) {
			// testeo fallido
			fail(e.getMessage());
		}
	}

	@Test
	public void testMostrar() {
		assertNotNull(mascotaService);
		try {
			mascotaService.mostrarTodos();

		} catch (Exception e) {
			// testeo fallido
			fail(e.getMessage());
		}
	}

}
