package com.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-11-02T17:40:54.839-0300")
@StaticMetamodel(Observacion.class)
public class Observacion_ {
	public static volatile SingularAttribute<Observacion, Long> Id_observacion;
	public static volatile SingularAttribute<Observacion, String> observacion;
	public static volatile SingularAttribute<Observacion, String> descripcion;
	public static volatile SingularAttribute<Observacion, BigDecimal> latitud;
	public static volatile SingularAttribute<Observacion, BigDecimal> longitud;
	public static volatile SingularAttribute<Observacion, Date> fecha_hora_registro;
	public static volatile SingularAttribute<Observacion, String> comentarios_rev;
	public static volatile SingularAttribute<Observacion, String> fiabilidad_rev;
	public static volatile SingularAttribute<Observacion, Date> fecha_hora_rev;
	public static volatile SingularAttribute<Observacion, Usuario> usuario;
	public static volatile SingularAttribute<Observacion, Localidad> localidad;
	public static volatile SingularAttribute<Observacion, Fenomeno> fenomeno;
}
