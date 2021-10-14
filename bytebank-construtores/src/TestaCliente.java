
public class TestaCliente {
	public static void main(String[] args) {
		
		Conta contaErika=new Conta();
		contaErika.deposita(100);
		System.out.println(contaErika.getSaldo());;
		
		contaErika.saca(90);
		System.out.println(contaErika.getSaldo());
		
		Conta contaFabio=new Conta();
		contaFabio.deposita(100);
		contaFabio.transfere(110, contaErika);
		
		System.out.println(contaErika.getSaldo());
	}
}
