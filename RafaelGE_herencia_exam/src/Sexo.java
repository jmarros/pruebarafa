
// TODO: Auto-generated Javadoc
/**
 * The Enum Sexo.
 */
public enum Sexo {
	
	/** The hombre. */
	HOMBRE("Hombre"),
	
	/** The mujer. */
	MUJER("Mujer");

	/** The sexo. */
	private String sexo;

	/**
	 * Instantiates a new sexo.
	 *
	 * @param sexo the sexo
	 */
	private Sexo(String sexo) {
		this.sexo = sexo;
	}

	/**
	 * Gets the sexo.
	 *
	 * @return the sexo
	 */
	public String getSexo() {
		return sexo;
	}

	/**
	 * Sets the sexo.
	 *
	 * @param sexo the new sexo
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
