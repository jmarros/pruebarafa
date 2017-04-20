

// TODO: Auto-generated Javadoc
/**
 * The Enum Demarcación.
 */
public enum Demarcacion {
	
	/** The portero. */
	PORTERO("Portero"),
	
	/** The defensa. */
	DEFENSA("defensa"),
	
	/** The centrocampista. */
	CENTROCAMPISTA("Centrocampista"),
	
	/** The delantero. */
	DELANTERO("Delantero");

	/** The demarcacion. */
	private String demarcacion;
	
	/**
	 * Instantiates a new demarcación.
	 *
	 * @param demarcacion the demarcacion
	 */
	private Demarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

	/**
	 * Gets the demarcación.
	 *
	 * @return the demarcación
	 */
	public String getDemarcación() {
		return demarcacion;
	}

	/**
	 * Sets the demarcación.
	 *
	 * @param demarcacion the new demarcación
	 */
	public void setDemarcación(String demarcacion) {
		this.demarcacion = demarcacion;
	}
}
