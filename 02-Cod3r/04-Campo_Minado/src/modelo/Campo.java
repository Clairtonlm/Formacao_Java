package modelo;

import java.util.ArrayList;
import java.util.List;

import exececao.ExplosaoException;

public class Campo {
	private final int linha;
	private final int coluna;
	
	private boolean aberto = false;//campo começa fechado
	private boolean minado= false;//e o padrão do boolean começa false
	private boolean marcado = false;
	
	private List<Campo> vizinhos = new ArrayList<>();
	
	
	Campo(int linha, int coluna){
		this.linha = linha;
		this.coluna = coluna;
	}
	
	boolean adicionarVizinho(Campo vizinho) {
		boolean linhaDiferente = linha != vizinho.linha;
		boolean colunaDiferente = coluna != vizinho.coluna;
		boolean diagonal = linhaDiferente && colunaDiferente;
		
		//as distancias com valor absoluto
		int deltaLinha = Math.abs(linha - vizinho.linha);
		int deltaColuna = Math.abs(coluna - vizinho.coluna);
		int deltaGeral = deltaLinha + deltaColuna;
		
		if(deltaGeral == 1 && !diagonal) {
			vizinhos.add(vizinho);
			return true;
		}else if(deltaGeral == 2 && diagonal) {
			vizinhos.add(vizinho);
			return true;
		}else
			return false;
	}
	//criar a função de marcar e desmarcar o bloco
	void alternarMarcacao() {
		if(!aberto) {
			marcado = !marcado;
		}
	}
	//criar função para abri o campo que por padrão estar fechado
	
	boolean abrir() {
		if(!aberto && !marcado) {
			aberto = true;
			
			if(minado) {
				throw new ExplosaoException();
			}
			if(vizinhacaSegura()) {
				vizinhos.forEach(v -> v.abrir());
			}
			return true;
		}else {
			return false;
		}
		
	}
	
	//criar metodo da vizinhaça segura que abre nos lados dos blocos
	boolean vizinhacaSegura() {
		return vizinhos.stream().noneMatch(v -> v.minado);
	}
	
	void minar() {
		minado = true;
	}
	
	public boolean isMarcado() {
		return	marcado;
	}
	

	

	public boolean isAberto() {
		// TODO Auto-generated method stub
		return false;
	}
}//fim da classe campo

