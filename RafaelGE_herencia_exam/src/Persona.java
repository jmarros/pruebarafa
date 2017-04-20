
import java.util.List;


// TODO: Auto-generated Javadoc
/**
 * The Class Persona.
 * @author Rafael Gonzalez Escobar
 */
public class Persona extends Object {

	/** Almacena el nombre de la persona. */
	private String nombre;
	
	/** Almacena el apellido de la persona. */
	private String apellido;
	
	/** Almacena el sexo de la persona. */
	private Sexo sexo;

	/**
	 * Inicializamos las variables de instancia de la clase Persona.
	 *
	 * @param Asigna nombre a nombre
	 * @param Asigna apellido a apellido
	 * @param Asigna sexo a sexo
	 */
	public Persona(String nombre, String apellido, Sexo sexo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
	}
	
	/**
	 * Inicializamos las variables de instancia de la clase Persona.
	 *
	 * @param Le pasamos un objeto creado de Persona
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
	 * @param muestra el contenido de los objetos
	 */
	public static void muestraLista(List<Persona> personas) {
		for(Persona persona:personas) {
			System.out.println(persona);
		}
	}
	
	/**
	 * Gets the nombre.
	 *
	 * @return el nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Sets the nombre.
	 *
	 * @param  establecemos el nombre de la persona
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Gets the apellido.
	 *
	 * @return el apellido de la persona
	 */
	public String getApellido() {
		return apellido;
	}
	
	/**
	 * Sets the apellido.
	 *
	 * @param establecemos el apellido de la persona
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * Gets the sexo.
	 *
	 * @return el sexo de la persona
	 */
	public Sexo getSexo() {
		return sexo;
	}

	/**
	 * Sets the sexo.
	 *
	 * @param establecemos el sexo de la persona
	 */
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
}
