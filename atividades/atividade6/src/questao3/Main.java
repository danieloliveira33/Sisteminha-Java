package questao3;

public class Main {
    public static void main(String[] args) {

        Computador c1 = new Computador("Dell", "Intel Core i7-13700K", 16, 3.4, 32, "DDR5", 1000, "NVMe SSD");
        Computador c2 = new Computador("Lenovo", "AMD Ryzen 5 5600X", 6, 3.7, 16, "DDR4", 500, "SSD");

        c1.exibirConfiguracao();
        System.out.println("===============================================================================");
        c2.exibirConfiguracao();
    }
}