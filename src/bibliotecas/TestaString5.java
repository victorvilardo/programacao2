package bibliotecas;

public class TestaString5 {

	public static void main(String[] args) {
	
		//Metodo empty
		
		//string vazia
		
		String str1="";  
		
		//string nao-nula
		
		String str2="chocolate";  

		//printa true se estiver vazia
		
		System.out.println(str1.isEmpty());  
		
		//printa false se for nao estiver vazia
		
		System.out.println(str2.isEmpty());  

		//Metodo Replace
		
		String str = new String("Aprender java é muito divertido");

		System.out.print("String depois do replace de 'o' com 'p' :" );
		System.out.println(str.replace('o', 'p'));
		
	
		//Metodo contains 
		
		String str5 = "Harry Potter";  

		//printa verdade se conter a string dada
		
		System.out.println(str5.contains("Harry"));
	}

}
