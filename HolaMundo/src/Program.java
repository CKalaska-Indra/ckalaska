
public class Program {

	public static void main(String[] args) {
		System.out.println("Hola mundo brr");
		
		int number=20;
		double half = 0.5;
		boolean isTrue = true;		
		
		//Tipos de datos objetos (hay que pedir memoria con new)
		String name = "Carlos"; //Con string no hace falta poner new
		@SuppressWarnings("removal")
		Integer num = new Integer(2);
		String toWord = Integer.toString(number);
		System.out.println(toWord);
		
		toWord = "12";
		try {
			toWord = "22dos";
			num = Integer.parseInt(toWord);
		}catch (NumberFormatException ex) {
			System.out.println(ex);
			System.out.println("No se puede convertir letras a numero");
		}
		
		String decimalString = "2.0";
		double decimalDouble = 0.0;
		decimalDouble = Double.parseDouble(decimalString);
		System.out.println(decimalDouble);
	}

}
