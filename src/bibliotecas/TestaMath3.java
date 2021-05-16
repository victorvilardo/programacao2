package bibliotecas;

public class TestaMath3 {
	  public static void main(String args[])
	    {
		  
		  
		  //metodo sin
		  
	        double a = 30;
	          
	        // convertendo
	        double b = Math.toRadians(a);
	  
	        System.out.println(Math.sin(b));
	  
	        a = 45;
	          
	        // convertendo
	        b = Math.toRadians(a);
	  
	        System.out.println(Math.sin(b));
	  
	        a = 60;
	          
	        //convertendo
	        b = Math.toRadians(a);
	  
	        System.out.println(Math.sin(b));
	  
	        a = 90;
	          
	        // convertendo
	        b = Math.toRadians(a);
	  
	        System.out.println(Math.sin(b));
	        
	        //metodo toDegrees utilizando o tahn

	        double x = 45;
	        double y = -180;

	        // convertendo
	        x = Math.toDegrees(x);
	        y = Math.toDegrees(y);

	        //  printa a tangente hiperbólica desses doubles
	        System.out.println("Math.tanh(" + x + ")=" + Math.tanh(x));
	        System.out.println("Math.tanh(" + y + ")=" + Math.tanh(y));
	        
	        
	        double e = 180.0;  
	        // converting e de degree para radian  
	        System.out.println(Math.toRadians(e));  
	        
	        
	     }      
	}
	  
	

