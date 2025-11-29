package org.example;

public class Admin extends Pessoa {

    public Admin(String nome, int CPF, int idade, boolean criveis, char sexo, int matricula) {
        super(nome, CPF, idade, criveis, sexo, matricula);
    }

    public Professor cadastrarProfessor(String nome, int CPF, int idade, char sexo, int matricula) {
        Professor novoProf = new Professor(nome, CPF, idade, true, sexo, matricula);
        novoProf.definirNovaSenha("12345");
        return novoProf;
    }

    public Aluno cadastrarAluno(String nome, int CPF, int idade, char sexo, int matricula) {
        Aluno novoAluno = new Aluno(nome, CPF, idade, true, sexo, matricula);
        novoAluno.definirNovaSenha("12345");
        return novoAluno;
    }

    public Turma criarTurma(Professor prof, String nomeDisc, String codigoTurma, String semestre, int creditos, String hor1, String hor2, PlanoDeEnsino plano, String codigoDisciplina) {
        return new Turma(prof, nomeDisc, codigoTurma, semestre, creditos, hor1, hor2, plano, codigoDisciplina);
    }

    public void matricularAlunoEmTurma(Aluno aluno, Turma turma) {
        turma.adicionarAluno(aluno);
        System.out.println("Admin: Aluno matriculado com sucesso.");
    }


}