package com.entities;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-11-02T17:40:54.830-0300")
@StaticMetamodel(Localidad.class)
public class Localidad_ {
	public static volatile SingularAttribute<Localidad, Long> Id_localidad;
	public static volatile SingularAttribute<Localidad, Integer> codigo;
	public static volatile SingularAttribute<Localidad, String> nombre;
	public static volatile SingularAttribute<Localidad, BigDecimal> latitud;
	public static volatile SingularAttribute<Localidad, BigDecimal> longitud;
	public static volatile SingularAttribute<Localidad, Departamento> departamento;
}
