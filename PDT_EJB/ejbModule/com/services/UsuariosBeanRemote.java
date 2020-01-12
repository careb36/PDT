package com.services;
import java.util.List;
import javax.ejb.Remote;
import com.entities.Usuario;
import com.exception.ServiciosException;

@Remote
public interface UsuariosBeanRemote {
	void crear(Usuario usuario) throws ServiciosException;
	void borrar(Usuario usuario) throws ServiciosException;
	void actualizar(Usuario usuario) throws ServiciosException;
	void borrar(Long id) throws ServiciosException;
	List<Usuario> obtenerTodos();
	List<Usuario> obtenerTodos(String filtro);
	Usuario buscar(Long id) throws ServiciosException;
}
