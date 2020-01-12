package com.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-11-02T17:40:54.783-0300")
@StaticMetamodel(Detalle.class)
public class Detalle_ {
	public static volatile SingularAttribute<Detalle, Long> Id_detalle;
	public static volatile SingularAttribute<Detalle, Integer> valor_numerico;
	public static volatile SingularAttribute<Detalle, Date> valor_fecha_hora;
	public static volatile SingularAttribute<Detalle, String> valor_texto;
	public static volatile SingularAttribute<Detalle, Observacion> observacion;
	public static volatile SingularAttribute<Detalle, Caracteristica> caracteristica;
}
