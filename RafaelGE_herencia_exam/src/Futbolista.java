

// TODO: Auto-generated Javadoc
/**
 * The Class Futbolista.
 */
public class Futbolista extends MiembroSeleccion {

	/** The posicion. */
	private Demarcacion posicion;

	/**
	 * Instantiates a new futbolista.
	 *
	 * @param persona the persona
	 * @param posicion the posicion
	 */
	public Futbolista(Persona persona, Demarcacion posicion) {
		super(persona);
		this.posicion = posicion;
	}
	
	/* (non-Javadoc)
	 * @see MiembroSeleccion#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString())
		.append("Posición: "+getPosicion()).append("\n");
		return sb.toString();
	}

	/**
	 * Gets the posicion.
	 *
	 * @return the posicion
	 */
	public Demarcacion getPosicion() {
		return posicion;
	}

	/**
	 * Sets the posicion.
	 *
	 * @param posicion the new posicion
	 */
	public void setPosicion(Demarcacion posicion) {
		this.posicion = posicion;
	}

}
