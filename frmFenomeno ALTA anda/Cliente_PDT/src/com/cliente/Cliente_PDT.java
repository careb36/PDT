package com.cliente;

import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.entities.Fenomeno;
//import com.entities.Fenomeno;
//import com.entities.Usuario;
import com.exception.ServiciosException;
import com.services.FenomenosBeanRemote;

public class Cliente_PDT {

	public static void main(String[] args) throws NamingException {

		/*
		 * UsuariosBeanRemote usuariosBean = (UsuariosBeanRemote) InitialContext
		 * .doLookup("PDT/UsuariosBean!com.services.UsuariosBeanRemote");
		 * 
		 * AltaUsuario(usuariosBean); BorrarUsuario(usuariosBean);
		 * ActualizarUsuario(usuariosBean); ListarUsuario(usuariosBean);
		 */

		FenomenosBeanRemote fenomenosBean = (FenomenosBeanRemote) InitialContext
				.doLookup("PDT/FenomenosBean!com.services.FenomenosBeanRemote");

		AltaFenomeno(fenomenosBean);
		BorrarFenomeno(fenomenosBean);
		ActualizarFenomeno(fenomenosBean);
		ListarFenomeno(fenomenosBean);

	}

	//********** INICIO DE FENOMENO ***********

	public static void AltaFenomeno(FenomenosBeanRemote fenomenosBean) {

		Fenomeno fenomeno = new Fenomeno();
		fenomeno.setCodigo(12345);
		fenomeno.setCriticidad("Crítico");
		fenomeno.setDescripcion("Tornado que viene del suroeste a 130 km/h");
		fenomeno.setNombre("Tornado");
		fenomeno.setTel_emergencia("45227000");

		Fenomeno fenomeno1 = new Fenomeno();
		fenomeno1.setCodigo(23456);
		fenomeno1.setCriticidad("Moderada");
		fenomeno1.setDescripcion("Huracán que viene del sureste a 150 km/h");
		fenomeno1.setNombre("Huracán");
		fenomeno1.setTel_emergencia("45227000");

		Fenomeno fenomeno2 = new Fenomeno();
		fenomeno2.setCodigo(34567);
		fenomeno2.setCriticidad("Moderada");
		fenomeno2.setDescripcion("Tifón que viene del norte a 120 km/h");
		fenomeno2.setNombre("Tifón");
		fenomeno2.setTel_emergencia("45227000");

		Fenomeno fenomeno3 = new Fenomeno();
		fenomeno3.setCodigo(45678);
		fenomeno3.setCriticidad("Leve");
		fenomeno3.setDescripcion("Tsunami que viene del este a 40 km/h");
		fenomeno3.setNombre("Tsunami");
		fenomeno3.setTel_emergencia("45227000");

		//CREAR FENOMENOS
		try {
			fenomenosBean.crear(fenomeno);
			fenomenosBean.crear(fenomeno1);
			fenomenosBean.crear(fenomeno2);
			fenomenosBean.crear(fenomeno3);

			System.out.println("Se creó exitosamente el fenómeno");
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}

	}

	// ELIMINAR FENOMENOS
	public static void BorrarFenomeno(FenomenosBeanRemote fenomenosBean) {
		try {
			fenomenosBean.borrar(1L);
			System.out.println("Se borró exitosamente el fenomeno");
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
	}

	//ACTUALIZACION DE FENOMENO
	public static void ActualizarFenomeno(FenomenosBeanRemote fenomenosBean) {
		Fenomeno fenomeno1 = new Fenomeno();
		fenomeno1 = BuscarFenomeno(fenomenosBean, 2L);
		fenomeno1.setCriticidad("Suave");
		try {
			fenomenosBean.actualizar(fenomeno1);
			System.out.println("Se actualizó exitosamente el fenómeno");
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
	}

	// BUSCAR FENOMENO
	public static Fenomeno BuscarFenomeno(FenomenosBeanRemote fenomenosBean, Long id) {
		Fenomeno fenomeno1 = new Fenomeno();
		try {
			fenomeno1 = fenomenosBean.buscar(id);
		} catch (ServiciosException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return fenomeno1;

	}

	// LISTAR FENOMENO
	public static void ListarFenomeno(FenomenosBeanRemote fenomenosBean) {
		List<Fenomeno> fenomenos = new ArrayList<Fenomeno>();
		fenomenos = fenomenosBean.obtenerTodos();
		if (fenomenos.size() > 0) {
			System.out.println("Lista de fenómenos");
			for (Fenomeno fen : fenomenos) {
				System.out.println(fen.getNombre() + " " + fen.getCriticidad());
			}
		} else {
			System.out.println("No se encontró ningún fenómeno");
		}
	}


	

	
	

	

	//********** FIN DE USUARIO ***********

}
