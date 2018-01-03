package com.gasparking.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class User implements Serializable {
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="id_usuario", unique=true, nullable=false)
	private long id;
	
	@Column(name="nombre",length=100)
	private String name;
	
	@Column(name="primer_apellido",length=100)
	private String firstLastname;
	
	@Column(name="segundo_apellido",length=100)
	private String secondLastname;
	
	@Column(name="usuario",length=100)
	private String username;
	
	@Column(name="clave",length=100)
	private String password;
	
	protected User() {}
	
	public User(String name,String firstLastname,String secondLastname,String username, String password) {
		this.name=name;
		this.firstLastname=firstLastname;
		this.secondLastname=secondLastname;
		this.username=username;
		this.password=password;
	}
	
}
