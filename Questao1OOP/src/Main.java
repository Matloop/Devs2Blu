public class Main {
    public static void main(String[] args) {
        String[] itensFestaBarbie = {
                "Balões Rosa",
                "Decorações de Glitter",
                "Bolo de Aniversário Rosa",
                "Cupcakes com Temática da Barbie",
                "Refrigerantes Rosa",
                "Pratos e Copos com Estampa da Barbie",
                "Atividades de Pintura",
                "Kit de Maquiagem para Crianças",
                "Doces em Formato de Coração",
                "Playlist com Músicas da Barbie"
        };
        Aluguel aluguel = new Aluguel(500,0);
        Cliente cliente = new Cliente("Marcio", "(47)98876-5345");
        Data data = new Data("15/08/2024","15:30","18:30");
        Endereco endereco = new Endereco("Rua Jericó", "Fortaleza", "Blumenau", "103");
        Tema tema = new Tema("Barbie",itensFestaBarbie,1000,"vermelha");

        
    }
}