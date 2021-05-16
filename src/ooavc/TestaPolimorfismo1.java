package ooavc;

public class TestaPolimorfismo1 {
	public static void main(String[] args) {

		
		Gerente g1 = new Gerente();
		g1.setSalario(10000);
		System.out.println("O salario do gerente g1 eh:"+g1.getSalario());
		System.out.println("O bonus do funcionario f1 eh: "+g1.getBonus());
	}
}