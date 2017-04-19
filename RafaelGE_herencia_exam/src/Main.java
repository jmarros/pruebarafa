import java.util.ArrayList;
import java.util.List;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p = new Persona("Rafael","González",Sexo.HOMBRE);
		Futbolista f = new Futbolista(p, Demarcación.DELANTERO);
		Entrenador e = new Entrenador(p,4, "Liverpool FC y Córdoba F.C");
		
		List<Persona> list = new ArrayList<Persona>();
		list.add(p);
		list.add(f);
		list.add(e);
		
		
		Persona.muestraLista(list);

	}

}
