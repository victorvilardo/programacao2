package bibliotecas;

public class TestaMath1 {
	public static void main(String[] args) {
		int i = -10;
		System.out.println(i);
		int j = Math.abs(i);
		System.out.println(j);
		System.out.println(Math.abs(i));
		
		double d1 = 4.49999999999;
		System.out.println(d1);
		double d2 = 4.000;
		System.out.println(d2);
		double d3 = Math.round(d1);
		System.out.println(d3);
		
		double d4 = Math.max(d1, d3);
		System.out.println(d4);

		
		//funções ceil e floor
		System.out.println(Math.ceil(d1));
		double d5 = 4.9999999999999;
		System.out.println(Math.floor(d5));
		
	}
}