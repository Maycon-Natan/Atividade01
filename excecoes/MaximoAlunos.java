package excecoes;

public class MaximoAlunos  extends Exception{
    private int num;
    
    public MaximoAlunos(int valor){
        System.out.println("A disciplina alcançou o numero maximo de alunos");
        System.out.println("Remova pelo menos " + (valor-60) + "alunos" );
    }

    public int getNum() {
        return num;
    }
}
