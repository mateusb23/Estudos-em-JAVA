package com.loiane.cursojava.aula36exercicios;

public class Teste {
	
	public Teste() { }

	public static void main(String[] args) {
		
		Agenda pessoa1 = new Agenda();
		
		Contato contato1 = new Contato();
		contato1.setNome("Mateus");
		
		Telefone tel1Pessoa1 = new Telefone();
		tel1Pessoa1.setFixo(true);
		tel1Pessoa1.setDdd("81");
		tel1Pessoa1.setNumero("998964394");
		
		Telefone tel2Pessoa1 = new Telefone();
		tel2Pessoa1.setFixo(false);
		tel2Pessoa1.setDdd("81");
		tel2Pessoa1.setNumero("981757213");
		
		Telefone tel3Pessoa1 = new Telefone();
		tel3Pessoa1.setFixo(true);
		tel3Pessoa1.setDdd("81");
		tel3Pessoa1.setNumero("993463776");
		
		Telefone[] telefones = new Telefone[3];
		telefones[0] = tel1Pessoa1;
		telefones[1] = tel2Pessoa1;
		telefones[2] = tel3Pessoa1;
		
		contato1.setTelefones(telefones);
		
		contato1.setEmail("mateusb.bispo@gmail.com");
		
		Endereco endereco = new Endereco();
		endereco.setRua("Rua Caracituba");
		endereco.setNumeroCasa("75");
		endereco.setBairro("São José");
		endereco.setCidade("Recife");
		endereco.setEstado("Pernambuco");
		endereco.setPais("Brasil");
		
		contato1.setEndereco(endereco);
		
		pessoa1.setContato(contato1);
		
		if (pessoa1 != null && pessoa1.getContato().getNome() != null) {
			System.out.println(pessoa1.getContato().getNome());
		}
		
		if (contato1 != null && contato1.getTelefones() != null) {
			for (int i = 0 ; i < telefones.length ; i++) {
				System.out.println((i+1) + "- " + telefones[i].isFixo() + " - " + telefones[i].getDdd() + " - " + telefones[i].getNumero());
			}
		}
		
		if (pessoa1 != null && pessoa1.getContato().getEmail() != null) {
			System.out.println(pessoa1.getContato().getEmail());
		}
		
		if (pessoa1 != null && pessoa1.getContato().getEndereco().getRua() != null) {
			System.out.println(pessoa1.getContato().getEndereco().getRua());
		}
		
		if (pessoa1 != null && pessoa1.getContato().getEndereco().getNumeroCasa() != null) {
			System.out.println(pessoa1.getContato().getEndereco().getNumeroCasa());
		}
		
		
		
	}

}
