/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 *
 * Problema 06 Dado un arreglo; por ejemplo:
 *
 * int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300}; Generar las
 * siguiente funciones:
 *
 * Función que devuelva la media aritmética del arreglo; recibe como parámetro
 * un arreglo de tipo entero
 *
 * Función que devuelva el valor de la desviación estándar de los valores del
 * arreglo; recibe como parámetro un arreglo de tipo entero y un valor de tipo
 * decimal para representar la media aritemética
 *
 * Los método deben ser invocados desde el método main (principal); además, las
 * funciones deben recibir como parámetro. En el método principal imprimir el
 * valor de la media aritmética y el valor de la desviación estándar.
 */
public class Problema6 {

    public static void main(String[] args) {
        double desviacion;
        double media;
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        media = obtenerMedia(informacion);
        desviacion = obtenerDesviacion(informacion, media);
        System.out.printf("La media es: %.2f\nLa desviación estandar "
                + "es: %.2f\n",
                media,
                desviacion);
    }

    public static double obtenerMedia(int[] datos) {
        double media;
        int suma = 0;
        for (int i = 0; i < datos.length; i++) {
            suma = suma + datos[i];
        }
        media = suma / datos.length;
        return media;
    }

    public static double obtenerDesviacion(int[] datos, double media) {
        double desviacion;
        double distancia = 0;
        for (int i = 0; i < datos.length; i++) {
            distancia = distancia + Math.pow(datos[i] - media, 2);
        }
        desviacion = Math.sqrt(distancia / datos.length);
        return desviacion;
    }
}
