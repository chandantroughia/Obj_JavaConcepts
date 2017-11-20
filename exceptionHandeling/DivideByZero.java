package exceptionHandeling;

public class DivideByZero {
	
	public static void main(String[] args) {
		divideByZero(2);
	}

	public static void divideByZero(int i) {
		// TODO Auto-generated method stub
		try{
			System.out.println(i/0);
		}
		catch(ArithmeticException ae){
			System.out.println("You can't do that!");
			
			System.out.println(ae.getMessage());
			
			System.out.println(ae.toString());
			
			ae.printStackTrace();
		}
	}

}
