package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.dao.Crud;
import com.example.dao.ImplementacionMasotadao;
import com.example.entities.Mascota;

@Service
// indica que es un componente de servicio en Spring. 

public class MascotaService {
	
	
private  ImplementacionMasotadao mascotaDaoI;

	
    public void setMascotaDaoI(ImplementacionMasotadao mascotaDaoI) {
		this.mascotaDaoI = mascotaDaoI;
	}

	public void guardar(Mascota mascota) {
    	mascotaDaoI.guardar(mascota);  
    }

    public Mascota buscarId(int id) {
        return mascotaDaoI.buscarId(id);  
    }

    public List<Mascota> mostrarTodos() {
        return mascotaDaoI.mostrarTodos();  
    }

    public void actualizar(Mascota mascota) {
    	mascotaDaoI.actualizar(mascota);  
    }

    public void eliminar(Mascota mascota) {
    	mascotaDaoI.borrar(mascota);  
    }
}
