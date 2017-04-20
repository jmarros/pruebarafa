import java.util.concurrent.atomic.AtomicInteger;



// TODO: Auto-generated Javadoc
/**
 * The Class Entrenador.
 */
public class Entrenador extends MiembroSeleccion {
	
	/** The next id. */
	private static AtomicInteger nextId = new AtomicInteger(0);
	
	/** The licencia federativa. */
	private int licenciaFederativa;
	
	/** The años experiencias. */
	private int añosExperiencias;
	
	/** The equipos. */
	private String equipos;

	/**
	 * Instantiates a new entrenador.
	 *
	 * @param persona the persona
	 * @param añosExperiencias the años experiencias
	 * @param equipos the equipos
	 */
	public Entrenador(Persona persona, int añosExperiencias, String equipos) {
		super(persona);
		this.añosExperiencias = añosExperiencias;
		this.equipos = equipos;
		this.licenciaFederativa = nextId.incrementAndGet();
	}

	/* (non-Javadoc)
	 * @see MiembroSeleccion#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		final String endLine = "\n";
		sb.append(super.toString())
			.append("Licencia Federativa: "+getLicenciaFederativa()).append(endLine)
			.append("Años de Experiencia: "+añosExperiencias).append(endLine)
			.append("Equipos entrenados: "+equipos).append(endLine);
		return sb.toString();
	}

	/**
	 * Gets the licencia federativa.
	 *
	 * @return the licencia federativa
	 */
	public int getLicenciaFederativa() {
		return licenciaFederativa;
	}

	/**
	 * Sets the licencia federativa.
	 *
	 * @param licenciaFederativa the new licencia federativa
	 */
	public void setLicenciaFederativa(int licenciaFederativa) {
		this.licenciaFederativa = licenciaFederativa;
	}

	/**
	 * Gets the equipos.
	 *
	 * @return the equipos
	 */
	public String getEquipos() {
		return equipos;
	}

	/**
	 * Sets the equipos.
	 *
	 * @param equipos the new equipos
	 */
	public void setEquipos(String equipos) {
		this.equipos = equipos;
	}

	/**
	 * Gets the años experiencias.
	 *
	 * @return the años experiencias
	 */
	public int getAñosExperiencias() {
		return añosExperiencias;
	}

	/**
	 * Sets the años experiencias.
	 *
	 * @param añosExperiencias the new años experiencias
	 */
	public void setAñosExperiencias(int añosExperiencias) {
		this.añosExperiencias = añosExperiencias;
	}
	
	
	

}
