package gerenciaTurmas;

import java.util.ArrayList;

public class Docente {
    private int idNum;
    private String nome;
    private String turmaAtual;
    private ArrayList<Disciplina> disciplinas;

    public Docente(int idNum, String nome) {
        this.idNum = idNum;
        this.nome = nome;
        this.turmaAtual = "";
        this.disciplinas = new ArrayList<>();
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

    public void setTurmaAtual(String turmaAtual) {
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
