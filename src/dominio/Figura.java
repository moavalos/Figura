package dominio;

public abstract class Figura {
	
	private String nombre;
	private String color;

	public Figura(String nombre) {
		this.nombre = nombre;
	}

	public Figura(String nombre, String color) {
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

	public abstract Double calcularArea(Double base, Double altura);
}
