package aulas37a43exercicio03HerancaPolimorfismoClassesAbstratas;

public class Peixe extends Animal {

	private String caracteristicas;
	
	public Peixe() {
		super.setPatas(0);
		super.setAmbiente("Mar");
		super.setCor("Cinzenta");
		this.caracteristicas = "Barbatanas e Cauda";
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}
	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	
	public String toString() {
		String s = super.toString();
		s += "\nCaraacterísticas: " + caracteristicas;
		
		return s;
	}
	
}
