/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes Generar un procedimiento (método que no devuelva valor) que
 * imprima los valor pares de un arreglo bidimensional.
 *
 * El arreglo para probar la solución es:
 *
 * int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
 *
 * El procedimiento o método debe se invocado desde el método main (principal);
 * además el método debe recibir como parámetro un arreglo bidimensional.
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        imprimirDatos(informacion);
    }

    public static void imprimirDatos(int[][] datos) {
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos.length; j++) {
                if ((datos[i][j]%2)==0) {
                    System.out.println(datos[i][j]);
                }
            }
        }
    }

}
