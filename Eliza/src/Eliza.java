import java.util.Scanner;


public class Eliza {
	public void startDialog() {
		Scanner input = new Scanner(System.in);
		String pregunta = "";
		String respuesta = "";
		System.out.println("**************************************");
		System.out.println("** BIENVENIDO AL PROGRAMA ELISA 2.0 **");
		System.out.println("**************************************");
		System.out.println("");
		do {
			System.out.print("Pregunta: ");
			pregunta = input.nextLine().toLowerCase();
			if(pregunta.contains("hola"))
				respuesta = "Respuesta: Hola, ¿qué tal?";
			else if(pregunta.contains("encantado"))
				respuesta = "Respuesta: Encantado de conocerte yo también";
			else if(pregunta.contains("adios"))
				respuesta = "Respuesta: Adiós, espero volverte a ver pronto";
			else if(pregunta.contains("hora"))
				respuesta = "Respuesta: Lo siento, no llevo reloj";
			else if(pregunta.contains("nombre"))
				respuesta = "Respuesta: Mi nombre es Eliza";
			else if(pregunta.contains("que tal"))
				respuesta = "Respuesta: Muy bien, ¿y tú?";
			else if(pregunta.contains("como estas"))
				respuesta = "Respuesta: Muy bien, ¿y tú?";
			else if(pregunta.contains("haces"))
				respuesta = "Respuesta: Aprendiendo nuevos algoritmos de inteligencias";
			else if(pregunta.contains("series"))
				respuesta = "Respuesta: Me gustan varias, entre ellas Juego de Tronos";
			else if(pregunta.contains("edad"))
				respuesta = "Respuesta: Tengo 17 años, pero en Enero cumplo los 18";
			else
				respuesta = "Respuesta: Lo siento, no te comprendo";
			System.out.println(respuesta);
			System.out.println("");

		} while(!pregunta.contains("adios"));
		input.close();
		
	}
}