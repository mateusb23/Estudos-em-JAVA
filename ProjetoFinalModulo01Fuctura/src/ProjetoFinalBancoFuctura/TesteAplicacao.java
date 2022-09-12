package ProjetoFinalBancoFuctura;

import java.util.Scanner;

public class TesteAplicacao extends ContaPoupanca{

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ContaPoupanca usuario1 = new ContaPoupanca();

        System.out.println("O depósito será feito na conta corrente ou na poupança? ");
        String escolhaDeposito = teclado.next().toLowerCase();
        if (escolhaDeposito.equals("poupanca")) {
            System.out.println("Qual valor deseja depositar ? ");
            double valorDeposito = teclado.nextDouble();
            usuario1.depositar(valorDeposito);
            usuario1.aplicarNaPoupanca(valorDeposito);
        } else {
            System.out.println("Qual valor deseja depositar ? ");
            double valorDeposito = teclado.nextDouble();
            usuario1.depositar(valorDeposito);
        }

        /*System.out.println("Qual valor deseja depositar ?");
        double valorDeposito = 550;

        usuario1.depositar(valorDeposito);*/
        usuario1.exibirSaldoTotal();

        usuario1.mostrarSaldoCorrente();
        usuario1.mostrarSaldoPoupanca();
        usuario1.aplicarNaPoupanca(200);
        usuario1.exibirSaldoTotal();

        usuario1.mostrarSaldoCorrente();
        usuario1.mostrarSaldoPoupanca();
        usuario1.resgatar(150);
        usuario1.exibirSaldoTotal();

        usuario1.sacar(50);

        usuario1.mostrarSaldoPoupanca();
        usuario1.mostrarSaldoCorrente();
        usuario1.exibirSaldoTotal();

    }

}
