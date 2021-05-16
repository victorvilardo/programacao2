package ooavc;

public class TestaConta5 {
	public static void main(String[] args) {
		Conta3 c3 = new Conta3(003, "Victor", 100, 100);
		System.out.println(c3.cliente.nome);
		System.out.println(c3.getcontadorContas());
		
		Conta3 c4 = new Conta3(004, "Miguel", 100, 100);
		System.out.println(c4.cliente.nome);
		System.out.println(c4.getcontadorContas());
		
		Conta3 c5 = new Conta3(005, "Priscila", 100, 100);
		System.out.println(c5.cliente.nome);
		System.out.println(c5.getcontadorContas());
		
	}
}