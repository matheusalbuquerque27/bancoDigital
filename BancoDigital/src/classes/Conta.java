package classes;

public abstract class Conta implements IConta{
    
    protected int numero;
    protected int agencia;
    protected double saldo;
    private static int AGENCIA_STANDARD = 1;
    private int sequencial = 1;
    private Cliente cliente;
    public String tipo_conta = "";

    public Conta(Cliente cliente, String tipo_conta){

        this.numero = sequencial++;
        this.agencia = Conta.AGENCIA_STANDARD;
        this.cliente = cliente;
        this.tipo_conta = tipo_conta;

    }

    /*
    * 
    * Getters and Setters
    * 
    * It's not necessary to utilize setters for external users
    *
    */
    
    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getTipo_conta() {
        return tipo_conta;
    }

    /**
     * 
     * Métodos
     * 
     */

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        
    }
    
    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
        
    }

    @Override
    public void transferir(double valor, Conta destinatario) {
        this.sacar(valor);
        destinatario.depositar(valor);

    }


    public void imprimeExtrato() {
        
        System.out.println("--------------");
        System.out.println("Agência : " + agencia);
        System.out.println("Conta " + numero);
        System.out.println("Cliente: " + cliente.getName());
        System.out.println(String.format("Saldo: R$ %.2f", saldo));
        
    }

    

}
