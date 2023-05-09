package modelo;
//passando o * no assert ele retorna tanto TRUE como FALSE  no mesmo import
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CampoTeste {
	
	//1-Instancie a classe que vai ser realizado o teste
	private Campo campo; 
	
	//4-criar uma função para que o teste seja reinicializado a cada novo teste.
	@BeforeEach
	void iniciarCampo() {
		campo = new Campo(3,3);
	}
	
	//2-criar função para relaizar o teste
	//3-Marcar com a função com @teste
	@Test
	void testeVizinhoDistancia1() {
		Campo vizinho = new Campo(3,2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		//metodo para testar o resultados se é TRUE ou FALSE
		assertTrue(resultado);
	}
	@Test
	void testeVizinhoDistancia1Esquerda() {
		Campo vizinhoEsquerda = new Campo(3,2);
		boolean resultadoEsquerda = campo.adicionarVizinho(vizinhoEsquerda);
		
		assertTrue(resultadoEsquerda);
	}
	@Test
	void testeVizinhoDistancia1Direita() {
		Campo vizinhoDireita = new Campo(3,4);
		boolean resultadoDireita = campo.adicionarVizinho(vizinhoDireita);
		
		assertTrue(resultadoDireita);
	}
	@Test
	void testeVizinhoDistancia1EmCima() {
		Campo vizinhoEmCima = new Campo(2,3);
		boolean resultadoEmCima = campo.adicionarVizinho(vizinhoEmCima);
		
		assertTrue(resultadoEmCima);
	}
	@Test
	void testeVizinhoDistancia1EmBaixo() {
		Campo vizinhoEmBaixo = new Campo(4,3);
		boolean resultadoEmBaixo = campo.adicionarVizinho(vizinhoEmBaixo);
		
		assertTrue(resultadoEmBaixo);
	}
	@Test
	void testeVizinhoDistancia2() {
		Campo vizinho = new Campo(2,2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		//metodo para testar o resultados se é TRUE ou FALSE
		assertTrue(resultado);
	}
	@Test
	void testeNaoVizinho() {
		Campo vizinho = new Campo(1,1);
		boolean resultado = campo.adicionarVizinho(vizinho);
		//metodo para testar o resultados se é TRUE ou FALSE, nesse caso quero que seja FALSE
		assertFalse(resultado);
	}
	@Test
	void testeValorPadraoAtributoMarcado() {
		assertFalse(campo.isMarcado());
	}
	@Test
	void testeAlternaMarcado() {
		campo.alternarMarcacao();
		assertTrue(campo.isMarcado());
	}
	@Test
	void testeAlternaMarcacaoDuasChaamadas() {
		campo.alternarMarcacao();
		campo.alternarMarcacao();
		assertFalse(campo.isMarcado());
	}
	@Test
	void testeAbrirNaoMinadoNaoMarcado() {
		assertTrue(campo.abrir());
	}
	@Test
	void testeAbrirNaoMinadoMarcado() {
		campo.alternarMarcacao();
		campo.minar();
		assertFalse(campo.abrir());
	}
//	@Test
//	void testeAbrirMinadoNaoMarcado() {
//		campo.minar();
//		assertThrows(ExplosaoException.class, ()->{
//			campo.abrir();
//		});
	
//		
//	}
//	@Test
//	void testeAbrirComVizinho() {
//		Campo campo11 = new Campo(2, 2);
//		Campo campo22 = new Campo(1, 1);
//		
//		campo22.adicionarVizinho(campo11);
//		
//		campo.adicionarVizinho(campo22);
//		campo.abrir();
//		
//		assertTrue(campo22.isAberto() && campo11.isAberto());
//	}
	
	
	
	
}//fim da classe
