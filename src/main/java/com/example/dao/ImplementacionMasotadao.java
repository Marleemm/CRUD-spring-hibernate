package com.example.dao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.example.entities.Mascota;

@Repository
//indica que es un componente de acceso a datos en Spring, específicamente un DAO
public class ImplementacionMasotadao implements Crud<Mascota>{
	//INYECCION DE DEPENDENCIA A TRAVEZ DE SETTERS POR MEDIO DEL BEAN DE APPLICATION-CONTEX.XML
	private SessionFactory factory;

	public void setSessionFactory(SessionFactory sf) {
		this.factory = sf;
	}

	@Override
	public void guardar(Mascota g) {
		Session myseSession = factory.openSession();
		myseSession.beginTransaction();
		myseSession.persist(g);

		myseSession.getTransaction().commit();
	}

	@Override
	public Mascota buscarId(int id) {
		Session myseSession = factory.openSession();
		myseSession.beginTransaction();
		Mascota m = myseSession.get(Mascota.class, id);
		myseSession.getTransaction().commit();
		return m;
	}

	@Override
	public List<Mascota> mostrarTodos() {
		Session myseSession = factory.openSession();
		myseSession.beginTransaction();
		List<Mascota> mascotas = myseSession.createQuery("From Mascota", Mascota.class).getResultList();

		myseSession.getTransaction().commit();

		return mascotas;
	}

	@Override
	public void actualizar(Mascota g) {
		Session myseSession = factory.openSession();
		myseSession.beginTransaction();
		myseSession.merge(g);

		myseSession.getTransaction().commit();
		
	}

	@Override
	public void borrar(Mascota g) {
		Session myseSession = factory.openSession();
		myseSession.beginTransaction();
		myseSession.remove(g);

		myseSession.getTransaction().commit();

		
	}

	



	
}
