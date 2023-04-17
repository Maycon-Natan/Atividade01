package normais;

import java.util.ArrayList;

import excecoes.MaximoAlunos;
import excecoes.MinimoAlunos;

public class Disciplina {
    private String nome;
    private String sala;
    private Professor professor;
    private final ArrayList<Aluno> alunos= new ArrayList();
    
    public Disciplina(String nome, String sala) {
        this.nome = nome;
        this.sala = sala;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void addAluno(Aluno aluno) throws Exception {
        if( alunos.size()< 10){
            throw  new MinimoAlunos(alunos.size());
        }else
            alunos.add(aluno);
    }
    public void removeAluno(Aluno aluno) throws Exception{
        if( alunos.size()> 60){
            throw new MaximoAlunos(alunos.size());
        }else
            alunos.remove(aluno);
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
