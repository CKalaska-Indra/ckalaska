package indra.talentCamp.generics;

public class CajaFuerte<T, S> {

	private S password;
	private T valor;
	
	
	public CajaFuerte(S password) {
		this.password=password;
	}
	
	public void guardarValor(T valor) {
		this.valor=valor;
	}
	
	public T leerValor(S password) {
		if (password.equals(this.password)) {
			System.out.println("Acceso concedido");
			return this.valor;
		}
		throw new Error("Acceso no autorizado");
	}
}
