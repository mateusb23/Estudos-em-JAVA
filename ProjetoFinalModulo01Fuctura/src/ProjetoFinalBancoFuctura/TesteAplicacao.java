package ProjetoFinalBancoFuctura;

import java.util.Scanner;

public class TesteAplicacao extends ContaPoupanca{

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ContaPoupanca usuario1 = new ContaPoupanca();

        System.out.println("-------------INICIANDO CRIAÇÃO DA SUA CONTA-------------");

        System.out.println("Infome o seu nome completo: ");
        String nomeCompleto = teclado.nextLine();
        usuario1.setNome(nomeCompleto);

        System.out.println("Informe o número da sua conta no padrão 0000-0: ");
        String numeroConta = teclado.next();
        usuario1.setNumConta(numeroConta);

        System.out.println("----------------------------------------------------------");

        System.out.println("Infome o seu cpf: ");
        String cpf1 = teclado.next();
        usuario1.setCpf(cpf1);

        System.out.print("Crie uma senha numérica de 4 dígitos(NÃO PODE COMEÇAR COM ZERO): ");
        int senhaUsuario = teclado.nextInt();
        while (senhaUsuario < 1000 || senhaUsuario > 9999) {
            System.out.println("A senha não se encaixa nos padrão indicado."
                    + "\n Digite uma senha válida com 4 dígitos numéricos: ");
            senhaUsuario = teclado.nextInt();
        }
        usuario1.setSenha(senhaUsuario);

        System.out.println("----------------------------------------------------------");

        System.out.println("Deseja depositar alguma quantia na conta? (S/N)");
        String resposta = teclado.next().toLowerCase();

        if (resposta.equals("s")) {

            System.out.println("Qual valor deseja depositar na Conta? ");
            double valorDeposito = teclado.nextDouble();
            usuario1.depositar(valorDeposito);
            usuario1.mostrarSaldoCorrente();

        } else {
            usuario1.mostrarSaldoCorrente();
        }

        System.out.println("----------------------------------------------------------");
        System.out.printf("-------------CRIAMOS A SUA CONTA, SR(A). %s -------------", usuario1.getNome());
        System.out.println("\n----------------------------------------------------------");

