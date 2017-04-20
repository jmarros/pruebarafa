import java.util.ArrayList;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 * @author Rafael Gonzalez Escobar jaja
 */
public class Main {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p = new Persona("Rafael","González",Sexo.HOMBRE);
		Futbolista f = new Futbolista(p, Demarcacion.DELANTERO);
		Entrenador e = new Entrenador(p,4, "Liverpool FC y Córdoba F.C");
		
		List<Persona> list = new ArrayList<Persona>();
		list.add(p);
		list.add(f);
		list.add(e);
		
		Persona.muestraLista(list);

	}

}
