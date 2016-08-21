
public class BasicCalculator {
	
	private int a, b;
	
	public int add(int a, int b){
		System.out.println("The answer of addition is: ");
		return a + b;
	}
	
	public int sub(int a, int b){
		return a - b;
	}
	
	public double multiply(int a, int b){
		return a * b;
	}
	
	public double divide(int a, int b){
		return a / b;
	}
	
	public double modulus(int a, int b){
		return a % b;
	}
	
	public double clear(){
		return 0;
	}

}
