package ProjetoFinalBancoFuctura;

public abstract class Contas {

    private int numConta;
    private String nome;
    private String cpf;
    private double saldoTotal;

    public Contas() { }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldo) {
        this.saldoTotal = saldo;
    }

    public void depositar(double valorDepositado) {
        ContaCorrente.setSaldoCorrente(ContaCorrente.getSaldoCorrente() + valorDepositado);
    }

    public void exibirSaldoTotal() {
        setSaldoTotal(ContaCorrente.getSaldoCorrente() + ContaPoupanca.getSaldoPoupanca());
        System.out.println("Saldo total = " + getSaldoTotal());
    }

}

