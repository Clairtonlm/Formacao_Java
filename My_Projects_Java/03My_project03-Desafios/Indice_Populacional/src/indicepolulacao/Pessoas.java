package indicepolulacao;

public class Pessoas {

	public static void main(String[] args) {
		
		final double currentPopulation = 780000000;//população atual
	    final double growthRate = 1.01;//taxa de crescimento
		
	    int populationAfter1Year = (int) (currentPopulation * growthRate);
	    int populationAfter2Years = (int) (populationAfter1Year * growthRate);
	    int populationAfter3Years = (int) (populationAfter2Years * growthRate);

	    System.out.println("População atual: " + currentPopulation + " pessoas");
	    System.out.println("População depois de 1 ano: " + populationAfter1Year + " pessoas");
	    System.out.println("População depois de 2 anos: " + populationAfter2Years + " pessoas");
	    System.out.println("População depois de 3 anos: " + populationAfter3Years + " pessoas");
	}

}
