package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificado) {
        if (classificado.getClassificacao() >= 4) {
            System.out.println("Está entre os favoritos do momento!");
        } else if (classificado.getClassificacao() >= 2) {
            System.out.println("Está nos mais assistidos!");
        } else {
            System.out.println("Salve para mais tarde!");
        }
    }
}
