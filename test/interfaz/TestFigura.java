package interfaz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import dominio.Circulo;
import dominio.Cuadrado;
import dominio.Elipse;
import dominio.Figura;
import dominio.Punto;
import dominio.Rectangulo;

public class TestFigura {

	@Test
	public void queSePuedaInformarElNombreDeUnaFiguraCirculo() {
		String nombre = "circulo";
		Circulo circulito = new Circulo(nombre);
		String nombreObtenido = circulito.getNombre();
		assertEquals(nombre, nombreObtenido);
	}

	@Test

	public void queSePuedaInformarElNombreDeUnaFiguraCuadrada() {
		Cuadrado cuadradito = new Cuadrado("cuadrado", null, null, null);
		assertEquals("cuadrado", cuadradito.getNombre());
	}

	@Test
	public void queSePuedaInformarElColorDeUnaFiguraCirculo() {
		String nombre = "circulo";
		String color = "azul";
		Circulo circulito = new Circulo(nombre, color);
		String colorObtenido = circulito.getColor();
		assertEquals(color, colorObtenido);
	}

	@Test
	public void queSePuedaInformarElColorDeUnaFiguraCuadrada() {
		Cuadrado cuadradito = new Cuadrado("cuadrado", "violeta", null, null, null);
		assertEquals("violeta", cuadradito.getColor());
	}

	/*
	 * @Test public void queSePuedaCrearUnaFiguraDeColorBlanco() { String nombre =
	 * "figura"; String color = "blanco"; Figura figura = new Figura(nombre, color);
	 * // las clases abstractas no pueden ser instanciadas String valorObtenido =
	 * figura.getColor(); assertEquals(color, valorObtenido); }
	 */

	@Test
	public void queSePuedaObtenerElNombreDeUnaFiguraCuadrada() {
		String nombre = "figura";
		String color = "blanco";
		Figura cuadrado = new Cuadrado(nombre, color, null, null, null);
		String valorObtenido = cuadrado.getColor();
		assertEquals(color, valorObtenido);
	}

	@Test
	public void queSePuedaCalcularElAreaDeUnaFigura() {
		Double base = 2.0;
		Double altura = 4.0;
		Double areaEsperada = 8.0;
		Figura cuadrado = new Cuadrado("Cuadrado", "Verde", null, null, null);
		assertEquals(areaEsperada, cuadrado.calcularArea());
	}

	@Test
	public void crearUnaElipseEn1_1ConEjeMayor2YEjeMenor1ConArea6_283() {
		Punto centro = new Punto(1.0, 1.0);
		Elipse elipse = new Elipse(centro, 2, 1);
		assertEquals(6.283, elipse.calcularArea(), 0.001);
	}

	@Test
	public void mover3_1UnaElipseEn1_1LaLlevaA4_2() {
		Punto centro = new Punto(1.0, 1.0);
		Elipse elipse = new Elipse(centro, 2, 1);
		elipse.mover(3, 1);
		assertEquals(4, elipse.getPosicion().getEjeX(), 0.001);
		assertEquals(2, elipse.getPosicion().getEjeY(), 0.001);
	}

	@Test
	public void crearUnRectanguloEn1_1ConBase2YAltura1TieneArea2() {
		Punto esqInfIzq = new Punto(1.0, 1.0);
		Rectangulo rectangulo = new Rectangulo(esqInfIzq, 2, 1);
		assertEquals(2, rectangulo.calcularArea(), 0.001);
	}

	@Test
	public void crearUnRectanguloEn1_1ConBase2YAltura1TieneEsquinaDerechaEn3_2() {
		Punto esqInfIzq = new Punto(1.0, 1.0);
		Rectangulo rec = new Rectangulo(esqInfIzq, 2, 1);
		assertEquals(3, rec.getEsquinaSupDer().getEjeX(), 0.001);
		assertEquals(2, rec.getEsquinaSupDer().getEjeY(), 0.001);
	}

	@Test
	public void mover3_1UnRectanguloEn1_1LoLlevaA_3_1() {
		Punto EsqInfIzq = new Punto(1.0, 1.0);
		Rectangulo rec = new Rectangulo(EsqInfIzq, 2, 1);
		rec.mover(3, 1);
		assertEquals(4, rec.getPosicion().getEjeX(), 0.001);
		assertEquals(2, rec.getPosicion().getEjeY(), 0.001);
	}

	@Test
	public void mover3_1UnRectanguloEn1_1ConBase2YAltura1ColocaLaEsqSupDerEn_6_3() {
		Punto EsqInfIzq = new Punto(1.0, 1.0);
		Rectangulo rec = new Rectangulo(EsqInfIzq, 2, 1);
		rec.mover(3, 1);
		assertEquals(6, rec.getEsquinaSupDer().getEjeX(), 0.001);
		assertEquals(3, rec.getEsquinaSupDer().getEjeY(), 0.001);
	}

	@Test
	public void crearUnCiculoEn1_1ConRadio2TieneArea12_566() {
		Punto centro = new Punto(1.0, 1.0);
		Circulo cir = new Circulo(centro, 2);
		assertEquals(12.566, cir.calcularArea(), 0.001);
	}

	@Test
	public void mover3_1UnCirculoEn1_1conRadio2LoLlevaA4_2rr() {
		Punto centro = new Punto(1.0, 1.0);
		Circulo cir = new Circulo(centro, 2);
		cir.mover(3, 1);
		assertEquals(4, cir.getPosicion().getEjeX(), 0.001);
		assertEquals(2, cir.getPosicion().getEjeY(), 0.001);
	}

	@Test
	public void crearUnCuadradoEn1_1ConLado2TieneArea4() {
		Punto esqInfIzq = new Punto(1.0, 1.0);
		Cuadrado cua = new Cuadrado(esqInfIzq, 2);
		assertEquals(4, cua.calcularArea(), 0.001);
	}

	@Test
	public void crearUnCuadradoEn1_1ConLado2TieneEsquinaDerechaEn3_3() {
		Punto esqInfIzq = new Punto(1.0, 1.0);
		Cuadrado cua = new Cuadrado(esqInfIzq, 2);
		assertEquals(3, cua.getEsquinaSupDer().getEjeX(), 0.001);
		assertEquals(3, cua.getEsquinaSupDer().getEjeY(), 0.001);
	}

	@Test
	public void mover3_1UnCuadradoEn1_1LoLlevaA_3_1() {
		Punto esqInfIzq = new Punto(1.0, 1.0);
		Cuadrado cua = new Cuadrado(esqInfIzq, 2);
		cua.mover(3, 1);
		assertEquals(4, cua.getPosicion().getEjeX(), 0.001);
		assertEquals(2, cua.getPosicion().getEjeY(), 0.001);
	}

	@Test
	public void mover3_1UnCuadradoEn1_1ConLado2ColocaEsqSupDerEn_6_4() {
		Punto esqInfIzq = new Punto(1.0, 1.0);
		Cuadrado cua = new Cuadrado(esqInfIzq, 2);
		cua.mover(3, 1);
		assertEquals(6, cua.getEsquinaSupDer().getEjeX(), 0.001);
		assertEquals(4, cua.getEsquinaSupDer().getEjeY(), 0.001);
	}

}
