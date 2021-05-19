package operators;

/**
 * Librerías necesarias
 */
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Clase Pinball
 * 
 * @author jramlope
 *
 */
public class Pinball {

	/** Objetos de la clase Scanner y Random */
	Scanner S = new Scanner(System.in);
	Random r = new Random();

	/** Atributos privados */
	private String color, new_color;
	private double cash, new_cash;

	/**
	 * Generación del constructor que recibirá dos variables por parámetros
	 * 
	 * @param col
	 * @param cash
	 */
	public Pinball(String col, int cash) {
		this.color = col;
		this.cash = cash;
	}

	/**
	 * Método encargado de lanzar la bola
	 */
	public void throwBall() {

		// Generación de variables locales
		String opcion, new_opcion;
		int position;
		int matriz[][], nfilas, ncolumnas;

		// Interacción con el usuario
		System.out.println("¡¡Bienvenido a PintHoot!!");
		System.out.println("¿ Quiere saber que es PintHoot ? (YES / NO)");
		new_opcion = S.next();

		// Uso del IF para que el programa se meta en un sitio o en otro
		if (new_opcion.equals("YES")) {

			// Llamada al método Kahoot
			Kahoot();

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
						lupping();
						break;

					case 2:

						// Llamada al método menu, que se encuentra en la clase Pinball
						menu();
						break;

					case 3:

						// Llamada al método discotec, que se encuentra en la clase Pinball
						discotec();
						break;

					case 4:

						// Llamada al método biggerThan, que se encuentra en la clase Pinball
						biggerThan();
						break;

					case 5:

						// Llamada al método whoClassIs, que se encuentra en la clase Pinball
						whoClassIs();
						break;
					}
				} while (position != 0);

			} else if (opcion.equals("LEAVE")) {

				System.out.println("¡¡Vuelva pronto!!");

			} else if (opcion != "START" || opcion != "LEAVE") {

				System.out.println("No sea travieso e introduzca una opción válida");

			} else if (opcion != "START" || opcion != "LEAVE") {

			}
		} else if (new_opcion.equals("NO")) {

			System.out.println("que soso!! VUELVA PRONTOO");

		} else if (new_opcion != "YES" || new_opcion != "NO") {

			System.out.println("No sea travieso e introduzca una opción válida");

		}

	}

	/**
	 * Método kahoot que contendrá una explicación del nuevo juego inventado
	 */
	public void Kahoot() {
		System.out.println(
				"Bienvenido a PintHoot, este juego es un nuevo juego que consiste en algo muy sencillo, déjame que se lo explique "
						+"\n"+" va a consistir en que cada vez que usted caiga en una de nuestras 5 posiciones del kahoot va a recibir una pregunta "
						+"\n"+" y si la contesta bien, su premio aumentará");
	}

	/**
	 * Método menú que se utilizará en el caso 2, y básicamente representa una
	 * calculadora
	 */
	public void menu() {
		try {

			System.out.println("Empieza a sumar dinero, empieza con 10€");

			// Cambio de valor de la variable cash
			setCash(10);

			// Almacenamiento de esa variable modificada en una variable
			new_cash = getCash();
			System.out.println("Su dinero es de  €");

			System.out.println("Vamos a crear una calculadora");

			// Generación de variables locales
			int opcion = 0, n1, n2, maths, new_opcion;

			while (opcion != 1) {
				System.out.println(" ¿ Desea entrar a la calculadora ?");
				System.out.println("1 --> Sí");
				System.out.println("0 --> No");
				opcion = S.nextInt();
			}

			if (opcion == 1) {

				System.out.println("1 --> Sumar");
				System.out.println("2 --> Restar");
				System.out.println("3 --> Multiplicacion");
				System.out.println("4 --> Dividir");
				new_opcion = S.nextInt();
				System.out.println("Introduzca el primer número : ");
				n1 = S.nextInt();
				System.out.println("Introduzca el segundo número : ");
				n2 = S.nextInt();

				switch (new_opcion) {
				case 1:

					maths = 0;
					maths = n1 + n2;

					// Uso del StringBuilder
					StringBuilder sb = new StringBuilder();
					sb.append(maths);
					System.out.println(sb.toString());
					break;

				case 2:
					maths = 0;
					maths = n1 - n2;

					// Uso del StringBuilder
					StringBuilder sb1 = new StringBuilder();
					sb1.append(maths);
					System.out.println(sb1.toString());
					break;

				case 3:

					maths = 0;
					maths = n1 * n2;

					// Uso del StringBuilder
					StringBuilder sb3 = new StringBuilder();
					sb3.append(maths);
					System.out.println(sb3.toString());
					break;

				case 4:

					maths = 0;
					maths = n1 / n2;

					// Uso del StringBuilder
					StringBuilder sb4 = new StringBuilder();
					sb4.append(maths);
					System.out.println(sb4.toString());
					break;

				case 5:

					System.out.println("BYE BYE");
					break;

				}

			} else if (opcion == 0) {

				System.out.println("Abandonando calculadora...");

			}
			System.out.println("\t");
		} catch (InputMismatchException e) {

			System.out.println(" Dato erróneo");

		}

	}

	/**
	 * Método discotec que se encargará de tomar un número de cubatas, y los
	 * aumentará utilizando el operador +=
	 */
	public void discotec() {
		try {

			// Generación de variables locales
			String bebida;
			int ncubatas;

			System.out.println("Su bola ha pasado por el tornado dragón");

			System.out.println("Acaba de entrar en la sesión de preguntas fiesteras ^^");

			System.out.println("¿ Qué te sueles pedir para beber en fiestas ?");
			bebida = S.next();

			// Establecimiento de condiciones
			if (bebida.equals("Ron")) {

				System.out.println(" ¿ Cuántos cubatas te sueles beber ? ");
				ncubatas = S.nextInt();

				// Aumenta la variable en 1
				ncubatas += 1;

				System.out.println("Ahora te beberás " + ncubatas + " cubatas");

			} else {

				System.out.println("ERROR");

			}
			System.out.println("\t");
		} catch (InputMismatchException e) {

			System.out.println("Ha introducido algún dato erróneo, reinicie el programa");

		}
	}

	/**
	 * Método biggerThan que se encargará de establecer una comparación, con
	 * condicionales ternarios, entre dos números introducidos por el usuario
	 */
	public void biggerThan() {
		try {

			// Generación de variables locales
			int resultado, n1, n2;

			System.out.println("OH, OH por pasar por esta opción le debe 10 pavos al dueño de la máquina");

			System.out.println("Vamos a realizar algo sencillo, calcularemos que número es mayor entre dos");

			// Interacción con el usuario
			System.out.println("Primer número");
			n1 = S.nextInt();
			System.out.println("Segundo número");
			n2 = S.nextInt();

			// Establecimiento de la condición a partir de operadores ternarios
			resultado = (n1 > n2) ? n1 : n2;

			System.out.println("El número mayor es : " + resultado);

			System.out.println("\t");
		} catch (InputMismatchException e) {

			System.out.println("Ha introducido algún dato erróneo, reinicie el programa");

		}
	}

	/**
	 * Método que mostrará de que clase es un objeto, utilizando el operador
	 * instanceof
	 */
	public void whoClassIs() {

		System.out.println("Esta opción le otorga un contrato como Junior en Everis");

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

	public void lupping() {

		try {

			System.out.println("Ha entrado en un lupping, el color de su bola cambia a dorado");
			setColor("dorado");
			new_color = getColor();
			System.out.println("El color actual de su bola es :" + new_color);

			System.out.println("La cosa se va a empezar a poner difícil, vamos a crear un array");

			// Generación de una matriz.
			// El do while tendrá la función de repetir los system out, hasta que el número
			// tanto de filas como de columnas
			// sean iguales, tiene que ser una matriz cuadrada
			int nfilas;
			int ncolumnas;
			do {
				System.out.println("Introduzca el número de filas : ");
				nfilas = S.nextInt();
				System.out.println("Introduzca el número de columnas : ");
				ncolumnas = S.nextInt();

			} while (nfilas != ncolumnas);

			// Instanciación de la variable matriz
			int[][] matriz = new int[nfilas][ncolumnas];

			// Relleno de la matriz
			System.out.println("Vaya rellenando las posiciones de su matriz");

			for (int i = 0; i < nfilas; i++) {
				for (int j = 0; j < ncolumnas; j++) {
					System.out.println("Matriz [" + i + "]" + "[" + j + "]");
					matriz[i][j] = S.nextInt();
				}
			}

			// Muestra de la matriz generada
			System.out.println("\n La matriz es : ");
			for (int i = 0; i < nfilas; i++) {
				for (int j = 0; j < ncolumnas; j++) {
					System.out.print(matriz[i][j]);
				}
				System.out.println("");
			}
			System.out.println("\t");
		} catch (InputMismatchException e) {

			System.out.println("Ha introducido algún dato erróneo, reinicie el programa");

		}

	}

	public String getNew_color() {
		return new_color;
	}

	public void setNew_color(String new_color) {
		this.new_color = new_color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getCash() {
		return cash;
	}

	public void setCash(double cash) {
		this.cash = cash;
	}

}
