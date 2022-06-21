package dominio;

public abstract class Figura implements Comparable<Figura>, Movible {

	private String nombre;
	private String color;
	private Double ladoMayor;
	private Double ladoMenor;
	private Punto posicion;

	public Figura(String nombre) {
		this.nombre = nombre;
	}

	public Figura(String nombre, String color) {
		this.nombre = nombre;
		this.color = color;
	}

	public Figura(Punto posicion, Double ladoMayor, Double ladoMenor) {
		this.posicion = posicion;
		this.ladoMayor = ladoMayor;
		this.ladoMenor = ladoMenor;
	}

	public abstract Double calcularArea();

	@Override
	public void mover(double deltaX, double deltaY) {
		Punto nuevoPunto = getPosicion();
		nuevoPunto.setEjeX(nuevoPunto.getEjeX() + deltaX);
		nuevoPunto.setEjeY(nuevoPunto.getEjeY() + deltaY);
		setPosicion(nuevoPunto);
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

	public Double getLadoMayor() {
		return ladoMayor;
	}

	public void setLadoMayor(Double ladoMayor) {
		this.ladoMayor = ladoMayor;
	}

	public Double getLadoMenor() {
		return ladoMenor;
	}

	public void setLadoMenor(Double ladoMenor) {
		this.ladoMenor = ladoMenor;
	}

	public Punto getPosicion() {
		return posicion;
	}

	public void setPosicion(Punto posicion) {
		this.posicion = posicion;
	}

	@Override
	public int compareTo(Figura o) {
		int resultado = 0;
		if (this.calcularArea() < o.calcularArea()) {
			resultado = -1;
		} else if (this.calcularArea() > o.calcularArea()) {
			resultado = 1;
		}
		return resultado;
	}

}
