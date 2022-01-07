package gerenciaTurmas;

public class Disciplina {
    private String nomeDisciplina;
    private String docente;
    private int semana;

    public Disciplina(String nomeDisciplina, int semana) {
        this.nomeDisciplina = nomeDisciplina;
        this.docente = "TBD";
        this.semana = semana;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public int getSemana() {
        return semana;
    }

    public void setSemana(int semana) {
        this.semana = semana;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nomeDisciplina='" + nomeDisciplina + '\'' +
                ", docente='" + docente + '\'' +
                ", semana=" + semana +
                '}';
    }
}
