package Alunos.Melissa_Ghellere.aula06;

public class Gerente implements IGerente {
    private String nome;

    public Gerente(String nome) {
        this.nome = nome;
    }

    @Override
    public void cobrarVendedor() {
        System.out.println("Gerente " + nome + " cobrando resultados do time!");
    }
}
