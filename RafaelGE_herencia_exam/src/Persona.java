

import java.util.List;


public class Persona extends Object {

	private String nombre;
	private String apellido;
	private Sexo sexo;

	public Persona(String nombre, String apellido, Sexo sexo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
	}
	
	public Persona(Persona persona) {
		this.nombre = persona.getNombre();
		this.apellido = persona.getApellido();
		this.sexo = persona.getSexo();
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		final String endLine = "\n";
		sb.append("Nombre: "+nombre).append(endLine)
			.append("Apellidos: "+apellido).append(endLine)
			.append("Sexo: "+getSexo()).append(endLine);
		
		return sb.toString();
	}
	
	public static void muestraLista(List<Persona> personas) {
		for(Persona persona:personas) {
			System.out.println(persona);
		}
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
}
