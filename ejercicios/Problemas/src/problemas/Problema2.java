/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema2 {

    static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        entrada.useLocale(Locale.US);
        int num = 0;
        System.out.println("Ingrese un numero del 1 al 3");
        num = entrada.nextInt();
        if (num > 0 && num < 4) {

            switch (num) {
                case 1:
                    obtenerAreaCuadrado();
                    break;
                case 2:
                    obtenerAreaTriangulo();
                    break;
                case 3:
                    obtenerAreaRectangulo();
                    break;
            }
        } else {
            System.out.println("Error");
        }
    }

    public static void obtenerAreaCuadrado() {
        entrada.useLocale(Locale.US);
        System.out.println("Area de un Cuadrado");
        double lado;
        double area;
        System.out.println("Ingrese la medida de un lado");
        lado = entrada.nextDouble();
        area = lado * lado * lado * lado;
        System.out.printf("El area del cuadrado es: %.2f\n", area);
    }

    public static void obtenerAreaTriangulo() {
        entrada.useLocale(Locale.US);
        System.out.println("Area de un Triangulo");
        double base;
        double altura;
        double area;
        System.out.println("Ingrese la medida de la base");
        base = entrada.nextDouble();
        System.out.println("Ingrese la medida de la altura");
        altura = entrada.nextDouble();
        area = (base * altura) / 2;
        System.out.printf("El area del Triangulo es: %.2f\n", area);
    }

    public static void obtenerAreaRectangulo() {
        entrada.useLocale(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Area de un Rectangulo");
        double base;
        double altura;
        double area;
        System.out.println("Ingrese la medida de la base");
        base = entrada.nextDouble();
        System.out.println("Ingrese la medida de la altura");
        altura = entrada.nextDouble();
        area = (base * altura);
        System.out.printf("El area del Rectangulo es: %.2f\n", area);
    }
}
