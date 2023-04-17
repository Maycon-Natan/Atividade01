package excecoes;

public class MinimoAlunos extends Exception {
    private int num;
    
    public MinimoAlunos(int valor){
        System.out.println("A disciplina alcançou o numero minimo de alunos");
        System.out.println("Adicione pelo menos " + (valor-10) + "alunos" );
    }

    public int getNum() {
        return num;
    }
}
