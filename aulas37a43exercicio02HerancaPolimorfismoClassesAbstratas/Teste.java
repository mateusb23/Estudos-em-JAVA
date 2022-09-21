package aulas37a43exercicio02HerancaPolimorfismoClassesAbstratas;

public class Teste {

	public static void main(String[] args) {
		
		PessoaFisica p1 = new PessoaFisica();
		p1.setNome("Contribuinte 01");
		p1.setRendaBruta(1000);
		p1.setCpf("427.384.471-04");
		
		PessoaJuridica p2 = new PessoaJuridica();
		p2.setNome("Contrinbuinte 02");
		p2.setRendaBruta(5000);
		p2.setCnpj("61.460.356/0001-00");
		
		PessoaFisica p3 = new PessoaFisica();
		p3.setNome("Contribuinte 03");
		p3.setRendaBruta(2000);
		p3.setCpf("104.656.859-00");
		
		PessoaJuridica p4 = new PessoaJuridica();
		p4.setNome("Contrinbuinte 04");
		p4.setRendaBruta(3000);
		p4.setCnpj("31.882.856/0001-61");
		
		PessoaFisica p5 = new PessoaFisica();
		p5.setNome("Contribuinte 05");
		p5.setRendaBruta(3700);
		p5.setCpf("631.218.720-95");
		
		PessoaJuridica p6 = new PessoaJuridica();
		p6.setNome("Contrinbuinte 06");
		p6.setRendaBruta(4000);
		p6.setCnpj("84.213.505/0001-24");
		
		Contribuinte[] contribuintes = new Contribuinte[6];
		contribuintes[0] = p1;
		contribuintes[1] = p2;
		contribuintes[2] = p3;
		contribuintes[3] = p4;
		contribuintes[4] = p5;
		contribuintes[5] = p6;
		
		for (int i = 0 ; i<contribuintes.length ; i++) {
			System.out.println(contribuintes[i]);
		}
		
	}
	
}
