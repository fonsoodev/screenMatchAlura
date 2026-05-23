package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulos;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

   /* public void inclui(Filme f) {
        tempoTotal += f.getDuracaoEmMinutos();
    }
    public void inclui(Serie s) {
        tempoTotal += s.getDuracaoEmMinutos();
    }
    */

    public void inclui(Titulos titulos){
        this.tempoTotal += titulos.getDuracaoEmMinutos();
        //Aqui nós vimos o polimorfismo na prática, o getDuracaoEmMinutos está no Titulos
        //Ele percorre as subClasses, como serie e filme são filhas, o titulo reconhece
    }
}
