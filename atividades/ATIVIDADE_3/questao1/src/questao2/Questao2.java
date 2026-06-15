package questao2;

public class Questao2 {
    public static void main (String[] args) {

        Produto p1 = new Produto();
        Produto p2 = new Produto();

        p1.nome = "sabonete";
        p1.codigo = 123456;
        p1.status = true;
        p1.qtdEstoque = 398;
        p1.preco = 13.99;

        p2.nome = "carne da boa";
        p2.codigo = 892832;
        p2.status = false;
        p2.qtdEstoque = -398;
        p2.preco = 913.99;

        System.out.println("=============| Produto 1 |=============");
        p1.status();
        p1.mostrarQtd();
        p1.dados();

        System.out.println("=============| Produto 2 |=============");
        p2.status();
        p2.mostrarQtd();
        p2.dados();
    }

}
