package org.example;

public class DisciplinaCursada {
    private String nomeDisciplina;
    private double notafinal;
    private double N1;
    private double N2;
    private int faltas;
    private String semestre; // Ex: "2025.1"
    private boolean finalizada;
    private double AI;
    private String status;
    private int aulasPrevistas;
    private int creditos;
    private String codigodisciplina;
    private String turma;
    private String horario;
    private String horario2;
    private PlanoDeEnsino resumo;

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public DisciplinaCursada(String nomeDisciplina, String semestre, int creditos, String codigodisciplina, String turma, String horario, String horario2, PlanoDeEnsino resumo) {
        this.nomeDisciplina = nomeDisciplina;
        this.semestre = semestre;
        this.creditos = creditos;
        this.faltas = 0;
        this.finalizada = false;
        this.status = "Cursando";
        this.aulasPrevistas = creditos * 20;
        this.codigodisciplina = codigodisciplina;
        this.turma = turma;
        this.horario = horario;
        this.horario2 = horario2;
        this.resumo = resumo;
    }

    public void adicionarN1(double valor) {
        if (valor > 10 || valor < 0) {
            return;
        }
        N1 = valor;
    }

    public String getTurma() {
        return turma;
    }

    public void adicionarN2(double valor) {
        if (valor > 10 || valor < 0) {
            return;
        }
        N2 = valor;
    }

    public void adicionarAI(double valor) {
        if (valor > 1 || valor < 0) {
            return;
        }
        AI = valor;
    }

    public void adicionarFalta() {
        faltas += 2;
    }

    public DisciplinaCursada finalizarDisciplina() {
        notafinal = N1 * 0.4 + ((N2 * 0.9 + AI) * 0.6);
        finalizada = true;
        if (notafinal >= 6.0 && faltas <= (aulasPrevistas * 0.25)) {
            status = "Aprovado";
        } else if (notafinal >= 6.0 && faltas > (aulasPrevistas * 0.25)) {
            status = "Reprovado por falta";
        } else {
            status = "Reprovado";
        }
        return this;
    }

    public void meuPlano() { // Plano de ensino
        System.out.printf("Professor responsável: %s | Código da turma : %s\nDescrição: %s\n",
                resumo.getResponsavel().getNome(), turma, resumo.getDescricao());
    }

    public void meuHorario() {
        System.out.printf("%s\n%s\n", horario, horario2);
    }

    @Override
    public String toString() {
        return String.format("Código da disciplina : %s | Matéria: %s | Turma: %s | Nota1: %.1f | Nota2: %.1f | Faltas: %d",
                codigodisciplina, nomeDisciplina, turma, N1, N2, faltas);
    }

    public String Historico() {
        return String.format("%s | %s | %s | %.1f | %d | %s",
                codigodisciplina, nomeDisciplina, semestre, notafinal, creditos, status);
    }

    public String getCodigodisciplina() {
        return codigodisciplina;
    }
}