package indra.talentCamp.generics;

@FunctionalInterface
public interface Operacion<T> {
	//Si o si tiene que tener un solo método porque es una interfaz funcional
	//La T (genérico) sirve para cualquier tipo de datos (float, int, double...)
	T operar(T a, T b);
	
}
