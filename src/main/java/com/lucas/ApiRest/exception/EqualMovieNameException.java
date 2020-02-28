package com.lucas.ApiRest.exception;

public class EqualMovieNameException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public EqualMovieNameException(String movie) {
		super("That movie name already exists: " + movie);
	}
}
