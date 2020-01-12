package com.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-11-01T20:24:26.994-0300")
@StaticMetamodel(Departamento.class)
public class Departamento_ {
	public static volatile SingularAttribute<Departamento, Long> Id_Departamento;
	public static volatile SingularAttribute<Departamento, Integer> codigo;
	public static volatile SingularAttribute<Departamento, String> nombre;
	public static volatile SingularAttribute<Departamento, Zona> zona;
}
