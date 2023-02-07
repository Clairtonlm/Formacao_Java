package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierFornecedor {

	public static void main(String[] args) {
		Supplier<List<String>> umList =
				()-> Arrays.asList("Cla", "Bia", "Mell");
				
				System.out.println(umList.get());

	}

}
