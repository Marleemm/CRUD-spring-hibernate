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

//PRUEBAS CON JUNIT

@RunWith(SpringJUnit4ClassRunner.class)
//aplicationscontext tiene mis beans
@ContextConfiguration(locations = { "classpath:application-contex.xml" })

public class TestMascotaDao {
	@Autowired
	@Qualifier("mascotaDaoImp")
	// testeo de dao
	private Crud<Mascota> mascotaDaoI;

	@Test
	@Ignore
	public void testCrearMascota() {
		// verificar que mi dependencia no sea nulo, recibe un objeto en este
		// caso mi clase
		assertNotNull(mascotaDaoI);
		// exepcion
		try {
			// crear mascota
			Mascota mascota = new Mascota();
			mascota.setNombre("Queso");
			mascota.setEdad(9);
			mascota.setTipo("perro");
			mascota.setDescripcion("Divertido y chistoso prueba");

			// usamos la inyeccion de dependencia
			mascotaDaoI.guardar(mascota);
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
	public void testBorrar() {
		// mi inyeccion de dependencia me proporciona mis metodos
		assertNotNull(mascotaDaoI);

		try {
			int mascotaId = 28;
			// mascotaDaoI.buscarId(mascotaId);
			Mascota mascota = mascotaDaoI.buscarId(mascotaId);
			mascotaDaoI.borrar(mascota);

		} catch (Exception e) {
			// testeo fallido
			fail(e.getMessage());
		}

	}

	@Test
	@Ignore
	public void actualizar() {

		assertNotNull(mascotaDaoI);
		try {
			int mascotaId = 25;
			Mascota mascota = mascotaDaoI.buscarId(mascotaId);
			mascota.setNombre("loky");
			mascota.setEdad(2);
			mascota.setDescripcion("Prueba cambio");
			mascota.setTipo("gato");
			mascotaDaoI.actualizar(mascota);

		} catch (Exception e) {
			// testeo fallido
			fail(e.getMessage());
		}

	}

	@Test
	public void mostrar() {
	    assertNotNull(mascotaDaoI);  
	    try {
	        
			mascotaDaoI.mostrarTodos();

	        
	    } catch (Exception e) {
	      
	        fail(e.getMessage());
	     
	}
		

	
}
	}

