package ExercicioInterface;

import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int option;
        GeometricForm geometricForm;
        while (true){
            System.out.println("Escolha a forma geométrica para calcular a area");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retângulo");
            System.out.println("3 - Circulo");
            System.out.println("4 - Sair do programa");
            option = scanner.nextInt();
            if (option == 1){
               geometricForm = createSquare();
            }
            else if (option == 2) {
               geometricForm =  createRectangle();
            }
            else if (option == 3) {
               geometricForm = createCircle();
            }
            else if (option == 4){
                System.out.println("Encerrando o sistema");
                break;
            }
            else {
                System.out.println("Opção invalida");
                continue;
            }
            System.out.println("O resultado do calculo foi de " + geometricForm.getArea());

        }

    }
    private static GeometricForm createSquare(){
        System.out.println("Informe os tamanhos doos lados");
        var side = scanner.nextDouble();
        return new Square(side);


    }

    private static GeometricForm createRectangle(){
        System.out.println("Informe a base: ");
        var base = scanner.nextDouble();
        System.out.println("Informe a Altura: ");
        var height = scanner.nextDouble();
        return new Rectangle(height, base);


    }
    private static GeometricForm createCircle(){
        System.out.println("Informe raio");
        var radius = scanner.nextDouble();
        return new Circle(radius);


    }

}
