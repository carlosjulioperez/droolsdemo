package ec.cjpq.droolsdemo.model;

/**
 * Drools and MVEL examples
 * Message model class
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-26
 */
public class Message {

	public static final int HELLO = 0;
	public static final int GOODBYE = 1;

	private String message;
	private int status;

	public Message (String message, int status){
		this.message = message;
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}

