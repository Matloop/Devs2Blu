public class Tema {
    private String tema;
    private String []listaItems;
    private double valorAluguel;
    private String corToalha;
    private Data data;

    public Tema(String tema, String []listaItems, double valorAluguel, String corToalha, Data data) {
        this.tema = tema;
        this.listaItems = listaItems;
        this.valorAluguel = valorAluguel;
        this.corToalha = corToalha;
        this.data = data;
    }
    public Data getData() {
        return data;
    }
    public void setData(Data data) {
        this.data = data;
    }
    public String getCorToalha() {
        return corToalha;
    }

    public void setCorToalha(String corToalha) {
        this.corToalha = corToalha;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public String[] getListaItems() {
        return listaItems;
    }

    public void setListaItems(String[] listaItems) {
        this.listaItems = listaItems;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }


}
