import java.util.concurrent.atomic.AtomicInteger;

// TODO: Auto-generated Javadoc
/**
 * The Class Entrenador.
 * @author Rafael Gonzalez Escobar
 */
public class Entrenador extends MiembroSeleccion {
	
	/** Herramienta que nos autogenera un numéro partiendo de 0. */
	private static AtomicInteger nextId = new AtomicInteger(0);
	
	/** Guarda un INT autogenerado de la licencia federativa. */
	private int licenciaFederativa;
	
	/** Guarda un INT con los años de experiencias. */
	private int añosExperiencias;
	
	/** Almacena los equipos entrenados. */
	private String equipos;

	/**
	 * Inicializamos las variables de instancia de la clase Entrenador.
	 *
	 * @param Persona llama al constructor de la clase Persona
	 * @param Asigna añosExperiencias a años experiencias
	 * @param Asigna equipos a equipos
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
	 * @return la licencia federativa
	 */
	public int getLicenciaFederativa() {
		return licenciaFederativa;
	}

	/**
	 * Sets the licencia federativa.
	 *
	 * @param establecemos el valor de la licencia federativa
	 */
	public void setLicenciaFederativa(int licenciaFederativa) {
		this.licenciaFederativa = licenciaFederativa;
	}

	/**
	 * Gets the equipos.
	 *
	 * @return los nombres de los equipos entrenados
	 */
	public String getEquipos() {
		return equipos;
	}

	/**
	 * Sets the equipos.
	 *
	 * @param establecemos el nombre de los equipos entrenados
	 */
	public void setEquipos(String equipos) {
		this.equipos = equipos;
	}

	/**
	 * Gets the años experiencias.
	 *
	 * @return los años experiencias
	 */
	public int getAñosExperiencias() {
		return añosExperiencias;
	}

	/**
	 * Sets the años experiencias.
	 *
	 * @param establecemos el valor d elos años de experiencias
	 */
	public void setAñosExperiencias(int añosExperiencias) {
		this.añosExperiencias = añosExperiencias;
	}
	
	
	

}
