package com.cliente;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.entities.Usuario;
import com.exception.ServiciosException;
import com.servicios.UsuarioBeanRemote;

public class ClienteAppMedioAmbiente {

	public static void main(String[] args) throws NamingException, ServiciosException {

		UsuarioBeanRemote usuarioBean = (UsuarioBeanRemote) InitialContext
				.doLookup("ProyectoDesarrolloTesting/UsuarioBean!com.servicios.UsuarioBeanRemote");
				
		try {

			Usuario U1 = new Usuario();
			U1.setApellido("Pereira");
			U1.setCorreo("carolina.pereira@estudiantes.utec.edu.uy");
			U1.setId_usuario(1);
			U1.setUsuarios("careb1983");
			U1.setNombre("Carolina");
			U1.setDireccion("Magallanes 1607");
			U1.setPass("pass");
			U1.setDocumento("46174552");
			U1.setTipo_doc("CI");
			U1.setTipo_usuario("Administrador");
			usuarioBean.crear(U1);

		}

		catch (ServiciosException e) { 
			System.out.println(e.getMessage());
		} 
	}
}