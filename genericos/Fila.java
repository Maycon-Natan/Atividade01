package genericos;

import java.util.ArrayList;

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
            return null;
        }

        return arrey.remove(arrey.size()-1);
    }
    
}
