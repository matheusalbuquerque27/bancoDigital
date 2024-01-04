package classes;

import java.util.List;
import java.util.ArrayList;

public class Banco {

    private String nome;
    public List<Conta> contasLista = new ArrayList<>();

    public void adicionarConta(Conta conta) {
       
        contasLista.add(conta);

    }

    public List<Conta> getContas() {
        return contasLista;
    }

    
    
}
