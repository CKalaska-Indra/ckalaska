import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProgramBufferedReader {
	
	public static void ejemploBufferedReaderConThrows() throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ingresa tu nombre:");
		

	//try {
		try {
			String nombre = reader.readLine();
			System.out.println("Ingresa tu edad:");
			String edadAsString = reader.readLine();
			int edad = Integer.parseInt(edadAsString);
			System.out.println("Hola "+nombre+" de "+edad+" años");
		} finally {
			System.out.println("Cerrando el BufferedReader...");
			reader.close();
		}
	}
	public static void ejemploBufferedReaderSinThrows() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ingresa tu nombre:");
		

		try {
			try {
				String nombre = reader.readLine();
				System.out.println("Ingresa tu edad:");
				String edadAsString = reader.readLine();
				int edad = Integer.parseInt(edadAsString);
				System.out.println("Hola "+nombre+" de "+edad+" años");
			} catch (IOException e){
				System.err.println(e.getMessage());
			}
		}finally {
			System.out.println("Cerrando el BufferedReader...");
			try {
				reader.close();
			}catch(IOException e) {
				System.err.println(e.getMessage());
			}
		}
	}
	
	
	
	public static void main(String[] args) throws IOException {
		try {
			ProgramBufferedReader.ejemploBufferedReaderConThrows();
		}
		catch(IOException e) {
			System.err.println(e.getMessage());
		}
		


	//} catch (IOException e) {
		// TODO Auto-generated catch block
		//System.err.println(e.getMessage());
	//}
		
		
		
	}

}
