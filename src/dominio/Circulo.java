package dominio;

public class Circulo extends Figura {

	private String nombre;
	private String color;

	public Circulo(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	public Circulo(String nombre, String color) {
		super(nombre, color);
		// TODO Auto-generated constructor stub
	}

	public String obtenerNombre() {
		return this.nombre;
	}

	public String obtenerColor() {
		return this.color;
	}

}
