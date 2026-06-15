package questao2;

public class Main {
    public static void main (String[] args) {

        Carro fusca = new Carro("Volkswagen", "Fusca",   1972, 2);
        Carro uno = new Carro("Fiat",       "Uno",     1995, 4);
        Moto  cg = new Moto("Honda",       "CG 160",  2020, 160);
        Moto  xre = new Moto("Honda",       "XRE 300", 2022, 300);
        Bicicleta oggi = new Bicicleta("Oggi", "7.1",   2023, 21);

        fusca.exibirInfo();
        fusca.acelerar(50);
        fusca.ligarArCondicionado();

        uno.exibirInfo();
        uno.acelerar(60);

        cg.exibirInfo();
        cg.acelerar(50);
        cg.empinar();

        xre.exibirInfo();
        xre.acelerar(70);
        xre.empinar();

        oggi.exibirInfo();
        oggi.acelerar(20);
        oggi.trocarMarcha(5);

    }
}
