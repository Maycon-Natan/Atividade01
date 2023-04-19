package genericos;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Fila<Pessoa> {
    private final ArrayList<Pessoa> arrey;
    
    public Fila(){
        arrey = new ArrayList();
    }
    
    public void enfileirar(Pessoa item){
        arrey.add(item);
        for(Pessoa elemento:arrey){
            System.out.println(elemento);
            
        }
    }
    
    public Pessoa encerrarAtendimento(){
        if(arrey.isEmpty()){
            System.out.println("A fila esta vazia");
            throw new EmptyStackException();
        }
        System.out.println("Atendendo " + arrey.get(arrey.size()).toString());
        return arrey.remove(arrey.size()-1);
    }
    
}
