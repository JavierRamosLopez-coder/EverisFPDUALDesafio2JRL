package operators;
import java.util.Scanner;

/**
 * Clase que contendr� un m�todo encargado de averiguar de que clase es un objeto
 * @author jramlope
 *
 */
public class WhoClass {

	/**
	 * M�todo que mostrar� de que clase es un objeto, utilizando el operador
	 * instanceof
	 */
	public void whoClassIs() {

		System.out.println("Esta opci�n le otorga un contrato como Junior en Everis");

		Pinball p = new Pinball("Rojo", 34);

		// Uso del instance of para determinar si un objeto pertenece o no pertenece a
		// la clase
		if (p instanceof Pinball && p.getColor().equals("Rojo")) {

			System.out.println("El objeto pertenece a la clase Pinball y es de color rojo");

		} else {

			System.out.println("FALLOO");

		}
		System.out.println("\t");
	}
	
}
