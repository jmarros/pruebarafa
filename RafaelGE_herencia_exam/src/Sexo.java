// TODO: Auto-generated Javadoc
/**
 * The Enum Sexo.
 * @author Rafael Gonzalez Escobar
 */
public enum Sexo {
	
	/** ser hombre. */
	HOMBRE("Hombre"),
	
	/** ser mujer. */
	MUJER("Mujer");

	/** Almacena el sexo de la persona. */
	private String sexo;

	/**
	 * Instantiates a new sexo.
	 *
	 * @param le pasamos el sexo de la persona
	 */
	private Sexo(String sexo) {
		this.sexo = sexo;
	}

	/**
	 * Gets the sexo.
	 *
	 * @return nombre de sexo
	 */
	public String getSexo() {
		return sexo;
	}

	/**
	 * Sets the sexo.
	 *
	 * @param establecemos el sexo de la persona
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
