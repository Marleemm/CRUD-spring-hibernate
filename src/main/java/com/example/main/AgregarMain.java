package com.example.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.entities.Mascota;
import com.example.service.MascotaService;

public class AgregarMain {
public static void main(String[] args) {
	// Cargar el contexto desde application-context.xml
	//la ruta donde va a buscar
    ApplicationContext context = new ClassPathXmlApplicationContext("application-contex.xml");

    // Obtener el bean del servicio de mascotas
    MascotaService mascotaService = context.getBean(MascotaService.class);
    

    // Crear una nueva mascota
    Mascota nuevaMascota = new Mascota();
    nuevaMascota.setNombre("manchas");
    nuevaMascota.setDescripcion("cuello blanco");
    nuevaMascota.setEdad(7);
    nuevaMascota.setTipo("perro");

    // Guardar la mascota usando el servicio
    try {
        mascotaService.guardar(nuevaMascota);
        System.out.println("Mascota guardada correctamente.");
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}