        boolean retornamenu = true;
        while (retornamenu) {

            System.out.println("""
            _______________________________________________________________________
            |                             FUCTURA BANK                            |
            |---------------------------------------------------------------------|
            |                                 MENU                                |
            |=====================================================================|
            |||                                                                 |||
            |||                                                                 |||
            |||        ESCOLHA A OPÇÃO QUE DESEJA, LOGO ABAIXO, PARA:\s          |||
            |||                                                                 |||   
            |||                                                                 |||
            |||         1 - Consultar dados da sua conta                        |||
            |||                                                                 |||
            |||         2 - Realizar um depósito na conta                       |||
            |||                                                                 |||
            |||         3 - Aplicar na poupanca                                 |||
            |||                                                                 |||
            |||         4 - Resgatar valor da Poupança                          |||
            |||                                                                 |||
            |||         5 - Realizar um saque                                   |||
            |||                                                                 |||
            |||         6 - Finalizar aplicativo                                |||
            |||                                                                 |||        
            |||                                                                 |||
            |=====================================================================|
            |                   O BANCO QUE PENSA NO SEU FUTURO                   |
            |=====================================================================|""");

            int opcoes = teclado.nextInt();

            switch (opcoes) {
                case 1:
                    System.out.print("Informe o seu cpf: ");
                    String confcpf = teclado.next();
                    if (confcpf.contentEquals(usuario1.getCpf())) {
                        System.out.println("Nome: " + usuario1.getNome());
                        System.out.println("Número da conta: " + usuario1.getNumConta());
                    } break;

                case 2:
                    System.out.print("Informe o seu cpf: ");
                    confcpf = teclado.next();
                    if (confcpf.contentEquals(usuario1.getCpf())) {

                        System.out.println("Conta: " + usuario1.getNumConta());
                        System.out.println("Digite sua senha de 4 dígitos: ");
                        int confsenha = teclado.nextInt();

                    if (confsenha == usuario1.getSenha()) {
                        System.out.println("-------ENTROU-------");

                            System.out.println("Qual valor deseja depositar na Conta? ");
                            double valorDeposito = teclado.nextDouble();
                            usuario1.depositar(valorDeposito);
                            usuario1.mostrarSaldoCorrente();

                    } else if (confsenha != usuario1.getSenha()) {
                        System.out.println("SENHA INCORRETA"
                                + "TENTE NOVAMENTE: ");
                        confsenha = teclado.nextInt();

                        if (confsenha == usuario1.getSenha()) {
                            System.out.println("-------ENTROU-------");

                            System.out.println("Qual valor deseja depositar na Conta? ");
                            double valorDeposito = teclado.nextDouble();
                            usuario1.depositar(valorDeposito);
                            usuario1.mostrarSaldoCorrente();

                        } else {
                            System.out.println("TENTATIVAS ESGOTADAS, PROCESSO ENCERRADO!");
                            System.out.println("VOCÊ ERROU DUAS VEZES !!!");
                        }
                    } else {
                        System.out.println("RETORNANDO AO MENU PRINCIPAL!");
                    }
                } break;

                case 3:
                    System.out.print("Informe a sua Senha: ");
                    int confsenha = teclado.nextInt();

                    if (confsenha == usuario1.getSenha()) {
                        System.out.println("-------ENTROU-------");

                        System.out.println("Quanto deseja aplicar na Poupança? ");
                        double valorDeposito = teclado.nextDouble();
                        usuario1.depositar(valorDeposito);
                        usuario1.aplicarNaPoupanca(valorDeposito);
                        usuario1.mostrarSaldoPoupanca();

                    } else if (confsenha != usuario1.getSenha()) {
                        System.out.println("SENHA INCORRETA"
                                + "TENTE NOVAMENTE: ");
                        confsenha = teclado.nextInt();

                        if (confsenha == usuario1.getSenha()) {
                            System.out.println("-------ENTROU-------");

                            System.out.println("Quanto deseja aplicar na Poupança? ");
                            double valorDeposito = teclado.nextDouble();
                            usuario1.depositar(valorDeposito);
                            usuario1.aplicarNaPoupanca(valorDeposito);
                            usuario1.mostrarSaldoPoupanca();

                        } else {
                            System.out.println("TENTATIVAS ESGOTADAS, PROCESSO ENCERRADO!");
                            System.out.println("VOCÊ ERROU DUAS VEZES !!!");
                        }
                    } else {
                        System.out.println("RETORNANDO AO MENU PRINCIPAL!");

                    } break;

                case 4:
                    System.out.print("Informe a sua Senha: ");
                    confsenha = teclado.nextInt();

                    if (confsenha == usuario1.getSenha()) {
                        System.out.println("-------ENTROU-------");

                        System.out.println("Quanto deseja resgatar da Poupança? ");
                        double valorResgatado = teclado.nextDouble();

                        while (valorResgatado > usuario1.getSaldoPoupanca()) {
                            System.out.println("O valor é superior ao saldo atual da Poupança." +
                                    "\nTente novamente com um valor diferente: ");
                            valorResgatado = teclado.nextDouble();
                        }
                        usuario1.resgatar(valorResgatado);
                        usuario1.mostrarSaldoPoupanca();

                    } else if (confsenha != usuario1.getSenha()) {
                        System.out.println("SENHA INCORRETA"
                                + "TENTE NOVAMENTE: ");
                        confsenha = teclado.nextInt();

                        if (confsenha == usuario1.getSenha()) {
                            System.out.println("-------ENTROU-------");

                            System.out.println("Quanto deseja resgatar da Poupança? ");
                            double valorResgatado = teclado.nextDouble();

                            while (valorResgatado > usuario1.getSaldoPoupanca()) {
                                System.out.println("O valor é superior ao saldo atual da Poupança." +
                                        "\nTente novamente com um valor diferente: ");
                                valorResgatado = teclado.nextDouble();
                            }
                            usuario1.resgatar(valorResgatado);
                            usuario1.mostrarSaldoPoupanca();

                        } else {
                            System.out.println("TENTATIVAS ESGOTADAS, PROCESSO ENCERRADO!");
                            System.out.println("VOCÊ ERROU DUAS VEZES !!!");
                        }
                    } else {
                        System.out.println("RETORNANDO AO MENU PRINCIPAL!");

                    }break;

                case 5:
                    System.out.print("Informe o seu cpf: ");
                    confcpf = teclado.next();

                    if (confcpf.contentEquals(usuario1.getCpf())) {
                        System.out.println("Conta: " + usuario1.getNumConta());
                        System.out.println("Digite sua senha de 4 dígitos: ");
                        confsenha = teclado.nextInt();

                        if (confsenha == usuario1.getSenha()) {

                            System.out.println("-------ENTROU-------");
                            System.out.print("Insira o valor do saque: ");
                            double valorSaque = teclado.nextDouble();

                            if (valorSaque > getSaldoCorrente()) {
                                System.out.println("Saque impossível, o seu saldo é inferior a este valor desejado");

                                if (getSaldoPoupanca() > valorSaque) {
                                    System.out.println("Deseja regatar esse valor da Poupança? Digite (S/N) ");
                                    resposta = teclado.next().toLowerCase();

                                    if (resposta.equals("s")) {
                                        usuario1.resgatar(valorSaque);
                                        usuario1.mostrarSaldoCorrente();
                                    } else  {
                                        System.out.println("Retornando ao Menu");
                                        valorSaque = 0;
                                        break;
                                    }

                                } else {

                                    break;
                                }

                            }

                            usuario1.sacar(valorSaque);
                            usuario1.mostrarSaldoCorrente();

                        } else if (confsenha != usuario1.getSenha()) {
                            System.out.println("SENHA INCORRETA"
                                    + "TENTE NOVAMENTE: ");
                            confsenha = teclado.nextInt();

                            if (confsenha == usuario1.getSenha()) {
                                System.out.println("-------ENTROU-------");
                                System.out.print("Insira o valor do saque: ");
                                double valorSaque = teclado.nextDouble();
                                while (valorSaque > usuario1.getSaldoCorrente()) {
                                    System.out.println("Saque impossível, o seu saldo é inferior a este valor desejado");
                                    System.out.print("Insira o valor do saque: ");
                                    valorSaque = teclado.nextDouble();
                                }
                                usuario1.sacar(valorSaque);
                                usuario1.mostrarSaldoCorrente();

                            } else {

                                System.out.println("TENTATIVAS ESGOTADAS, APLICATIVO ENCERRADO!");
                                System.out.println("VOCÊ ERROU DUAS VEZES !!!");
                            }

                        } else {
                            System.out.println("APLICATIVO ENCERRADO!");
                        }
                    } break;

                case 6:
                    System.out.println("SAINDO DO SISTEMA!!!");
                    usuario1.mostrarSaldoCorrente();
                    usuario1.mostrarSaldoPoupanca();
                    usuario1.exibirSaldoTotal();
                    retornamenu = false;
                    break;

                default:
                    System.out.println("FIM");
            }

            System.out.println("\nOPERAÇÃO FINALIZADA");
            System.out.println("\nOBRIGADO, ATÉ LOGO");
        }

    }

}
