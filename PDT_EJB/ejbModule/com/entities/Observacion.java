package com.entities;
import java.util.Date;
import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;
/**
 * Entity implementation class for Entity: OBSERVACIONES
 * @author Winux
 */

@Entity

@Table(name = "Observaciones", schema="PROYECTO", uniqueConstraints={@UniqueConstraint(name = "UK_Observaciones", columnNames = {"observacion", "fecha_hora_registro"})})

public class Observacion implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(nullable = false)
	private long Id_observacion;
	
	@Column(length = 60, nullable = false)
	private String observacion;
	
	@Column(length = 500, nullable = false)
	private String descripcion;
	
	@Column(precision = 2, scale = 5, nullable = false)
	private BigDecimal latitud;
	
	@Column(precision = 2, scale = 5, nullable = false)
	private BigDecimal longitud;
	
	@Basic(optional = false)
	@Temporal(TemporalType.DATE)
	Date fecha_hora_registro = new Date();
	
	@Column(length = 500)
	private String comentarios_rev;
	
	@Column(length = 30)
	private String fiabilidad_rev;
	
	@Temporal(TemporalType.DATE)
	Date fecha_hora_rev = new Date();
	
	  @ManyToOne (fetch = FetchType.LAZY, optional =  false)
	  @JoinColumn(name = "Id_usuario")
	 private Usuario usuario;
	  
	  @ManyToOne (fetch = FetchType.LAZY, optional =  false) 
	  @JoinColumn(name = "Id_localidad")
	  private Localidad localidad;
	  
	  @ManyToOne (fetch = FetchType.LAZY, optional =  false) 
	  @JoinColumn(name = "Id_fenomeno")
	  private Fenomeno fenomeno;
	
	public Observacion() {
		super();
	}
	
	/**
     * GETs and SETs
     */
   
	public long getId_observacion() {
		return Id_observacion;
	}

	public void setId_observacion(long id_observacion) {
		Id_observacion = id_observacion;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public BigDecimal getLatitud() {
		return latitud;
	}

	public void setLatitud(BigDecimal latitud) {
		this.latitud = latitud;
	}

	public BigDecimal getLongitud() {
		return longitud;
	}

	public void setLongitud(BigDecimal longitud) {
		this.longitud = longitud;
	}

	public Date getFecha_hora_registro() {
		return fecha_hora_registro;
	}

	public void setFecha_hora_registro(Date fecha_hora_registro) {
		this.fecha_hora_registro = fecha_hora_registro;
	}

	public String getComentarios_rev() {
		return comentarios_rev;
	}

	public void setComentarios_rev(String comentarios_rev) {
		this.comentarios_rev = comentarios_rev;
	}

	public String getFiabilidad_rev() {
		return fiabilidad_rev;
	}

	public void setFiabilidad_rev(String fiabilidad_rev) {
		this.fiabilidad_rev = fiabilidad_rev;
	}

	public Date getFecha_hora_rev() {
		return fecha_hora_rev;
	}

	public void setFecha_hora_rev(Date fecha_hora_rev) {
		this.fecha_hora_rev = fecha_hora_rev;
	}

	private static final long serialVersionUID = 1L;

	
}
