package br.com.alura.screenmatch.modelos;
import java.time.LocalDate;
public class Filme {

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoEmMinutos;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }
    public void setAnoDeLancamento(int anoDeLancamento) {
        int anoAtual = LocalDate.now().getYear();
        if (anoDeLancamento > anoAtual || anoDeLancamento < 1900){
            throw new IllegalAccessError("Erro: O ano de lançamento digitado é invalido");
        } else {
            this.anoDeLancamento = anoDeLancamento;
        }
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }
    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }
    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }
    public void setTotalAvaliacoes(int totalAvaliacoes) {
        this.totalAvaliacoes = totalAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do Filme: "+nome);
        System.out.println("Ano de lançamento: "+anoDeLancamento);
        System.out.println("Está disponível no seu plano?:" + incluidoNoPlano);
        System.out.println("Total de Avaliações: " + totalAvaliacoes);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double pegaMedia() {
        return (somaDasAvaliacoes/totalAvaliacoes);
    }
}
