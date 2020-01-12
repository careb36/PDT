package com.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-11-13T11:55:47.912-0300")
@StaticMetamodel(Caracteristica.class)
public class Caracteristica_ {
	public static volatile SingularAttribute<Caracteristica, Fenomeno> fenomeno;
	public static volatile SingularAttribute<Caracteristica, Long> Id_caracteristica;
	public static volatile SingularAttribute<Caracteristica, String> tipo_dato;
	public static volatile SingularAttribute<Caracteristica, String> nombre;
	public static volatile SingularAttribute<Caracteristica, String> etiqueta_presentacion;
}
