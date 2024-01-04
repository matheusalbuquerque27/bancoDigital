package classes;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente, String tipo_conta) {
        super(cliente, tipo_conta);
    }

    public void imprime(){
        System.out.println("Extrato de conta-corrente");
        super.imprimeExtrato();
    }

}