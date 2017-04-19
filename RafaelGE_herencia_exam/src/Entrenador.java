import java.util.concurrent.atomic.AtomicInteger;



public class Entrenador extends MiembroSeleccion {
	private static AtomicInteger nextId = new AtomicInteger(0);
	private int licenciaFederativa;
	
	private int añosExperiencias;
	private String equipos;

	public Entrenador(Persona persona, int añosExperiencias, String equipos) {
		super(persona);
		this.añosExperiencias = añosExperiencias;
		this.equipos = equipos;
		this.licenciaFederativa = nextId.incrementAndGet();
	}

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

	public int getLicenciaFederativa() {
		return licenciaFederativa;
	}

	public void setLicenciaFederativa(int licenciaFederativa) {
		this.licenciaFederativa = licenciaFederativa;
	}

	public String getEquipos() {
		return equipos;
	}

	public void setEquipos(String equipos) {
		this.equipos = equipos;
	}

	public int getAñosExperiencias() {
		return añosExperiencias;
	}

	public void setAñosExperiencias(int añosExperiencias) {
		this.añosExperiencias = añosExperiencias;
	}
	
	
	

}
