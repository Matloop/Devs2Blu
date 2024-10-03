public class Questao {
    private String enunciado;
    private int bimestre;
    private String gabarito;
    private Disciplina disciplina;
    private Materia materia;

    public Questao(String enunciado, int bimestre, String gabarito, Disciplina disciplina, Materia materia) {
        this.enunciado = enunciado;
        this.bimestre = bimestre;
        this.gabarito = gabarito;
        this.disciplina = disciplina;
        this.materia = materia;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public int getBimestre() {
        return bimestre;
    }

    public void setBimestre(int bimestre) {
        this.bimestre = bimestre;
    }

    public String getGabarito() {
        return gabarito;
    }

    public void setGabarito(String gabarito) {
        this.gabarito = gabarito;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
}
