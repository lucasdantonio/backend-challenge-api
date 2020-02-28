package com.lucas.ApiRest.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
public class Movie implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique=true) @NotNull(message="Movie name cannot be null") @NotBlank(message="Movie name cannot be blank")
	private String name;
	
	@NotNull(message="Release date cannot be null")
	private LocalDate release;
	
	@NotNull(message="Censorship cannot be null")
	private Censorship censorship;
	
	@NotNull(message="Director cannot be null") @NotBlank(message="Director cannot be null")
	private String director;
	
	@OneToMany(targetEntity = Actor.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "ma_fk", referencedColumnName = "id")
	@Size(min = 1, max = 10) @NotNull(message="Cast list cannot be null")
	private List<Actor> movieCast;

}
