package br.com.iobm.exception;

import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Date timestamp;
	private String message;
	private String datail;
	
	public ExceptionResponse(Date timestamp, String message, String datail) {
		this.timestamp = timestamp;
		this.message = message;
		this.datail = datail;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDatail() {
		return datail;
	}
}
