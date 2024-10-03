public class Disciplina {
    private String[] questoesObjetivas;
    private int[] bimestres;
    private String[] materias;
    private String gabarito;

    public Disciplina(String[] questoesObjetivas, int[] bimestres, String[] materias, String gabarito) {
        this.questoesObjetivas = questoesObjetivas;
        this.bimestres = bimestres;
        this.materias = materias;
        this.gabarito = gabarito;
    }

    public String[] getQuestoesObjetivas() {
        return questoesObjetivas;
    }

    public void setQuestoesObjetivas(String[] questoesObjetivas) {
        this.questoesObjetivas = questoesObjetivas;
    }

    public int[] getBimestres() {
        return bimestres;
    }

    public void setBimestres(int[] bimestres) {
        this.bimestres = bimestres;
    }

    public String[] getMaterias() {
        return materias;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }

    public String getGabarito() {
        return gabarito;
    }

    public void setGabarito(String gabarito) {
        this.gabarito = gabarito;
    }
}
