package com.example.mascotas;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.entities.Mascota;

public class app {
	public static void main(String[] args) {
	 SessionFactory factory = new Configuration()
			 .configure("hibernate.cfg.xml")
			 .addAnnotatedClass(Mascota.class)
			 .buildSessionFactory();
	
	//ABRIR SESION		 
	Session sesion = factory.openSession();
	 
	 try {
		 //INICIAR SESION
		 Mascota mascota = new Mascota("keysi", 8, "bonita", "perro");
		 //empieza la transaccion
		
		 sesion.beginTransaction();
		 
		 //proceso transaccion
		 sesion.persist(mascota);
		 
		 //finalizar transaccion
		 sesion.getTransaction().commit();
		 
		 
		 
	 }finally {
		 sesion.close();
		 factory.close();
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	}

}
