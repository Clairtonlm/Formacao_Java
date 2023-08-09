package br.com.clairton.loja.testes;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.clairton.loja.modelo.Produto;

public class CadastroDeProduto {

	public static void main(String[] args) {
		
		Produto celular = new Produto();
		celular.setNome("Xiami Redmi");
		celular.setDescricao("Muito Legal");
		celular.setPreco(new BigDecimal("890.99"));
		
		//como fazer a concexão
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("loja");
		EntityManager em = factory.createEntityManager();
		
		//fazer um registro no banco de dados
		em.getTransaction().begin();
		em.persist(celular);
		em.getTransaction().commit();
		em.clear();

	}

}
