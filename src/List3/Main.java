package List3;

public class Main {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2010);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2019);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2011);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2012);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);


        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 4"));
        System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(2010, 2015));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }
}
