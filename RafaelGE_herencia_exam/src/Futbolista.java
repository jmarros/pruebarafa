

public class Futbolista extends MiembroSeleccion {

	private Demarcación posicion;

	public Futbolista(Persona persona, Demarcación posicion) {
		super(persona);
		this.posicion = posicion;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString())
		.append("Posición: "+getPosicion()).append("\n");
		return sb.toString();
	}

	public Demarcación getPosicion() {
		return posicion;
	}

	public void setPosicion(Demarcación posicion) {
		this.posicion = posicion;
	}

}
