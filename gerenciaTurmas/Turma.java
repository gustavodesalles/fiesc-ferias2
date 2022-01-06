package gerenciaTurmas;

import java.time.LocalDate;
import java.util.HashMap;

public class Turma {
    private int identificacao;
    private String nome;
    private HashMap<Integer, Disciplina> assuntos;
    private int qtdAlunos;
    private LocalDate dataInicio;

    public Turma(int identificacao, String nome, int qtdAlunos, LocalDate dataInicio) {
        this.identificacao = identificacao;
        this.nome = nome;
        this.qtdAlunos = qtdAlunos;
        this.dataInicio = dataInicio;
        for (int i = 1; i <= 52; i++) {
            this.assuntos.put(i, null);
        }
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

    public HashMap<Integer, Disciplina> getAssuntos() {
        return assuntos;
    }

    public void setAssuntos(HashMap<Integer, Disciplina> assuntos) {
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
