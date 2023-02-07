package Coleções;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })//tirar advertencias
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		conjunto.add(1.2);//double->Double
		conjunto.add(true);
		conjunto.add("teste");
		conjunto.add(1);
		conjunto.add('x');
		System.out.println("Tamanho é : " + conjunto.size());//saber o tamanho .size-->5
		System.out.println(conjunto.remove('x'));// .remove remover elementos-->removel x
		System.out.println(conjunto.contains('x'));//para saber se contem o elemento x-->nao tem
		
		Set nums =new HashSet();//tambem é valido
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		System.out.println(nums);
		System.out.println(conjunto);
		
		//para fazer a união de conjuntos
		conjunto.addAll(nums);
		System.out.println(conjunto);
		
		//PARA FAZER A INTERSEÇÃO DE CONJUNTOS
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
	}

}
