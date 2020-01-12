package com.services;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;

import com.entities.Usuario;
import com.exception.ServiciosException;

/**
 * Session Bean implementation class UsuariosBean
 */
@EJB(name = "UsuariosBean", beanInterface = UsuariosBeanRemote.class)
@Stateless
public class UsuariosBean implements UsuariosBeanRemote {

	@PersistenceContext
	private static EntityManager em;

	/**
	 * Default constructor.
	 */
	public UsuariosBean() {

	}

	public void crear(Usuario usuario) throws ServiciosException {
		try {
			em.persist(usuario);
			em.flush();
		} catch (PersistenceException e) {
			throw new ServiciosException("No se pudo crear el usuario");
		}
	}

	@Override
	public void actualizar(Usuario usuario) throws ServiciosException {
		try {
			em.merge(usuario);
			em.flush();
		} catch (PersistenceException e) {
			throw new ServiciosException("No se pudo actualizar el usuario");
		}
	}
	
	@Override
	public void borrar(Long id) throws ServiciosException {
		try {
			Usuario usuario = em.find(Usuario.class, id);
			em.remove(usuario);
			em.flush();
		} catch (PersistenceException e) {
			throw new ServiciosException("No se pudo borrar el usuario");
		}
	}
	
	@Override
	public Usuario buscar(Long id) throws ServiciosException {
		try {
			Usuario usuario = em.find(Usuario.class, id);
			return usuario;
		} catch (PersistenceException e) {
			throw new ServiciosException("No se pudo encontrar el usuario");
		}
	}

	@Override
	public List<Usuario> obtenerTodos() {
		TypedQuery<Usuario> query = em.createQuery("SELECT d FROM Usuario d", Usuario.class);
		return query.getResultList();
	}

	@Override
	public void borrar(Usuario usuario) throws ServiciosException {

	}

	@Override
	public List<Usuario> obtenerTodos(String filtro) {
		return null;
	}

}
