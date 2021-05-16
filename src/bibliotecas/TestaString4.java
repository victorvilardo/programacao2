package bibliotecas;

public class TestaString4 {

	public static void main(String[] args) {
	
		//Para implementar o metodo subString
	
		String str= new String("Estudar java no Senac e muito legal e divertido");
			System.out.println("Substring comecando do indice 15 :");
			System.out.println(str.substring(15));
			System.out.println("Substring coemcando do indice 15 e terminando no 20:");
			System.out.println(str.substring(15, 20));
			
		
		//Para implementar o metodo trim
		
		String str2 = new String("    Oi tudo bem??   ");
			System.out.println("String antes do trim: "+str2);
			System.out.println("String depois do trim: "+str2.trim());

		
		//Para implementar o metodo indexOf
		
	    String str3 = new String("Este e um tutorial de Java para iniciantes");
	    	System.out.println("Index de J em str3: "+str3.indexOf('J'));
	       
		
	    //Para implementar o metodo lastindexOf
	    	
	    	
	   String str4 = new String("Este livro sobre banco de dados precisa ser comprado");
	         System.out.println("Ultimo 's' in str4: "+str4.lastIndexOf('s'));
	}
}


