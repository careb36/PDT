package com.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: USUARIOS
 * @author Winux
 */
@Entity
@Table(name = "Usuarios", schema="PROYECTO", uniqueConstraints={@UniqueConstraint(name = "UK_Usuarios", columnNames = {"usuarios"})})
public class Usuario implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false)
	private long Id_usuario;
	
	@Column(length = 40, nullable = false)
	private String nombre;
	
	@Column(length = 40, nullable = false)
	private String apellido;
	
	@Column(length = 60, nullable = false)
	private String correo;
	
	@Column(length = 40)
	private String direccion;
	
	@Column(length = 30, nullable = false)
	private String pass;
	
	@Column(length = 30)
	private String documento;
	
	@Column(length = 30)
	private String tipo_doc;
	
	@Column(length = 30, nullable = false)
	private String estado;
	
	@Column(length = 50, nullable = false)
	private String tipo_usuario;
	
	@Column(length = 50, nullable = false)
	private String usuarios;	
	
	public Usuario() {
		super();
	}
	
	/**
     * GETs and SETs
     */
	
	public long getId_usuario() {
		return Id_usuario;
	}

	public void setId_usuario(long id_usuario) {
		Id_usuario = id_usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getTipo_doc() {
		return tipo_doc;
	}

	public void setTipo_doc(String tipo_doc) {
		this.tipo_doc = tipo_doc;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTipo_usuario() {
		return tipo_usuario;
	}

	public void setTipo_usuario(String tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}

	public String getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(String usuarios) {
		this.usuarios = usuarios;
	}

	private static final long serialVersionUID = 1L;

}
