package ca.mcgill.ecse321.MuseumSoftwareSystem.exception;

import org.springframework.http.HttpStatus;

/**
 * Exception model class which will be helpful for parsing information when
 * exceptions occur.
 * 
 * @author Roxanne Archambault
 *
 */
@SuppressWarnings("serial")
public class MuseumSoftwareSystemException extends RuntimeException {

	private HttpStatus status;

	public MuseumSoftwareSystemException(HttpStatus status, String message) {
		super(message);
		this.status = status;
	}

	public HttpStatus getStatus() {
		return this.status;
	}
}
