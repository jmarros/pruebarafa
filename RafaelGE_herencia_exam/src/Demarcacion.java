
// TODO: Auto-generated Javadoc
/**
 * The Enum Demarcacion.
 * @author Rafael Gonzalez Escobar
 */
public enum Demarcacion {
	
	/** ser portero. */
	PORTERO("Portero"),
	
	/** ser defensa. */
	DEFENSA("defensa"),
	
	/** ser centrocampista. */
	CENTROCAMPISTA("Centrocampista"),
	
	/** ser delantero. */
	DELANTERO("Delantero");

	/** Almacena el nombre de la demarcación correspondiente */
	private String demarcacion;
	
	/**
	 * Instantiates a new demarcación.
	 *
	 * @param le pasamos el nombre de la demarcacion
	 */
	private Demarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

	/**
	 * Gets the demarcación.
	 *
	 * @return nombre de la demarcacion
	 */
	public String getDemarcación() {
		return demarcacion;
	}

	/**
	 * Sets the demarcación.
	 *
	 * @param establecemos el nombre de la demarcacion
	 */
	public void setDemarcación(String demarcacion) {
		this.demarcacion = demarcacion;
	}
}
