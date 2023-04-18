import java.util.ArrayList;
import java.util.Scanner;

import abstracts.Pessoa;
import genericos.Autores;
import interfaces.Conta;
import interfaces.PessoaFisica;
import interfaces.PessoaJuridica;
import normais.Agencia;
import normais.Aluno;
import normais.Banco;
import normais.Coordenador;
import normais.Curso;
import normais.Diretor;
import normais.SecAcademica;
import normais.SecFinanceira;
import normais.Disciplina;
import normais.Faculdade;
import normais.Presidente;
import normais.Professor;
import normais.Gerente;

@Autores(Nome = "Maycon Natan, Jalbert Ramon, João Vitor",
Matricula = "201903268036")

public class Principal {
    static Scanner scan = new Scanner(System.in);

    static ArrayList<PessoaFisica> pessoasFisicas = new ArrayList();
    static ArrayList<PessoaJuridica> pessoasJuridicas = new ArrayList();
    static ArrayList<Pessoa> pessoas = new ArrayList();
    static ArrayList<Coordenador> coordenadores = new ArrayList();
    static ArrayList<Aluno> alunos = new ArrayList();
    static Banco[] bancos= new Banco[1];
    static ArrayList<SecAcademica> secretariosAcademicos = new ArrayList();
    static ArrayList<SecFinanceira> secretariosFinanceiros = new ArrayList();
    static ArrayList<Disciplina> disciplinas = new ArrayList();
    static ArrayList<Presidente> presidentes = new ArrayList();
    static ArrayList<Gerente> gerentes = new ArrayList();
    static ArrayList<Professor> professores = new ArrayList();
    static ArrayList<Conta> contas = new ArrayList();
    static ArrayList<Agencia> agencias = new ArrayList();
    static ArrayList<Diretor> diretores = new ArrayList();

    static ArrayList<Curso> cursos = new ArrayList();
    static Faculdade[] faculdades = new Faculdade[1];



