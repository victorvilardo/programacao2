package bibliotecas;

public class TestaString1 {
	public static void main(String[] args) {
		String a = new String("Java ADS na veia");
		String b = new String("Java ADS na veia");
		
		if(a == b) { 
			
			System.out.println("a e b são iguais (testa o objeto)");
		} else {
			System.out.println("a e b são objetos diferentes");
		}
		
	}
}