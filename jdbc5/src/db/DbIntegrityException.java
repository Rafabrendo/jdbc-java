package db;

public class DbIntegrityException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	//Minha exceção personalizada
	public DbIntegrityException(String msg) {
		super(msg);
	}

}
