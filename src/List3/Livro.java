package List3;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicaco;

    public Livro(String titulo, String autor, int anoPublicaco) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicaco = anoPublicaco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicaco() {
        return anoPublicaco;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicaco=" + anoPublicaco +
                '}';
    }
}