    public static void main(String[] args) throws Exception {
        String[] tiposPessoas = {"Aluno","Professor","Presidente","Diretor","Coordenador",
                            "SecAcademico","secFinanceiro","Gerente"};
        int opI,opF,opP,opB,opA,x;

        Aluno aluno = new Aluno("AlunoDefault", "Default", "Default");
        Professor professor = new Professor("ProfessorDefault", "Default", "Default");
        Presidente presidente = new Presidente("PresidenteDefault", "Default", 123);
        Diretor diretor = new Diretor("DiretorDefault", "DiretorDefault", 123);
        Coordenador coordenador = new Coordenador("CoordenadorDefault", "Default", 123);
        Gerente gerente = new Gerente("GerenteDefault", "Default");
        SecAcademica secAcademica = new SecAcademica("SecAcadDefault", "Default", 123);
        SecFinanceira secFinanceira = new SecFinanceira("SeDefault", "Default", 123);

            Principal.alunos.add(0,aluno);
            Principal.professores.add(0,professor);
            Principal.presidentes.add(0,presidente);
            Principal.diretores.add(0,diretor);
            Principal.coordenadores.add(0,coordenador);
            Principal.gerentes.add(0,gerente);
            Principal.secretariosAcademicos.add(0,secAcademica);
            Principal.secretariosFinanceiros.add(0,secFinanceira);

        //     System.out.println(Principal.alunos.get(0).getNome());
        //     System.out.println(Principal.coordenadores.get(0).getNome());
       

        pessoasFisicas.addAll(alunos);
        pessoasFisicas.addAll(professores);
        pessoasFisicas.addAll(presidentes);
        pessoasFisicas.addAll(diretores);
        pessoasFisicas.addAll(coordenadores);
        pessoasFisicas.addAll(gerentes);
        pessoasFisicas.addAll(secretariosAcademicos);
        pessoasFisicas.addAll(secretariosFinanceiros);

        do{
            Principal.alunos.add(0,aluno);
            Principal.professores.add(0,professor);
            Principal.presidentes.add(0,presidente);
            Principal.diretores.add(0,diretor);
            Principal.coordenadores.add(0,coordenador);
            Principal.gerentes.add(0,gerente);
            Principal.secretariosAcademicos.add(0,secAcademica);
            Principal.secretariosFinanceiros.add(0,secFinanceira);
            
            MenuCriacao();
            System.out.println("Escolha uma opcao:(0 para sair)");
            opI= scan.nextInt();
            
            
            switch(opI){
                case 1:
                {
                    System.out.println("Quantas pessoas deseja criar:");
                    opP= scan.nextInt();
                    
                    System.out.println();
                    
                    for(int i=0; i<opP; i++ ){
                       System.out.print("Escolha um dos:");
                        for(int j=0;j<tiposPessoas.length;j++){
                            System.out.print(j+"."+tiposPessoas[j]+"|");
                        } 
                        x = scan.nextInt();
                        switch(x){
                            case 0:
                            {
                                Metodos.CriarAluno();
                                System.out.println("Criado com sucesso");
                                break;
                            }   
                            case 1:
                            {
                                Metodos.CriarProfessor();
                                System.out.println("Criado com sucesso");
                                break;
                            }
                            case 2:
                            {
                                Metodos.CriarPresidente();
                                System.out.println("Criado com sucesso");
                                break;
                            }
                            case 3:
                            {
                                Metodos.CriarDiretor();
                                System.out.println("Criado com sucesso");
                                break;
                            }
                            case 4:
                            {
                                Metodos.CriarCoord();
                                System.out.println("Criado com sucesso");
                                break;
                            }
                            case 5:
                            {
                                Metodos.CriarSecAC();
                                System.out.println("Criado com sucesso");
                                break;
                            }
                            case 6:
                            {
                                Metodos.CriarSecFN();
                                System.out.println("Criado com sucesso");
                                break;
                            }
                            case 7:
                            {
                                Metodos.CriarGerente();
                                System.out.println("Criado com sucesso");
                                break;
                            }
                            default:
                               System.out.println("Opcao invalida");
                        
                        }
                    }
                    AtualizaPessoaFisica();
                    AtualizaPessoas();
                    break;
                }
                case 2:
                {
                    System.out.print("Escolha um dos:1.Faculdade|2.Curso|3.Disciplina ");
                    opF= scan.nextInt();
                    
                    switch(opF){
                        case 1:
                        {
                            if(faculdades[0]!=null){
                                System.out.println("Ja existe uma faculdade");
                            }else
                                Metodos.CriarFaculdade();
                            break;
                        }
                        case 2:
                        {
                            Metodos.CriarCurso();
                            break;
                        }
                        case 3:
                        {
                            Metodos.CriarDisciplina();
                            break;
                        }
                        default:
                            System.out.println("Opcao invalida");
                    }
                    break;
                }
                case 3:
                {
                    System.out.println("Escolha um dos: 0.Banco | 1.Agencia | 2.Conta ");
                    opB = scan.nextInt();
                    
                    switch(opB){
                        case 0:
                        {
                            if(bancos[0]!=null){
                                System.out.println("Ja existe um banco");
                            }else
                                Metodos.CriarBanco();
                            break;
                        }
                        case 1: 
                        {
                            Metodos.CriarAgencia();
                            break;
                        }
                        case 2:
                        {
                            Metodos.CriarConta();
                            break;
                        }
                    }
                    break;
                }
                case 4:
                {
                    MenuAssociacao();
    
                    System.out.println("Escolha uma opcao:");
                    opA= scan.nextInt();
                    switch(opA){
                        case 1:
                        {
                            Metodos.AssociarFaculdade();
                            break;
                        }
                        case 2:
                        {
                            Metodos.AssociarCurso();
                            break;
                        }
                        case 3:
                        {
                            Metodos.AssociarDisciplina();
                            break;
                        }
                        case 4:
                        {
                            Metodos.AssociarAgencia();
                            break;
                        }
                        case 5:
                        {
                            Metodos.AssociarConta();
                            break;
                        }
                        case 6:
                        {
                            Metodos.AssociarBancos();
                            break;
                        }
                        default: System.out.println("Opcao invalida!");
                    }
                    break;
                }
                case 5:
                {
                    Metodos.Manipular();
                    break;
                }
                default: System.out.println("Opcao invalida!");
            }   
        
          }while(opI!=0); 
            
    
            }

    public static void MenuCriacao(){
        System.out.println("""
                           ====== ABA DE CRIACAO ========
                           |1.Criar pessoas             |
                           |2.Criar faculdade           |
                           |3.Criar bancos              |
                           |4.Associar                  |
                           |5.Manipular                 |
                           ==============================
                           """);
        }

        public static void MenuAssociacao(){
            System.out.println("""
                               ========= ASSOCIAR EM: =========
                               |1.Faculdade        4.Agencia  |
                               |2.Curso            5.Conta    |
                               |3.Disciplina       6.Banco    |
                               ================================
                               """);
        }

        public static void AtualizaPessoaFisica(){
            pessoasFisicas.addAll(alunos);
            pessoasFisicas.addAll(professores);
            pessoasFisicas.addAll(presidentes);
            pessoasFisicas.addAll(diretores);
            pessoasFisicas.addAll(coordenadores);
            pessoasFisicas.addAll(gerentes);
            pessoasFisicas.addAll(secretariosAcademicos);
            pessoasFisicas.addAll(secretariosFinanceiros);
            }
            public static void AtualizaPessoas(){
            pessoas.addAll(alunos);
            pessoas.addAll(professores);
            pessoas.addAll(presidentes);
            pessoas.addAll(diretores);
            pessoas.addAll(coordenadores);
            pessoas.addAll(gerentes);
            pessoas.addAll(secretariosAcademicos);
            pessoas.addAll(secretariosFinanceiros);
            }
}
