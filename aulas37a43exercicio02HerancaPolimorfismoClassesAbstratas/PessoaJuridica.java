package aulas37a43exercicio02HerancaPolimorfismoClassesAbstratas;

public class PessoaJuridica extends Contribuinte {
	
	 private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public double calcularImposto() {
		return super.getRendaBruta() * 0.1;
	}

	@Override
	public String toString() {
		String s = "Pessoa Jurídica ["; 
		s += super.toString();
		s += "\nCnpj: " + cnpj;
		s += "\nImposto a ser pago: " + calcularImposto();
		s += " ]";
		return s;
	}
	
}
