package com.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: IMAGENES
 * 
 * @author Winux
 */

@Entity

@Table(name = "Imagenes", schema="PROYECTO")
public class Imagen implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false)
	private long Id_imagen;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "Id_observacion")
	private Observacion observacion;

	@Column(length = 100, nullable = false)
	private String path;

	public Imagen() {
		super();
	}

	/**
	 * GETs and SETs
	 */

	public long getId_imagen() {
		return Id_imagen;
	}

	public void setId_imagen(long id_imagen) {
		Id_imagen = id_imagen;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	private static final long serialVersionUID = 1L;

}
