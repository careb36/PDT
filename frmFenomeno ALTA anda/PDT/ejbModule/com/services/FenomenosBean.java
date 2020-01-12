package com.services;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;
import com.entities.Fenomeno;
import com.exception.ServiciosException;

/**
 * Session Bean implementation class fenomenosBean
 */
@EJB(name = "FenomenosBean", beanInterface = FenomenosBeanRemote.class)
@Stateless
public class FenomenosBean implements FenomenosBeanRemote {

	@PersistenceContext
	private EntityManager em;

	/**
	 * Default constructor.
	 */
	public FenomenosBean() {

	}

	@Override
	public void crear(Fenomeno fenomeno) throws ServiciosException {
		try {
			em.persist(fenomeno);
			em.flush();
		} catch (PersistenceException e) {
			throw new ServiciosException("No se pudo crear el fenomeno");
		}
	}

	@Override
	public void actualizar(Fenomeno fenomeno) throws ServiciosException {
		try {
			em.merge(fenomeno);
			em.flush();
		} catch (PersistenceException e) {
			throw new ServiciosException("No se pudo actualizar el fenomeno");
		}
	}

	@Override
	public void borrar(Long id) throws ServiciosException {
		try {
			Fenomeno fenomeno = em.find(Fenomeno.class, id);
			em.remove(fenomeno);
			em.flush();
		} catch (PersistenceException e) {
			throw new ServiciosException("No se pudo borrar el fenomeno");
		}
	}



	@Override
	public Fenomeno buscar(Long id) throws ServiciosException {
		try {
			Fenomeno fenomeno = em.find(Fenomeno.class, id);
			return fenomeno;
		} catch (PersistenceException e) {
			throw new ServiciosException("No se pudo encontrar el fenomeno");
		}
	}


	@Override
	public List<Fenomeno> obtenerTodos() {
		TypedQuery<Fenomeno> query = em.createQuery("SELECT f FROM Fenomeno f", Fenomeno.class);
		return query.getResultList();
	}
	

	@Override
	public void borrar(Fenomeno fenomeno) throws ServiciosException {

	}

	@Override
	public List<Fenomeno> obtenerTodos(String filtro) {
		return null;
	}
}
