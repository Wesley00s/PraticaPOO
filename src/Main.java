public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Ford", "Fusion", 2020, 4);
        Veiculo moto = new Moto("Honda", "CBR600", 2019, 600);
        Veiculo caminhao = new Caminhao("Volvo", "FH16", 2021, 20.5);
        Veiculo onibus = new Onibus("Mercedes", "O500", 2022, 50);

        carro.exibirDetalhes();
        moto.exibirDetalhes();
        caminhao.exibirDetalhes();
        onibus.exibirDetalhes();

        carro.mover();
        moto.mover();
        caminhao.mover();
        onibus.mover();
    }
}