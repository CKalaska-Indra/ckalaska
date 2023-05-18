package indra.talentCamp.composite;

public class Suma  extends OperacionBinaria{
	
		public Suma(Operacion operandoIzquierdo, Operacion operandoDerecho) {
		    super(operandoIzquierdo, operandoIzquierdo);
		}
		@Override
		public double calcular() {
		    return this.operandoIzquierdo.calcular() * this.operandoDerecho.calcular();
		}
	

}