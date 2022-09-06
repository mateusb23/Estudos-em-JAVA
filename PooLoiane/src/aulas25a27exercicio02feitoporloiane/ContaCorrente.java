package aulas25a27exercicio02feitoporloiane;

public class ContaCorrente {

    String numero;
    String agencia;
    boolean especial;
    double limiteEspecial;
    double valorEspecialUsado;
    double saldo;

    boolean realizarSaque(double quantiaASacar) {   // MÉTODO COM RETORNO E COM PARÂMETRO

        // tem saldo na conta
        if (saldo >= quantiaASacar) {
            saldo -= quantiaASacar;
            return true;
        } else { // não tem saldo na conta
            if (especial) {   // eu poderia ter colocado if (especial == true) {
                // verificar se o limite especial tem saldo
                double limite = limiteEspecial + saldo;
                if (limite >= quantiaASacar) {
                    saldo -= quantiaASacar;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false; // não é especial e não tem saldo suficiente
            }
        }
    }

    /* OBS: ->IMPORTANTE<- QUANDO USA-SE O return, tudo aquilo que estiver abaixo dele
    *         será descartado/desconsiderado.
    * */
    void depositar(double valorDepositado) {
        saldo += valorDepositado;
    }

    void consultarStatus() {
        System.out.println();
        System.out.println("----------STATUS DA CONTA----------");
        System.out.println("Número da conta: " + numero);
        System.out.println("O número da sua agência: " + agencia);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("É Especial: " + especial);
        System.out.println("Limite atual do cheque especial: " + limiteEspecial);
    }

    boolean verificarUsoChequeEspecial() {

        return saldo < 0;
    }
}
