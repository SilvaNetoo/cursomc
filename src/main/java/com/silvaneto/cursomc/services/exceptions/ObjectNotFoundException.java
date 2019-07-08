package com.silvaneto.cursomc.services.exceptions;

public class ObjectNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException (String str) {
		super(str);
	}

	public ObjectNotFoundException (String str, Throwable cause) {
		super(str, cause);
	}
}
