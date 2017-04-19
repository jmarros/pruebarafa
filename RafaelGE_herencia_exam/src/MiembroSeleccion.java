import java.util.concurrent.atomic.AtomicInteger;

public abstract class MiembroSeleccion  extends Persona {
	private static AtomicInteger nextId = new AtomicInteger(0);
	private int identificadorFederativo;
	
	public MiembroSeleccion(Persona persona) {
		super(persona);
		this.identificadorFederativo = nextId.incrementAndGet();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString())
		.append("ID Federativo: "+identificadorFederativo).append("\n");
		return sb.toString();
	}
	public int getIdentificadorFederativo() {
		return identificadorFederativo;
	}
	public void setIdentificadorFederativo(int identificadorFederativo) {
		this.identificadorFederativo = identificadorFederativo;
	}
}
