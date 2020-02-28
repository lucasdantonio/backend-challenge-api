package com.lucas.ApiRest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
public class Actor {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long pid;
	
	@NotNull(message="Actor name cannot be null") @NotBlank(message="Actor name cannot be blank")
	private String name;
}
