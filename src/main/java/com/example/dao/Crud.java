package com.example.dao;

import java.util.List;

//INTERFAZ GENERICA
public interface Crud<G>{
	void guardar(G g);
	
	G buscarId(int id); 
	
	List<G> mostrarTodos();
	

	void actualizar(G g);
	
	void borrar(G g);
	
	
			
}

