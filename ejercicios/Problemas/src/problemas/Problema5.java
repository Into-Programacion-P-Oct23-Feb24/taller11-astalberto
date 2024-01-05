/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes 
 * Problema 05 Generar un función, método que devuelva la suma de
 * un arreglo bidimensional; mismo que se lo recibe como parámetro.
 *
 * El arreglo para probar la solución es:
 *
 * int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}}; El método
 * debe se invocado desde el método main (principal); además el método debe
 * recibir como parámetro un arreglo bidimensional.
 */
public class Problema5 {

    public static void main(String[] args) {

        int sumaT;
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};

        sumaT = obtenerSuma(informacion);
        System.out.println(sumaT);
    }

    public static int obtenerSuma(int[][] datos) {
        int sumaT = 0;
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                sumaT = sumaT + datos[i][j];
            }
        }
        return sumaT;
    }
}
