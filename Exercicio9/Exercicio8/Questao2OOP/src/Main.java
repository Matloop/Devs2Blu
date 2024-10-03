public class Main {
    public static void main(String[] args) {
        Questao questao = new Questao("Quanto é 3 + 2?", 1, "5", null, null);
        Questao[] questoes = new Questao[]{questao};

        // Extrair gabaritos ou enunciados para String[]
        String[] questoesObjetivas = new String[questoes.length];
        for (int i = 0; i < questoes.length; i++) {
            questoesObjetivas[i] = questoes[i].getEnunciado(); // ou getGabarito(), conforme necessário
        }

        int[] bimestres = new int[]{1, 2};
        String[] materias = new String[]{"Matematica", "Matemática"};
        Disciplina disciplina = new Disciplina(questoesObjetivas, bimestres, materias, "5,4");

        Teste teste = new Teste("10/05/2022", questoes);
    }
}
