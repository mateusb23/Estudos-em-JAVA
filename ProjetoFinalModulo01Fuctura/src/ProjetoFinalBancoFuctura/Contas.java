package ProjetoFinalBancoFuctura;

public abstract class Contas {

    private String numConta;
    private String nome;
    private String cpf;
    private double saldoTotal;
    private int senha;

    public Contas() { }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
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

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public void depositar(double valorDepositado) {
        ContaCorrente.setSaldoCorrente(ContaCorrente.getSaldoCorrente() + valorDepositado);
    }

    public void exibirSaldoTotal() {
        setSaldoTotal(ContaCorrente.getSaldoCorrente() + ContaPoupanca.getSaldoPoupanca());
        System.out.println("Saldo total = " + getSaldoTotal());
    }

}
