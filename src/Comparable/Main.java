package Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------------------");
        ArrayList<Livro> livros = new ArrayList<Livro>(){
            {
                add(new Livro("Java", "Mauri", 2001));
                add(new Livro("Desenvolvimento", "Andy", 2025));
                add(new Livro("Microsserviços", "Susan", 2011));
                add(new Livro("Entendendo algoritmos", "Aditya", 2017));
                add(new Livro("Kotlin em ação", "Dmitry", 2017));
            }
        };

        System.out.println("Livro após a ordenação natural (TITULO): " );
        Collections.sort(livros);
        for (Livro livro : livros){
            System.out.println(livro.getTitulo() + " - " +
                    livro.getAutor() + " - " +
                    livro.getAno());
        }

        System.out.println("---------------------------------");
        System.out.println("Livros após a ordenação por ano: ");
        Collections.sort(livros, new CompararAno());
        for (Livro livro: livros){
            System.out.println(livro.getAno() + " - " +
                    livro.getTitulo() + " - " +
                    livro.getAutor());
        }

        System.out.println("---------------------------------");
        System.out.println("Livro após a ordenação por autor: ");
        Collections.sort(livros, new CompararAutor());
        for (Livro livro: livros){
            System.out.println(livro.getAutor() + " - " +
                    livro.getTitulo() + " - " +
                    livro.getAutor());

        }
        System.out.println("---------------------------------");
        System.out.println("Livros após a ordenação por ano, autor e título: ");
        Collections.sort(livros, new CompararAnoAutorTitulo());
        for (Livro livro : livros){
            System.out.println(livro.getAno() + " - " +
                    livro.getAutor() + " - " +
                    livro.getTitulo());
        }

    }
}
