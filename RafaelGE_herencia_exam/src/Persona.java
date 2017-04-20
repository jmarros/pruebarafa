

import java.util.List;


// TODO: Auto-generated Javadoc
/**
 * The Class Persona.
 */
public class Persona extends Object {

	/** The nombre. */
	private String nombre;
	
	/** The apellido. */
	private String apellido;
	
	/** The sexo. */
	private Sexo sexo;

	/**
	 * Instantiates a new persona.
	 *
	 * @param nombre the nombre
	 * @param apellido the apellido
	 * @param sexo the sexo
	 */
	public Persona(String nombre, String apellido, Sexo sexo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
	}
	
	/**
	 * Instantiates a new persona.
	 *
	 * @param persona the persona
	 */
	public Persona(Persona persona) {
		this.nombre = persona.getNombre();
		this.apellido = persona.getApellido();
		this.sexo = persona.getSexo();
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		final String endLine = "\n";
		sb.append("Nombre: "+nombre).append(endLine)
			.append("Apellidos: "+apellido).append(endLine)
			.append("Sexo: "+getSexo()).append(endLine);
		
		return sb.toString();
	}
	
	/**
	 * Muestra lista.
	 *
	 * @param personas the personas
	 */
	public static void muestraLista(List<Persona> personas) {
		for(Persona persona:personas) {
			System.out.println(persona);
		}
	}
	
	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Gets the apellido.
	 *
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	
	/**
	 * Sets the apellido.
	 *
	 * @param apellido the new apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * Gets the sexo.
	 *
	 * @return the sexo
	 */
	public Sexo getSexo() {
		return sexo;
	}

	/**
	 * Sets the sexo.
	 *
	 * @param sexo the new sexo
	 */
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
}
