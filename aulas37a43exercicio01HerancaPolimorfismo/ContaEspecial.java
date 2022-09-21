package aulas37a43exercicio01HerancaPolimorfismo;

public class ContaEspecial extends ContaBancaria {

	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		String s = "ContaEspecial";
        s += " Limite: " + limite;
        s += "; " + super.toString(); 
        s += "]" ;
        return s;
	}
	
	public boolean sacar(double valor) {
		
		double saldoComLimite = super.getSaldo() + limite;
		
		if ((saldoComLimite - valor) >= 0) {
			super.setSaldo(super.getSaldo() - valor);
			return true;
		} else {
			return false;
		}
		
	}
	
}
