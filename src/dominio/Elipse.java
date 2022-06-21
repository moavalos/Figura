package dominio;

public class Elipse extends Figura {

	public Elipse(Punto posicion, double ladoMenor, double ladoMayor) {
		super(posicion, ladoMenor, ladoMayor);
	}

	/*
	 * Area = Pi * semiejeMayor * semiejeMenor
	 */
	@Override
	public Double calcularArea() {
		return Math.PI * getLadoMayor() * getLadoMenor();
	}

	@Override
	public int compareTo(Figura o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
