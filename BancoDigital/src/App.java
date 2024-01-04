import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import classes.Banco;
import classes.Cliente;
import classes.Conta;
import classes.ContaCorrente;
import classes.ContaPoupanca;

public class App {
    public static void main(String[] args) throws Exception {

        boolean working = true;

        Scanner scanner = new Scanner(System.in);
        Banco listaContas = new Banco();


        do{
            System.out.println("Seja bem-vindo ao Banco Quebec!");
            System.out.println("Escolha uma das opções do menu abaixo:");
            System.out.println("----------");
            System.out.println("1 - Criar Conta");
            System.out.println("2 - Ver extrato");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Transferir");
            System.out.println("----------");
            int option = scanner.nextInt();
            

            switch (option) {
                case 1:
                    System.out.println("Thank you for your interest in being our customer!");
                    System.out.println("Please type your name to create you account: ");
                    String name = scanner.next();
                    Cliente cliente = new Cliente(name);
                    
                    System.out.println("Now select the type of your account:");
                    System.out.println("1 - Corrente");
                    System.out.println("2 - Poupança");
                    int type = scanner.nextInt();


                    if(type == 1){
                        
                        Conta contaCriada = new ContaCorrente(cliente, "Corrente");
                        listaContas.adicionarConta(contaCriada);

                        System.out.println("Agora digite o valor do seu primeiro depósito: ");
                        double valor = scanner.nextDouble();
                        contaCriada.depositar(valor);
                        break;

                    } else if (type == 2) {
                        
                        Conta contaCriada = new ContaPoupanca(cliente, "Poupança");
                        listaContas.adicionarConta(contaCriada);

                        System.out.println("Agora digite o valor do seu primeiro depósito: ");
                        double valor = scanner.nextDouble();
                        contaCriada.depositar(valor);
                        break;
                    
                    } else {
                        System.out.println("Número inválido");
                    }
            
                    break;
                
                case 2:

                    System.out.println("Por favor insira o número de sua conta: ");
                    int IDUsuario = scanner.nextInt();
                    List<Conta> lista =  new ArrayList<>(listaContas.getContas());

                    Iterator<Conta> iterator = lista.iterator();
                    
                    while (iterator.hasNext()) {
                        System.out.println("o numero é " + iterator.next().getNumero());
                        int valor = iterator.next().getNumero();
                        if (valor == IDUsuario) {
                            System.out.println("pronto");
                        }
                    }

                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
            
                default:
                    break;
            }

        } while (working != false);
        
      
    }
    
}
