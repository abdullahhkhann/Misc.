
public class Calculator {

	public static void main(String[] args) {
		
		System.out.println("Addition ---> " + add(2, 3));
		System.out.println("Subtraction ---> " + subtract(2, 3));
		System.out.println("Division ---> " + divide(2, 3));
                System.out.println("Multiply ---> " + multiply(5,5));
	}
	
	public static double add(double x, double y) {
		return x + y;
	}
	
	public static double subtract(double x, double y) {
		return x - y;
	}
	
	public static double divide(double x, double y) {
		return x / y;
	}
        
	public static double multiply(double x, double y){
		return x*y;
	}
}

