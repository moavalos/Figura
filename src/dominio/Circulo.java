package dominio;

public class Circulo extends Figura {

	private String nombre;
	private String color;
	private Double radio;

	public Circulo(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	public Circulo(String nombre, String color) {
		super(nombre, color);
		// TODO Auto-generated constructor stub
	}
	public Circulo(Punto posicion, Double radio, Double radio2) {
		super(posicion, radio, radio);
	}
	
	public Circulo(Punto posicion, double radio) {
		super(posicion, radio, radio);
	}

	@Override
	public Double calcularArea() {
		return Math.PI * Math.pow(radio, 2);
	}

	@Override
	public int compareTo(Figura o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
