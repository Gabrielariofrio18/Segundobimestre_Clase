
package SegundoBimestre;

public class Arreglos2 {
    public static void main(String[] args) {
        //creacion de arreglos de valores predefinidos
        String universidades [] = new String[5];
        System.out.println("Arreglo universidades: ");
        for (int indice = 0; indice < universidades.length; indice++) {
            System.out.println(universidades[indice]+" ");
        }
        int notas[]=new int[4];
        System.out.println("Arreglo notas: ");
        for (int indice = 0; indice < notas.length ; indice++) {
            System.out.print(notas[indice] + " ");
        }
        System.out.println(" ");
        boolean valores[]=new boolean[10];
        for (int indice = 0; indice < valores.length; indice++) {
            System.out.print(valores[indice]+" ");
        }
        //creacion de un arreglo cuando un indice no conocemos el tamaño
        String nombres[];//declaracion de un arreglo llamadonombres
        nombres = new String[10];//creacion de un arreglo de 10 elementos

    }
}
