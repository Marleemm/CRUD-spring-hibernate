package com.example.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.entities.Mascota;
import com.example.service.MascotaService;

public class BuscarMain {

	public static void main(String[] args) {
ApplicationContext context = new ClassPathXmlApplicationContext("application-contex.xml");
	    
	    MascotaService m=context.getBean(MascotaService.class);
	    
	  Mascota mas=m.buscarId(4);
	  System.out.println(mas);
	}
}
