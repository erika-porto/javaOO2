
public class TestaGeteSet {
	public static void main(String[] args) {
		Conta conta=new Conta();
		
//		TESTANDO O SETNUMERO
		conta.setNumero(1337);
		
		System.out.println(conta.getNumero());
	}
}
