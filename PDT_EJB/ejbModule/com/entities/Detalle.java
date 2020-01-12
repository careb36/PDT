package com.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: DETALLES
 * @author Winux
 */
@Entity

@Table(name = "Detalles", schema="PROYECTO" , uniqueConstraints={@UniqueConstraint(name = "UK_Detalles", columnNames = {"Id_caracteristica", "Id_observacion", "valor_fecha_hora"})})

public class Detalle implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false)
	private long Id_detalle;
	
	@Column(nullable = false)
	private int valor_numerico;
	
	@Basic(optional = false)
	@Temporal(TemporalType.DATE)
	Date valor_fecha_hora = new Date();
	
	@Column (length = 8, nullable = false)
	private String valor_texto;
	
	@ManyToOne (fetch = FetchType.LAZY, optional =  false) 
	@JoinColumn(name = "Id_observacion")
	private Observacion observacion;
	
	@ManyToOne (fetch = FetchType.LAZY, optional =  false) 
	@JoinColumn(name = "Id_caracteristica")
	private Caracteristica caracteristica;
	
	public Detalle() {
		super();
	}
	
	/**
     * GETs and SETs
     */
   	
	public long getId_detalle() {
		return Id_detalle;
	}

	public void setId_detalle(long id_detalle) {
		Id_detalle = id_detalle;
	}

	public int getValor_numerico() {
		return valor_numerico;
	}



	public void setValor_numerico(int valor_numerico) {
		this.valor_numerico = valor_numerico;
	}



	public Date getValor_fecha_hora() {
		return valor_fecha_hora;
	}



	public void setValor_fecha_hora(Date valor_fecha_hora) {
		this.valor_fecha_hora = valor_fecha_hora;
	}



	public String getValor_texto() {
		return valor_texto;
	}



	public void setValor_texto(String valor_texto) {
		this.valor_texto = valor_texto;
	}

}



