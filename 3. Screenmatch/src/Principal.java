public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento = 2015;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(5);

        Filme favorito = new Filme();
        favorito.nome = "Carros";
        favorito.anoDeLancamento = 2012;
        favorito.duracaoEmMinutos = 180;
        favorito.incluidoNoPlano = true;
        favorito.exibeFichaTecnica();

        favorito.avalia(10);
        favorito.avalia(8);

        System.out.println("Média de avaliações do filme: " + favorito.pegaMedia());
    }
}
