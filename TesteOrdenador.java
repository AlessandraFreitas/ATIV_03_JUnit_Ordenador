/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Classe.Ordenador;
/**
 *
 * @author alefr
 */
public class TesteOrdenador {
    
    Ordenador ord = new Ordenador();

	@Test
	public void informarValor() {
		double resultado = ord.informarValor("10");
		Assert.assertEquals(10, resultado, 0.0074);
	}

	@Before
	public void substituirMaior() {
	}

	@After
	public void substituitValorMaior() {
	}

	@Test
	public void maiorValor() {

		double resultado = ord.getMaiorValor();
		Assert.assertEquals(5, resultado, 0.0001);
	}

	@Before
	public void maiorOrdenacao() {
	}

	@After
	public void valorMaior() {
	}

	@Test
	public void menorValor() {

		double resultado = ord.getMenorValor();
		Assert.assertEquals(3, resultado, 0.0001);
	}

	@Before
	public void menorOrdenacao() {
	}

	@After
	public void valorMenor() {
	}

	@Test
	public void mediaValor() {

		double resultado = ord.getValorMedio();
		Assert.assertEquals(4, resultado, 0.1111);
	}

	@Before
	public void mediaOrdenacao() {
	}

	@After
	public void valorMedia() {
	}

	@Test
	public void getValorMadiana() {
		double resultado = ord.getValorMediana();
		Assert.assertEquals(3, resultado, 0.001);
	}
	@Before
	public void medianaOrdenacao() {
	}

	@After
	public void valorMediana() {
	}
    
}
