package com.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-11-01T20:24:26.999-0300")
@StaticMetamodel(Fenomeno.class)
public class Fenomeno_ {
	public static volatile SingularAttribute<Fenomeno, Long> Id_fenomeno;
	public static volatile SingularAttribute<Fenomeno, Integer> codigo;
	public static volatile SingularAttribute<Fenomeno, String> nombre;
	public static volatile SingularAttribute<Fenomeno, String> descripcion;
	public static volatile SingularAttribute<Fenomeno, String> tel_emergencia;
	public static volatile SingularAttribute<Fenomeno, String> criticidad;
}
