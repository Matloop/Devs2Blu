public class Teste {
    private Questao[] questoes;
    private String dataGeracao;

    public Teste(String dataGeracao, Questao[] questoes) {
        this.questoes = questoes;
        this.dataGeracao = dataGeracao;
    }

    public String getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(String dataGeracao) {
        this.dataGeracao = dataGeracao;
    }

    public Questao[] getQuestoes() {
        return questoes;
    }

    public void setQuestoes(Questao[] questoes) {
        this.questoes = questoes;
    }
}
