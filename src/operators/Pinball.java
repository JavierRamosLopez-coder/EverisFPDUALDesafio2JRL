package operators;

/**
 * Librerías necesarias
 */
import java.util.Random;
import java.util.Scanner;

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

	/** Generación de los métodos getters y setters*/
	
	/**Método encargado de devolver el atributo new_color*/
	public String getNew_color() {
		return new_color;
	}

	/**Método encargado de modificar el atributo new_color*/
	public void setNew_color(String new_color) {
		this.new_color = new_color;
	}

	/**Método encargado de devolver el atributo color*/
	public String getColor() {
		return color;
	}

	/**Método encargado de modificar el atributo color*/
	public void setColor(String color) {
		this.color = color;
	}

	/**Método encargado de devolver el atributo cash*/
	public double getCash() {
		return cash;
	}

	/**Método encargado de modificar el atributo cash*/
	public void setCash(double cash) {
		this.cash = cash;
	}

}
