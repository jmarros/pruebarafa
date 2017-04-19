

public enum Demarcación {
	PORTERO("Portero"),
	DEFENSA("defensa"),
	CENTROCAMPISTA("Centrocampista"),
	DELANTERO("Delantero");

	private String demarcacion;
	
	private Demarcación(String demarcacion) {
		this.demarcacion = demarcacion;
	}

	public String getDemarcación() {
		return demarcacion;
	}

	public void setDemarcación(String demarcacion) {
		this.demarcacion = demarcacion;
	}
}
