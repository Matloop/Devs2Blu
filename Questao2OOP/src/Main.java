//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] questoes = new String[]{"Quanto é 3 + 2?", "Quanto é 2 + 2?"};
        int[] bimestres = new int[]{1, 2};
        String[] materias = new String[]{"Matematica", "Matemática"};
        Disciplina disciplina = new Disciplina(questoes, bimestres, materias, "5,4");
        Teste teste = new Teste(questoes, "10/05/2022", "Matematica");
        Questao questao = new Questao("Quanto é 3 + 2?", 1, "5", "Matematica");
    }
}