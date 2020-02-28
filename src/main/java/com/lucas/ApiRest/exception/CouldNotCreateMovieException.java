package com.lucas.ApiRest.exception;

public class CouldNotCreateMovieException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public CouldNotCreateMovieException(Throwable msg) {
		super("Could not create the movie: " + msg);
	}
}
