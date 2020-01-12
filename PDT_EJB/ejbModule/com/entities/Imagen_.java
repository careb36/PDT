package com.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-11-01T20:24:27.009-0300")
@StaticMetamodel(Imagen.class)
public class Imagen_ {
	public static volatile SingularAttribute<Imagen, Long> Id_imagen;
	public static volatile SingularAttribute<Imagen, Observacion> observacion;
	public static volatile SingularAttribute<Imagen, String> path;
}
