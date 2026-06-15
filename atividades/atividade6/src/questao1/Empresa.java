package questao1;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    List<Funcionario> funcionarios;

    private String nome;
    private String cnpj;

    public Empresa (String nome, String cnpj) {

        funcionarios = new ArrayList<>();
        this.nome = nome;
        this.cnpj = cnpj;
    }

    //=========================================================================================
    public void contratar(Funcionario newFuncionario) {
        funcionarios.add(newFuncionario);
        System.out.println("FUNCIONARIO CONTRATADO: " + newFuncionario.getNome() + " | CPF: " + newFuncionario.getCpf() + " | CADASTRO: " + newFuncionario.getIdFuncionario());
    }

    public void demitir(Funcionario tchauFuncionario) {
        if (funcionarios.remove(tchauFuncionario)) {
            System.out.println("FUNCIONARIO DEMITIDO: " + tchauFuncionario.getNome() + " | CPF: " + tchauFuncionario.getCpf() + " | CADASTRO: " + tchauFuncionario.getIdFuncionario());
        }else
            System.out.println("FUNCIONARIO NAO ENCONTRADO");
    }

    public void listarFuncionarios() {
        if (!funcionarios.isEmpty()) {
            for (Funcionario f : funcionarios) {
                System.out.println("FUNCIONARIO: " + f.getNome() + " | CPF: " + f.getCpf() + " | CADASTRO: " + f.getIdFuncionario());
            }
        }else
            System.out.println("NENHUM FUNCIONARIO NA EMPRESA: " + this.getNome());
    }
    //==========================================================================================


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
