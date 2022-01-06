package gerenciaTurmas;

public class Disciplina {
    private String nomeDisciplina;
    private String docente;

    public Disciplina(String nomeDisciplina, String docente) {
        this.nomeDisciplina = nomeDisciplina;
        this.docente = docente;
    }

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.docente = "TBD";
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
}
