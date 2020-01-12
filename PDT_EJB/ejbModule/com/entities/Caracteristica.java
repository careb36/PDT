package com.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: CARACTERISTICAS
 * 
 * @author Winux
 */
@Entity

@Table(name = "Caracteristicas", schema="PROYECTO")

public class Caracteristica implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "Id_fenomeno")
	private Fenomeno fenomeno;

	@Column(nullable = false)
	private long Id_caracteristica;

	@Column(length = 50, nullable = false)
	private String tipo_dato;

	@Column(length = 50, nullable = false)
	private String nombre;

	@Column(length = 50)
	private String etiqueta_presentacion;

	public Caracteristica() {
		super();
	}

	/**
	 * GETs and SETs
	 */

	public long getId_caracteristica() {
		return Id_caracteristica;
	}

	public void setId_caracteristica(long id_caracteristica) {
		Id_caracteristica = id_caracteristica;
	}

	public String getTipo_dato() {
		return tipo_dato;
	}

	public void setTipo_dato(String tipo_dato) {
		this.tipo_dato = tipo_dato;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEtiqueta_presentacion() {
		return etiqueta_presentacion;
	}

	public void setEtiqueta_presentacion(String etiqueta_presentacion) {
		this.etiqueta_presentacion = etiqueta_presentacion;
	}

	private static final long serialVersionUID = 1L;

}
