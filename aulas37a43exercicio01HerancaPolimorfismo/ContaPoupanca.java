package aulas37a43exercicio01HerancaPolimorfismo;

import java.util.Calendar;
import java.util.Date;

public class ContaPoupanca extends ContaBancaria {
	
	private int diaRendimento;
	
	public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
	
    @Override
    public String toString() {
        String s = "ContaPoupança[";
        s += " diaRendimento: " + diaRendimento;
        s += "; " + super.toString(); 
        s += "]" ;
        return s; 
    }
	
	/*public String toString() {
		String s = "Rendimento diário: ";
		s += diaRendimento;
		return s;
	}*/
	
	public boolean calcularNovoSaldo(double taxaRendimento) {
		
		Calendar hoje = Calendar.getInstance();     
		
		if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {	// O hoje.get(calendar.DAY_OF_MONTH) vai pegar e nos trazer dia de hoje no java
			super.setSaldo(super.getSaldo() + (super.getSaldo() * taxaRendimento));
			return true;
		} else {
			return false;
		}
	}
}
