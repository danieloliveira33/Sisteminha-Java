import java.math.BigInteger;

public class questao3 {

    public static void main (String[] args){

        BigInteger totalGraos = BigInteger.ZERO;
        BigInteger graosNaCasa = BigInteger.ONE;

        for (int casa = 0; casa < 64; casa++) {

            totalGraos = totalGraos.add(graosNaCasa);
            graosNaCasa = graosNaCasa.multiply(BigInteger.valueOf(2));

        }

        System.out.println("\nTotal de grãos no tabuleiro:");
        System.out.println(totalGraos);

    }
}
