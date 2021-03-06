package com.wanderoliveira.minhasfinancas.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Entity
@Table (name ="usuario", schema ="financas")
@Builder
@Data

public class Usuario {
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Id
	@Column(name ="id")
	private Long id;
		
	@Column(name ="nome")
	private String nome;
	
	@Column(name ="email")
	private String email;
	
	@Column(name ="senha")
	private String senha;

}