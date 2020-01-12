package com.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: FENOMENOS
 * @author Winux
 */
@Entity

@Table(name = "Fenomenos", uniqueConstraints={@UniqueConstraint(name = "UK_Fenomenos", columnNames = {"codigo"})})
public class Fenomeno implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false)
	private long Id_fenomeno;
	
	@Column(nullable = false)
	private int codigo;
	
	@Column(length = 60, nullable = false)
	private String nombre;
	
	@Column(length = 500, nullable = false)
	private String descripcion;
	
	@Column(length = 30, nullable = false)
	private String tel_emergencia;
	
	@Column(length = 30)
	private String criticidad;

	public Fenomeno() {
		super();
	}
	
	/**
     * GETs and SETs
     */
	
	public long getId_fenomeno() {
		return Id_fenomeno;
	}

	public void setId_fenomeno(long id_fenomeno) {
		Id_fenomeno = id_fenomeno;
	}

	public Number getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTel_emergencia() {
		return tel_emergencia;
	}

	public void setTel_emergencia(String tel_emergencia) {
		this.tel_emergencia = tel_emergencia;
	}

	public String getCriticidad() {
		return criticidad;
	}

	public void setCriticidad(String criticidad) {
		this.criticidad = criticidad;
	}

	private static final long serialVersionUID = 1L;

	
   
}
