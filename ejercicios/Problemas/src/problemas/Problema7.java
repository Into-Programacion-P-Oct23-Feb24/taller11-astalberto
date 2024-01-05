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
 *
 * Problema 07 Generar una función que devuelva un arreglo unidimensional de
 * cadenas. En dicha función se debe pedir por teclado el número de elementos de
 * arreglo, además de ingresar los elementos por teclado, los datos a ingresar
 * pueden ser ciuadades del Ecuador.
 *
 * Generar un procedimiento que reciba como parámetro un arreglo unidimensional
 * de cadenas; el mismo, se debe imprimir únicamente los valores del arreglo que
 * tengan 4 o 5 caracteres.
 *
 * Desde el método principal, se debe llamar a la función que devuelva el
 * arreglo unidimensional y además llamar al procedimiento que imprima los
 * valores con las consideraciones expuestas.
 */
public class Problema7 {

    public static void main(String[] args) {
        String[] arreglo;
        arreglo = obtenerCadena();
        System.out.println("Valores");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);

        }
        System.out.println("Valores que tienen 4 o 5 caracteres");
        obtenervalores(arreglo);
    }

    public static String[] obtenerCadena() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int num;
        System.out.println("Ingrese el numero de datos que desee ingresar");
        num = entrada.nextInt();
        String[] ciudad = new String[num];
        entrada.nextLine();
        for (int i = 0; i < ciudad.length; i++) {
            System.out.println("Ingrese el nombre de la Ciudad "+(i+1));
            ciudad[i] = entrada.nextLine();
        }
        return ciudad;
    }

    public static void obtenervalores(String[] ciudad) {
        for (int i = 0; i < ciudad.length; i++) {
            if (ciudad[i].length() == 4 || ciudad[i].length() == 5) {
                System.out.println(ciudad[i]);
            }
        }
    }

}
