package indra.talentCamp.generics;

public abstract class FiguraGenerica<T extends Number> { //T no puede ser un String o un Boolean
	public abstract T calcularArea();
	public abstract T calcularPerimetro();
}
