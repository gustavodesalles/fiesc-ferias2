package gerenciaTurmas;

import java.util.ArrayList;

public class Docente {
    private int idNum;
    private String nome;
    private Turma turmaAtual;
    private ArrayList<Disciplina> disciplinas;

    public Docente(int idNum, String nome) {
        this.idNum = idNum;
        this.nome = nome;
        this.turmaAtual = null;
        this.disciplinas = null;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Turma getTurmaAtual() {
        return turmaAtual;
    }

    public void setTurmaAtual(Turma turmaAtual) {
        this.turmaAtual = turmaAtual;
    }

    @Override
    public String toString() {
        return "Docente{" +
                "nome='" + nome + '\'' +
                ", disciplinas=" + disciplinas +
                '}';
    }
}
