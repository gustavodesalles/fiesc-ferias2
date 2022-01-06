package gerenciaTurmas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Turma {
    private int identificacao;
    private String nome;
    private ArrayList<Disciplina> assuntos;
    private int qtdAlunos;
    private LocalDate dataInicio;
    int numSemana;

    public int getNumSemana() {
        return numSemana;
    }

    public void setNumSemana(int numSemana) {
        this.numSemana = numSemana;
    }

    public Turma(int identificacao, String nome, int qtdAlunos, LocalDate dataInicio) {
        this.identificacao = identificacao;
        this.nome = nome;
        this.qtdAlunos = qtdAlunos;
        this.dataInicio = dataInicio;
        this.assuntos = new ArrayList<>();
        this.numSemana = 0;
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Disciplina> getAssuntos() {
        return assuntos;
    }

    public void setAssuntos(ArrayList<Disciplina> assuntos) {
        this.assuntos = assuntos;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "identificacao=" + identificacao +
                ", nome='" + nome + '\'' +
                ", assuntos=" + assuntos +
                ", qtdAlunos=" + qtdAlunos +
                ", dataInicio=" + dataInicio +
                '}';
    }
}
