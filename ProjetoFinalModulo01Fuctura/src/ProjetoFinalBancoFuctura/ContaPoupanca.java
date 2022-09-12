package ProjetoFinalBancoFuctura;

public class ContaPoupanca extends ContaCorrente {

    private static double saldoPoupanca;

    public ContaPoupanca() {
        ContaPoupanca.saldoPoupanca = getSaldoTotal() - getSaldoCorrente();
    }

    public static double getSaldoPoupanca() {
        return ContaPoupanca.saldoPoupanca;
    }

    public static void setSaldoPoupanca(double saldoContaPoupanca) {
        ContaPoupanca.saldoPoupanca = saldoContaPoupanca;
    }

    public void resgatar(double valorResgatado) {
        setSaldoCorrente(getSaldoCorrente() + valorResgatado);
        setSaldoPoupanca(getSaldoPoupanca() - valorResgatado);
        System.out.println("Valor resgatado da poupança = " + valorResgatado);
    }

    public void mostrarSaldoPoupanca() {
        System.out.println("Saldo da sua poupança = " + getSaldoPoupanca());
    }

}