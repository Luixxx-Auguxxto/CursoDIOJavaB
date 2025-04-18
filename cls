[33mcommit 7d215d65ca589a2fc1c52fac8793dc2745b65335[m[33m ([m[1;36mHEAD[m[33m -> [m[1;32mmain[m[33m, [m[1;31morigin/main[m[33m)[m
Merge: 456709e 3f686b9
Author: Luis Augusto <luisaugusto196713@gmail.com>
Date:   Sun Apr 13 13:03:22 2025 -0300

    Algumas atualizações
    
    Signed-off-by: Luis Augusto <luisaugusto196713@gmail.com>

[1mdiff --cc .gitignore[m
[1mindex f68d109,524f096..1338d4b[m
[1m--- a/.gitignore[m
[1m+++ b/.gitignore[m
[36m@@@ -1,29 -1,24 +1,56 @@@[m
[32m++<<<<<<< HEAD[m
[32m +### IntelliJ IDEA ###[m
[32m +out/[m
[32m +!**/src/main/**/out/[m
[32m +!**/src/test/**/out/[m
[32m +[m
[32m +### Eclipse ###[m
[32m +.apt_generated[m
[32m +.classpath[m
[32m +.factorypath[m
[32m +.project[m
[32m +.settings[m
[32m +.springBeans[m
[32m +.sts4-cache[m
[32m +bin/[m
[32m +!**/src/main/**/bin/[m
[32m +!**/src/test/**/bin/[m
[32m +[m
[32m +### NetBeans ###[m
[32m +/nbproject/private/[m
[32m +/nbbuild/[m
[32m +/dist/[m
[32m +/nbdist/[m
[32m +/.nb-gradle/[m
[32m +[m
[32m +### VS Code ###[m
[32m +.vscode/[m
[32m +[m
[32m +### Mac OS ###[m
[31m- .DS_Store[m
[32m++.DS_Store[m
[32m++=======[m
[32m+ # Compiled class file[m
[32m+ *.class[m
[32m+ [m
[32m+ # Log file[m
[32m+ *.log[m
[32m+ [m
[32m+ # BlueJ files[m
[32m+ *.ctxt[m
[32m+ [m
[32m+ # Mobile Tools for Java (J2ME)[m
[32m+ .mtj.tmp/[m
[32m+ [m
[32m+ # Package Files #[m
[32m+ *.jar[m
[32m+ *.war[m
[32m+ *.nar[m
[32m+ *.ear[m
[32m+ *.zip[m
[32m+ *.tar.gz[m
[32m+ *.rar[m
[32m+ [m
[32m+ # virtual machine crash logs, see http://www.java.com/en/download/help/error_hotspot.xml[m
[32m+ hs_err_pid*[m
[32m+ replay_pid*[m
[32m++>>>>>>> 3f686b949674c42ce6cdf2b819540e7667a425a7[m
[1mdiff --cc src/Comparable/Livro.java[m
[1mindex 0000000,0000000..dddac0c[m
[1mnew file mode 100644[m
[1m--- /dev/null[m
[1m+++ b/src/Comparable/Livro.java[m
[36m@@@ -1,0 -1,0 +1,86 @@@[m
[32m++package Comparable;[m
[32m++[m
[32m++import java.util.Comparator;[m
[32m++[m
[32m++class Livro implements Comparable<Livro> {[m
[32m++    private String titulo;[m
[32m++    private String autor;[m
[32m++    private int ano;[m
[32m++[m
[32m++    //construtor[m
[32m++    public Livro(String titulo, String autor, int ano) {[m
[32m++        this.titulo = titulo;[m
[32m++        this.autor = autor;[m
[32m++        this.ano = ano;[m
[32m++    }[m
[32m++[m
[32m++    //usando para ordenar livros por ano[m
[32m++    public int compareTo(Livro l){[m
[32m++        return titulo.compareTo(l.titulo);[m
[32m++    }[m
[32m++[m
[32m++    public String getTitulo() {[m
[32m++        return titulo;[m
[32m++    }[m
[32m++[m
[32m++    public void setTitulo(String titulo) {[m
[32m++        this.titulo = titulo;[m
[32m++    }[m
[32m++[m
[32m++    public String getAutor() {[m
[32m++        return autor;[m
[32m++    }[m
[32m++[m
[32m++    public void setAutor(String autor) {[m
[32m++        this.autor = autor;[m
[32m++    }[m
[32m++[m
[32m++    public int getAno() {[m
[32m++        return ano;[m
[32m++    }[m
[32m++[m
[32m++    public void setAno(int ano) {[m
[32m++        this.ano = ano;[m
[32m++    }[m
[32m++[m
[32m++}[m
[32m++//classe para comparar livro por ano[m
[32m++[m
[32m++class CompararAno implements Comparator<Livro> {[m
[32m++    public int compare(Livro l1, Livro l2){[m
[32m++        if (l1.getAno() < l2.getAno())[m
[32m++            return -1;[m
[32m++[m
[32m++        if (l1.getAno() > l2.getAno())[m
[32m++            return 1;[m
[32m++[m
[32m++        else[m
[32m++            return 0;[m
[32m++[m
[32m++    }[m
[32m++}[m
[32m++[m
[32m++//vai ordenar por ano, depois por autor e depois por titulo[m
[32m++[m
[32m++class CompararAnoAutorTitulo implements Comparator<Livro>{[m
[32m++    @Override[m
[32m++    public int compare(Livro l1, Livro l2){[m
[32m++        int ano = Integer.compare(l1.getAno(), l2.getAno());[m
[32m++        if (ano != 0)[m
[32m++            return ano;[m
[32m++[m
[32m++        int autor = l1.getAutor().compareTo(l2.getAutor());[m
[32m++        if (autor != 0)[m
[32m++            return autor;[m
[32m++        return l1.getTitulo().compareTo(l2.getTitulo());[m
[32m++[m
[32m++    }[m
[32m++}[m
[32m++[m
[32m++//Classe para comparar livro por autor[m
[32m++[m
[32m++class CompararAutor implements Comparator<Livro>{[m
[32m++    public int compare(Livro l1, Livro l2){[m
[32m++        return l1.getAutor().compareTo(l2.getAutor());[m
[32m++    }[m
[32m++}[m
[1mdiff --cc src/Comparable/Main.java[m
[1mindex 0000000,0000000..2f20e63[m
[1mnew file mode 100644[m
[1m--- /dev/null[m
[1m+++ b/src/Comparable/Main.java[m
[36m@@@ -1,0 -1,0 +1,55 @@@[m
[32m++package Comparable;[m
[32m++[m
[32m++import java.util.ArrayList;[m
[32m++import java.util.Collections;[m
[32m++[m
[32m++public class Main {[m
[32m++    public static void main(String[] args) {[m
[32m++        System.out.println("---------------------------------");[m
[32m++        ArrayList<Livro> livros = new ArrayList<Livro>(){[m
[32m++            {[m
[32m++                add(new Livro("Java", "Mauri", 2001));[m
[32m++                add(new Livro("Desenvolvimento", "Andy", 2025));[m
[32m++                add(new Livro("Microsserviços", "Susan", 2011));[m
[32m++                add(new Livro("Entendendo algoritmos", "Aditya", 2017));[m
[32m++                add(new Livro("Kotlin em ação", "Dmitry", 2017));[m
[32m++            }[m
[32m++        };[m
[32m++[m
[32m++        System.out.println("Livro após a ordenação natural (TITULO): " );[m
[32m++        Collections.sort(livros);[m
[32m++        for (Livro livro : livros){[m
[32m++            System.out.println(livro.getTitulo() + " - " +[m
[32m++                    livro.getAutor() + " - " +[m
[32m++                    livro.getAno());[m
[32m++        }[m
[32m++[m
[32m++        System.out.println("---------------------------------");[m
[32m++        System.out.println("Livros após a ordenação por ano: ");[m
[32m++        Collections.sort(livros, new CompararAno());[m
[32m++        for (Livro livro: livros){[m
[32m++            System.out.println(livro.getAno() + " - " +[m
[32m++                    livro.getTitulo() + " - " +[m
[32m++                    livro.getAutor());[m
[32m++        }[m
[32m++[m
[32m++        System.out.println("---------------------------------");[m
[32m++        System.out.println("Livro após a ordenação por autor: ");[m
[32m++        Collections.sort(livros, new CompararAutor());[m
[32m++        for (Livro livro: livros){[m
[32m++            System.out.println(livro.getAutor() + " - " +[m
[32m++                    livro.getTitulo() + " - " +[m
[32m++                    livro.getAutor());[m
[32m++[m
[32m++        }[m
[32m++        System.out.println("---------------------------------");[m
[32m++        System.out.println("Livros após a ordenação por ano, autor e título: ");[m
[32m++        Collections.sort(livros, new CompararAnoAutorTitulo());[m
[32m++        for (Livro livro : livros){[m
[32m++            System.out.println(livro.getAno() + " - " +[m
[32m++                    livro.getAutor() + " - " +[m
[32m++                    livro.getTitulo());[m
[32m++        }[m
[32m++[m
[32m++    }[m
[32m++}[m
[1mdiff --cc src/EntendendoList/Main.java[m
[1mindex 0000000,0000000..c43571a[m
[1mnew file mode 100644[m
[1m--- /dev/null[m
[1m+++ b/src/EntendendoList/Main.java[m
[36m@@@ -1,0 -1,0 +1,29 @@@[m
[32m++package EntendendoList;[m
[32m++[m
[32m++import java.util.ArrayList;[m
[32m++import java.util.List;[m
[32m++[m
[32m++public class Main {[m
[32m++    public static void main(String[] args) {[m
[32m++        //Exemplo sem Generics[m
[32m++        List listaSemGenerics = new ArrayList();[m
[32m++        listaSemGenerics.add("Elemento 1");[m
[32m++        listaSemGenerics.add(10); //permite adicionar qualquer tipo de objeto[m
[32m++[m
[