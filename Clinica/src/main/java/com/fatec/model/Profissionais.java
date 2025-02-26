package com.fatec.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="profissionais")
public class Profissionais implements Serializable{
	@Id()
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_profissional;
	
	@Column(name="especialidade")
	private String especialidade;
	
	
}
