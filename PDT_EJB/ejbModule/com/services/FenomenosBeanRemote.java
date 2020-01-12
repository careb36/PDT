package com.services;
import java.util.List;
import javax.ejb.Remote;
import com.entities.Fenomeno;
import com.exception.ServiciosException;

@Remote
public interface FenomenosBeanRemote {
	void crear(Fenomeno fenomeno) throws ServiciosException;
	void borrar(Fenomeno fenomeno) throws ServiciosException;
	void actualizar(Fenomeno fenomeno) throws ServiciosException;
	void borrar(Long id) throws ServiciosException;
	List<Fenomeno> obtenerTodos();
	List<Fenomeno> obtenerTodos(String filtro);
	Fenomeno buscar(Long id) throws ServiciosException;

}
