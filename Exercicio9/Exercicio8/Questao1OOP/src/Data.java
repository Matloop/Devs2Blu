public class Data {
    String data;
    String inicio;
    String fim;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFim() {
        return fim;
    }

    public void setFim(String fim) {
        this.fim = fim;
    }

    public Data(String data, String inicio, String fim) {
        this.data = data;
        this.inicio = inicio;
        this.fim = fim;

    }
}
