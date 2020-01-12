package com.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-11-01T22:25:14.290-0300")
@StaticMetamodel(Usuario.class)
public class Usuario_ {
	public static volatile SingularAttribute<Usuario, Long> Id_usuario;
	public static volatile SingularAttribute<Usuario, String> nombre;
	public static volatile SingularAttribute<Usuario, String> apellido;
	public static volatile SingularAttribute<Usuario, String> correo;
	public static volatile SingularAttribute<Usuario, String> direccion;
	public static volatile SingularAttribute<Usuario, String> pass;
	public static volatile SingularAttribute<Usuario, String> documento;
	public static volatile SingularAttribute<Usuario, String> tipo_doc;
	public static volatile SingularAttribute<Usuario, String> estado;
	public static volatile SingularAttribute<Usuario, String> tipo_usuario;
	public static volatile SingularAttribute<Usuario, String> usuarios;
}
