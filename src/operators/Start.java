package operators;

/**
 * Librerías necesarias
 */
import java.util.Scanner;
import java.util.Random;

/**
 * Clase con el método encargado de empezar el programa
 * 
 * @author jramlope
 *
 */
public class Start {

	Scanner S = new Scanner(System.in);
	Random r = new Random();
	
	/**
	 * Método para empezar la aplicación
	 */
	public void start() {
		
		// Generación de variables locales
		String opcion, new_option;
		int position;

		// Interacción con el usuario
		System.out.println("¡¡Bienvenido a PintHoot!!");
		System.out.println("¿ Quiere saber que es PintHoot ? (YES / NO)");
		new_option = S.next();

		// Uso del IF para que el programa se meta en un sitio o en otro
		if (new_option.equals("YES")) {

			// Llamada al método Kahoot
			Kahoot k = new Kahoot();
			k.kahoot();

			System.out.println("¿ Quiere empezar a jugar a la super máquina PintHoot ? (START / LEAVE )");
			opcion = S.next();

			if (opcion.equals("START")) {
				do {
					// Generación de un número aleatorio el cual será almacenado en una variable
					position = r.nextInt(6);

					// Realización de un switch dependiendo de la posición
					switch (position) {

					// Según el número aleatorio generado el switch va a meterse en alguno de los
					// distinos case (opciones)
					case 0:
						System.out.println("OOOH, GAME OVER");
						break;

					case 1:

						// Llamada al método lupping, que se encuentra en la clase Pinball
						Lupping l = new Lupping();
						l.lupping();
						break;

					case 2:

						// Llamada al método menu, que se encuentra en la clase Pinball
						Menu m = new Menu();
						m.menu();
						break;

					case 3:

						// Llamada al método discotec, que se encuentra en la clase Pinball
						Discotec d = new Discotec();
						d.discotec();
						break;

					case 4:

						// Llamada al método biggerThan, que se encuentra en la clase Pinball
						Big b = new Big();
						b.biggerThan();
						break;

					case 5:

						// Llamada al método whoClassIs, que se encuentra en la clase Pinball
						WhoClass w = new WhoClass();
						w.whoClassIs();
						break;
					}
				} while (position != 0);

			} else if (opcion.equals("LEAVE")) {

				System.out.println("¡¡Vuelva pronto!!");

			} else if (opcion != "START" || opcion != "LEAVE") {

				System.out.println("No sea travieso e introduzca una opción válida");

			} else if (opcion != "START" || opcion != "LEAVE") {

			}
		} else if (new_option.equals("NO")) {

			System.out.println("que soso!! VUELVA PRONTOO");

		} else if (new_option != "YES" || new_option != "NO") {

			System.out.println("No sea travieso e introduzca una opción válida");

		}
	}

}
