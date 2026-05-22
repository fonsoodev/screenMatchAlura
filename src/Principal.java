import br.com.alura.screenmatch.modelos.Filme;

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
    }
}
