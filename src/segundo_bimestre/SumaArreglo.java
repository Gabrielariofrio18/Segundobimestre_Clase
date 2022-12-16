
package segundo_bimestre;

import java.util.Scanner;

public class SumaArreglo {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        System.out.println("Indique el numero de cuanto quiere su arreglo: ");
        int numero_arreglo = teclado.nextInt();
        int numero_arreglo2 []= new int[numero_arreglo];
        for (int indice = 0; indice <numero_arreglo2.length ; indice++) {
            System.out.println("ingrese los numeros del arreglo: ");
            int numero= teclado.nextInt();
            numero_arreglo2[indice]=numero;
        }
        System.out.println("\n");
        System.out.println("ingrese numeros del segundo arreglo");
        int numero_arreglo3 []= new int[numero_arreglo];
        for (int indice = 0; indice <numero_arreglo3.length ; indice++) {
            System.out.println("ingrese los numeros del arreglo: ");
            int numero= teclado.nextInt();
            numero_arreglo3[indice]=numero;
        }
        int numero_arreglo4 []= new int[numero_arreglo];
        for (int indice = 0; indice <numero_arreglo4.length ; indice++) {
            numero_arreglo4[indice]=numero_arreglo3[indice]+numero_arreglo2[indice];

        }
        for (int indice = 0; indice <numero_arreglo4.length ; indice++) {
            System.out.println(numero_arreglo4[indice]);

        }



    }
}