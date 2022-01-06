package gerenciaTurmas;

public class Disciplina {
    private String nomeDisciplina;
    private Docente docente;

    public Disciplina(String nomeDisciplina, Docente docente) {
        this.nomeDisciplina = nomeDisciplina;
        this.docente = docente;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }
}
