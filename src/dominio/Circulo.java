package dominio;

public class Circulo {

	private String nombre;
	private String color;

	public Circulo(String nombre) {
		this.nombre = nombre;
	}

	public Circulo(String nombre, String color) {
		this.nombre = nombre;
		this.color = color;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String obtenerNombre() {
		return this.nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String obtenerColor() {
		return this.color;
	}

}
