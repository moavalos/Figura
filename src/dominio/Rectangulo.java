package dominio;

public class Rectangulo extends Figura {
	
	private Punto esquinaSupDer;

	public Rectangulo(Punto posicion, double ladoMayor, double ladoMenor) {
		super(posicion, ladoMayor, ladoMenor);

	}

	@Override
	public Double calcularArea() {
		return getLadoMayor() * getLadoMenor();
	}

	@Override
	public int compareTo(Figura o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Punto getEsquinaSupDer() {
		return esquinaSupDer;
	}

}
