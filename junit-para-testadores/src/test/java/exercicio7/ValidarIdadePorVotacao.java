package exercicio7;

import static org.junit.Assert.*;

import org.junit.Test;

import votacao.Votacao;

public class ValidarIdadePorVotacao {
	
	@Test
	public void idadeIgual15Anos_NaoPodeVotar() {
		assertEquals("Maria voce nao pode votar", Votacao.podeVotar("Maria", 2007));
	}
	
	@Test
	public void idadeIgual16Anos_VotoFacultativo() {
		assertEquals("Rodrigo seu voto e facultativo",   Votacao.podeVotar("Rodrigo", 2006));
	}
	
	@Test
	public void idadeIgual17Anos_VotoFacultativo() {
		assertEquals("Joao seu voto e facultativo",   Votacao.podeVotar("Joao", 2005));
	}
	
	@Test
	public void idadeIgual18Anos_VotoObrigatorio() {
		assertEquals("Carla seu voto e obrigatorio",  Votacao.podeVotar("Carla", 2004));
	}
	
	@Test
	public void idadeIgual25Anos_VotoObrigatorio() {
		assertEquals("Jose seu voto e obrigatorio",  Votacao.podeVotar("Jose", 1997));
	}
	
	@Test
	public void idadeIgual70Anos_VotoObrigatorio() {
		assertEquals("Ana seu voto e obrigatorio",  Votacao.podeVotar("Ana", 1952));
	}
	
	@Test
	public void idadeIgual71Anos_VotoFacultativo() {
		assertEquals("Pedro seu voto e facultativo",   Votacao.podeVotar("Pedro", 1951));
	}
	
	
	
}
