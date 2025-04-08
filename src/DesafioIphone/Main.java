package DesafioIphone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        Iphone iphone = new Iphone();

        var option = -1;
        var decision = -1;

        do {

            System.out.println("Bem vindo ao sistema do celular, o que deseja fazer?");
            System.out.println("1 - Acessar app de música");
            System.out.println("2 - Acessar telefone");
            System.out.println("3 - Acessar o navegador");
            System.out.println("0 - Para sair");
            option = scanner.nextInt();

            switch (option){
                case 1 -> {

                    System.out.println("Bem vindo ao app de música, o que deseja fazer?");
                    System.out.println("1 - Tocar música");
                    System.out.println("2 - Pausar música");
                    System.out.println("3 - Adicionar música");
                    decision = scanner.nextInt();
                    if (decision == 1){
                        iphone.playMusic();
                    }
                    else if (decision == 2) {
                        iphone.pauseMusic();

                    }
                    else if (decision == 3) {
                        String nameMusic;
                        System.out.println("Informe o nome da música");
                        scanner.nextLine();
                        nameMusic = scanner.nextLine();
                        iphone.selectMusic(nameMusic);

                    }
                    else {
                        System.out.println("Selecione uma opção valida!");

                    }

                }
                case 2 ->{
                    System.out.println("Bem vindo ao app telefone, o que deseja fazer?");
                    System.out.println("1 - Ligar");
                    System.out.println("2 - Atender");
                    System.out.println("3 - Acessar a caixa postal");
                    decision = scanner.nextInt();
                    if (decision == 1){
                        iphone.calling();
                    }
                    else if (decision == 2){
                        iphone.answer();
                    }
                    else if (decision == 3) {
                        iphone.playMailBox();

                    }
                    else {
                        System.out.println("Informe uma opção valida");
                    }
                }
                case 3 ->{

                    System.out.println("Bem vindo ao navegador, o que deseja fazer?");
                    System.out.println("1 - Vizualizar página inicial");
                    System.out.println("2 - Atualizar página");
                    System.out.println("3 - Adicionar página");
                    decision = scanner.nextInt();
                    if (decision == 1){
                        iphone.seePage();
                    }
                    else if (decision == 2) {
                        iphone.updatePage();
                    }
                    else if (decision == 3) {
                        String namePage;
                        System.out.println("Informe o nome do site");
                        scanner.nextLine();
                        namePage = scanner.nextLine();
                        iphone.addPage(namePage);

                    }
                    else {
                        System.out.println("Informe uma opção valida!");
                    }
                }
                case 0 -> System.exit(0);

                default -> System.out.println("Informe um valor valido");
            }
        }while (option != 0);
    }
}
