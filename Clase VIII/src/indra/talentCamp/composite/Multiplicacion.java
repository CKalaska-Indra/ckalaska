package indra.talentCamp.composite;

public class Multiplicacion  extends OperacionBinaria{
	
    public Multiplicacion(Operacion operandoIzquierdo, Operacion operandoDerecho) {
        super(operandoIzquierdo, operandoIzquierdo);
    }
    @Override
    public double calcular() {
        return this.operandoIzquierdo.calcular() * this.operandoDerecho.calcular();
    }
    
}