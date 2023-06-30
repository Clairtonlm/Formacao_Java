
public class TeteSaca {

	public static void main(String[] args)  {
		Conta c = new ContaCorrente(123, 321);
		c.deposita(201);
		try {
			c.saca(201);
		}catch (SaldoInsuficienteException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println(c.getSaldo());
	}

}
