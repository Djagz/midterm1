
public class BasicCalculator {
	
	private int a, b;
	
	public int add(int a, int b){
		System.out.println("The answer of addition is: ");
		return a + b;
	}
	
	public int sub(int a, int b){
                System.out.println("The answer of subtraction is: ");
		return a - b;
	}
	
	public double multiply(int a, int b){
                System.out.println("Here comes the division: ");
                System.out.println("The answer of multiplication is: ");
		return a * b;
	}
	
	public double divide(int a, int b){
                System.out.println("The answer of division is: ");
		return a / b;
	}
	
	public double modulus(int a, int b){
                System.out.println("The answer of modulus is: ");
		return a % b;
	}
	
	public double clear(){
		return 0;
	}

}
