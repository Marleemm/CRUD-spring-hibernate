package com.example.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.entities.Mascota;
import com.example.service.MascotaService;

public class ActualizarMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-contex.xml");

        MascotaService mascotaService = context.getBean(MascotaService.class);

       int mascotaId = 1;

       Mascota mascota = mascotaService.buscarId(mascotaId);

        if (mascota != null) {
            mascota.setNombre("Cuca");
           mascota.setDescripcion("ratonera pinta actualizada2");
           mascota.setEdad(10);

            try {
               mascotaService.actualizar(mascota);
               System.out.println("Mascota actualizada correctamente2.");
           } catch (Exception e) {
               e.printStackTrace();
           }
       } else {
           System.out.println("La mascota con ID " + mascotaId + " no existe.");
       }
	}

}
