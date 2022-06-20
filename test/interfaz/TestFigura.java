package interfaz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import dominio.Circulo;
import dominio.Cuadrado;
import dominio.Figura;

public class TestFigura {

	@Test
	public void queSePuedaInformarElNombreDeUnaFiguraCirculo() {
		String nombre = "circulo";
		Circulo circulito = new Circulo(nombre);
		String nombreObtenido = circulito.obtenerNombre();
		assertEquals(nombre, nombreObtenido);
	}

	@Test

	public void queSePuedaInformarElNombreDeUnaFiguraCuadrada() {
		Cuadrado cuadradito = new Cuadrado("cuadrado");
		assertEquals("cuadrado", cuadradito.getNombre());
	}

	@Test
	public void queSePuedaInformarElColorDeUnaFiguraCirculo() {
		String nombre = "circulo";
		String color = "azul";
		Circulo circulito = new Circulo(nombre, color);
		String colorObtenido = circulito.obtenerColor();
		assertEquals(color, colorObtenido);
	}

	@Test
	public void queSePuedaInformarElColorDeUnaFiguraCuadrada() {
		Cuadrado cuadradito = new Cuadrado("cuadrado", "violeta");
		assertEquals("violeta", cuadradito.getColor());
	}
	@Test
	public void queSePuedaCrearUnaFiguraDeColorBlanco() {
		String nombre = "figura";
		String color = "blanco";
		Figura figura = new Figura(nombre, color);
		String valorObtenido = figura.getColor();
		assertEquals(color, valorObtenido);
	}

	@Test
	public void queSePuedaObtenerElNombreDeUnaFiguraCuadrada() {
		String nombre = "figura";
		String color = "blanco";
		Figura cuadrado = new Cuadrado(nombre, color);
		String valorObtenido = cuadrado.getColor();
		assertEquals(nombre, valorObtenido);
	}
	
}
