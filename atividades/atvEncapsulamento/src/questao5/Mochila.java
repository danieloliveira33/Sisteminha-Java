package questao5;

public class Mochila {

    private String tipo;
    private String material;
    private double pesoMaximo;
    private boolean aberta;

    public Mochila(String tipo, String material, double pesoMaximo) {
        this.tipo = tipo;
        this.material = material;
        this.pesoMaximo = pesoMaximo;
        this.aberta = false;
    }

    public void mostrarDados() {
        System.out.println("TIPO: " + this.tipo);
        System.out.println("Material: " + this.material);
        System.out.println("Peso Máximo Suportado: " + this.pesoMaximo);
        System.out.println("ESTADO: " + aberta);
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMaterial() {
        return material;
    }

    public boolean getEstado() {
        return aberta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPesoMaximo (double pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public void abrir() {
        if (aberta == true)
            System.out.println("MOCHILA JÁ ESTÁ ABERTA");
        else {
            System.out.println("Abrindo Mochila");
            this.aberta = true;
        }
    }

    public void fechar() {
        if (aberta == false)
            System.out.println("MOCHILA JÁ ESTÁ FECHADA");
        else{
            System.out.println("FECHANDO MOCHILA");
            this.aberta = false;
        }
    }
}
