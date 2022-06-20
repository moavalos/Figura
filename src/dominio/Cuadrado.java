package dominio;

public class Cuadrado extends Figura {

	private String nombre;
	private String color;

	public Cuadrado(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	public Cuadrado(String nombre, String color) {
		super(nombre, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double calcularArea(Double base, Double altura) {
		return base * altura;
	}

}
