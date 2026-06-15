package questao6;

import java.util.ArrayList;
import java.util.List;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double preco;
    private List<Acessorio> acessorios;

    public Veiculo(String marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
        this.acessorios = new ArrayList<>();
    }

    public void adicionarAcessorio(Acessorio acessorio) {
        acessorios.add(acessorio);
        System.out.println("ACESSORIO ADICIONADO: " + acessorio.getNome() + " | PRECO: R$ " + acessorio.getPreco());
    }

    public void removerAcessorio(Acessorio acessorio) {
        if (acessorios.remove(acessorio)) {
            System.out.println("ACESSORIO REMOVIDO: " + acessorio.getNome());
        } else {
            System.out.println("ACESSORIO NAO ENCONTRADO: " + acessorio.getNome());
        }
    }

    public void exibirVeiculo() {
        System.out.println("VEICULO: " + marca + " " + modelo + " | ANO: " + ano + " | PRECO BASE: R$ " + preco);
        if (acessorios.isEmpty()) {
            System.out.println("  SEM ACESSORIOS.");
        } else {
            for (Acessorio a : acessorios) {
                System.out.println("  ACESSORIO: " + a.getNome() + " | R$ " + a.getPreco());
            }
        }
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAno() { return ano; }
    public double getPreco() { return preco; }
}
