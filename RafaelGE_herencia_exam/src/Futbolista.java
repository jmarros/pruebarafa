
// TODO: Auto-generated Javadoc
/**
 * The Class Futbolista.
 * @author Rafael Gonzalez Escobar
 */
public class Futbolista extends MiembroSeleccion {

	/** Almacena la demarcación del futbolista. */
	private Demarcacion posicion;

	/**
	 * Inicializamos las variables de instancia de la clase Futbolista.
	 *
	 * @param Le pasamos un objeto Persona al constructor de la clase Persona
	 * @param Asigna posicion a posicion
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
	 * @return el nombre de la posicion del futbolista
	 */
	public Demarcacion getPosicion() {
		return posicion;
	}

	/**
	 * Sets the posicion.
	 *
	 * @param establecemos la posicion del futbolista
	 */
	public void setPosicion(Demarcacion posicion) {
		this.posicion = posicion;
	}

}
