package questao3;

public class Equacao {

    private double coefA;
    private double coefB;
    private double coefC;
    private double delta;
    private double raiz1;
    private double raiz2;
    private double reultado;

    public Equacao (double coefA, double coefB, double coefC) {
        if (coefA == 0)
            this.coefA = 1;
        else
            this.coefA = coefA;
        this.coefB = coefB;
        this.coefC = coefC;
    }

    public void mostrarResultado() {
        System.out.println("==============| RESULTADO |==============");
        System.out.println( "DELTA = " + this.calculoDelta());
        System.out.println("--------| Raízes |-------");
        System.out.println("Raiz 1 = " + this.calculoRaiz1());
        System.out.println("Raiz 2 = " + calculoRaiz2());
    }

    private double calculoDelta () {
        this.delta = (coefB * coefB) - 4 * (coefA * coefC);
        return this.delta;
    }

    private double calculoRaiz1 () {
        this.raiz1 = ((coefB * -1) + Math.sqrt(this.delta)) / (2 * this.coefA);
        return raiz1;
    }

    private double calculoRaiz2() {
        this.raiz2 = ((coefB * -1) - Math.sqrt(this.delta)) / (2 * this.coefA);
        return raiz2;
    }



}
