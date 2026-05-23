import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme =  new Filme();
        /* É parecido com o Scanner, a gente criou uma classe filme
           criamos uma variável do tipo br.com.alura.screenmatch.modelos.Filme com o nome meuFilme
           É chamada de variável de referência, ela guarda o endereço de memória onde foi criado pelo new
           O new br.com.alura.screenmatch.modelos.Filme(); serve para instanciar o objeto na memória RAM numa área chamada heap
         */
        //Atalho novo: Shift + F6 seleciona e muda todos nomes iguais que ele encontra, serve para renomear uma variável
        meuFilme.setNome("Harry Potter") ;
        meuFilme.setAnoDeLancamento(2025);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println(meuFilme.getTotalAvaliacoes());

        //Esse método é void, ele vai retornar o Print
        meuFilme.exibeFichaTecnica();

        //Estamos chamando um método que só faz a soma, mas não tem o print na classe filme
        System.out.printf("Média das Avaliações: %.2f\n",meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodios(50);
        lost.exibeFichaTecnica();
        System.out.println("Duração da maratona: " + lost.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        System.out.println("Tempo de Maratona: " + calculadora.getTempoTotal());

        Filme filmeFav =  new Filme();

        filmeFav.setNome("Invocaçao do mal") ;
        filmeFav.setAnoDeLancamento(2016);
        filmeFav.setDuracaoEmMinutos(120);
        filmeFav.setIncluidoNoPlano(true);
        filmeFav.avalia(10);
        filmeFav.exibeFichaTecnica();
        calculadora.inclui(filmeFav);
        System.out.println("Tempo de Maratona: " + calculadora.getTempoTotal());

        calculadora.inclui(lost);

        System.out.println("Tempo de Maratona Filmes/Series: " + calculadora.getTempoTotal());

    }
}
