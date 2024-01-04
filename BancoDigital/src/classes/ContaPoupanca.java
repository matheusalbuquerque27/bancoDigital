package classes;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente, String tipo_conta) {
        super(cliente, tipo_conta);
    }

    public void imprime(){
        System.out.println("Extrato de conta-poupança");
        super.imprimeExtrato();
    }

}