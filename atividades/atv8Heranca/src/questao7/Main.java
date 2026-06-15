package questao7;

public class Main {
    public static void main (String[] args) {

        Carro fusca = new Carro("Volkswagen", "Fusca",         1972,  25_000.0, 2);
        Moto  cg = new Moto("Honda",       "CG 160",        2020,  12_000.0, 160);
        Caminhao scania113= new Caminhao("Scania",  "113 Streamline",2018, 280_000.0, 25.0, 4);

        Acessorio peliculaV = new Acessorio("Película 3M",400.0, "Fumê total");
        Acessorio baulMoto  = new Acessorio("Baú traseiro",350.0, "45L impermeável");
        Acessorio rastreador= new Acessorio("Rastreador GPS",900.0, "24h monitorado");

        fusca.adicionarAcessorio(peliculaV);
        cg.adicionarAcessorio(baulMoto);
        scania113.adicionarAcessorio(rastreador);

        Concessionaria concessionariaPresteS = new Concessionaria("Prestes Veículos");
        concessionariaPresteS.adicionarVeiculo(fusca);
        concessionariaPresteS.adicionarVeiculo(cg);
        concessionariaPresteS.adicionarVeiculo(scania113);

        concessionariaPresteS.listarEstoque();
        concessionariaPresteS.removerVeiculo("Celta");
        concessionariaPresteS.listarEstoque();

    }
}
