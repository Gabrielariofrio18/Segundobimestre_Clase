package SegundoBimestre;

import java.util.Locale;
import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra = entrada.nextLine().toLowerCase();
        int tan_palabra = palabra.length();
        System.out.println("tan_palabra = "+ tan_palabra);
        char palabra_arr[] = new char[tan_palabra];
        //pasamos los caracteres de palabra al arreglo palabra_arr
        for (int indice = 0; indice < tan_palabra; indice++) {
            palabra_arr[indice]= palabra.charAt(indice);
        }
        //lectura del arreglo de derecha a izquierda
        String palabra_invertida="";
        for (int indice = tan_palabra-1; indice >= 0 ; indice--) {
            palabra_invertida = palabra_invertida + palabra_arr[indice];
        }
        //determinamos si es polindromo o no
        if( palabra.equals(palabra_invertida)){
            System.out.println("si es polindroma: "+palabra);
        }else{
            System.out.println("no es polindroma");
        }
        //for (int indice = 0; indice < tan_palabra; indice++) {
           //System.out.println(palabra_arr[indice]);
        //}

    }
}
