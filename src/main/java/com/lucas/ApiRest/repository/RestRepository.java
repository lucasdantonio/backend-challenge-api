package com.lucas.ApiRest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.ApiRest.model.Censorship;
import com.lucas.ApiRest.model.Movie;

public interface RestRepository extends JpaRepository<Movie, Long> {
	List<Movie> findByCensorship(Censorship censorship);
	boolean existsByName(String name);
}
