package dominio;

public class Cuadrado {

	private String nombre;
	private String color;

	public Cuadrado(String nombre) {
		this.nombre = nombre;
	}

	public Cuadrado(String nombre, String color) {
		this.nombre = nombre;
		this.color = color;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
