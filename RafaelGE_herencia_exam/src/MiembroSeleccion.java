import java.util.concurrent.atomic.AtomicInteger;

// TODO: Auto-generated Javadoc
/**
 * The Class MiembroSeleccion.
 */
public abstract class MiembroSeleccion  extends Persona {
	
	/** The next id. */
	private static AtomicInteger nextId = new AtomicInteger(0);
	
	/** The identificador federativo. */
	private int identificadorFederativo;
	
	/**
	 * Instantiates a new miembro seleccion.
	 *
	 * @param persona the persona
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
	 * @return the identificador federativo
	 */
	public int getIdentificadorFederativo() {
		return identificadorFederativo;
	}
	
	/**
	 * Sets the identificador federativo.
	 *
	 * @param identificadorFederativo the new identificador federativo
	 */
	public void setIdentificadorFederativo(int identificadorFederativo) {
		this.identificadorFederativo = identificadorFederativo;
	}
}
