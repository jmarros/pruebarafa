import java.util.concurrent.atomic.AtomicInteger;

// TODO: Auto-generated Javadoc
/**
 * The Class MiembroSeleccion.
 * @author Rafael Gonzalez Escobar
 */
public abstract class MiembroSeleccion  extends Persona {
	
	/** Herramienta que nos autogenera un numéro partiendo de 0.*/
	private static AtomicInteger nextId = new AtomicInteger(0);
	
	/** Guarda un INT autogenerado del identificador federativo. */
	private int identificadorFederativo;
	
	/**
	 * Inicializamos las variables de instancia de la clase MiembroSeleccion.
	 *
	 * @param Persona llama al constructor de la clase Persona
	 */
	public MiembroSeleccion(Persona persona) {
		super(persona);
		this.identificadorFederativo = nextId.incrementAndGet();
		// TODO Auto-generated constructor stub
	}
	
	/* (non-Javadoc)
	 * @see Persona#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString())
		.append("ID Federativo: "+identificadorFederativo).append("\n");
		return sb.toString();
	}
	
	/**
	 * Gets the identificador federativo.
	 *
	 * @return el valor del identificador federativo
	 */
	public int getIdentificadorFederativo() {
		return identificadorFederativo;
	}
	
	/**
	 * Sets the identificador federativo.
	 *
	 * @param establecemos el identificador federativo
	 */
	public void setIdentificadorFederativo(int identificadorFederativo) {
		this.identificadorFederativo = identificadorFederativo;
	}
}
