
public enum Sexo {
	HOMBRE("Hombre"),
	MUJER("Mujer");

	private String sexo;

	private Sexo(String sexo) {
		this.sexo = sexo;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
