public class Main{
    public static void main (String[] args){

        int cont = 0;
        boolean parada = false;
        int n = 1000;

        do{
            n++;
            if (n%11 == 5) {
                cont++;
            }
            if (cont == 5){
                parada = true;
            }

        } while (!parada);

        System.out.println("O 5o numero depois de 1000 com mod de 11 igual a 5 é: " + n);

    }
}