package SegundoBimestre;

import java.util.Scanner;
/**
 * Programa que solicite el nombre de n marcas de vehiculos y los
 * almacena en un arreglo. Finalmente el programa debe mostrar el
 * nombre de los marcas almacenadas en el arreglo
 */
public class ArregloMarca {
    public static void main(String[] args) {
        String marcas [];
        System.out.println("cuantas marcas de vehiculo va ingresar: ");
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        teclado.nextLine();
        //OPERACION ESCRITURA DEL ARREGLO
        marcas = new String[n];//creamos el arreglo con n elementos
        for (int indice = 0; indice < n; indice++) {
            System.out.println("ingrese el nombre de la marca"+(indice+1)+" " + "marcas: " );
            String marca = teclado.nextLine();
            marcas[indice]= marca;
        }
        System.out.println("Lista de marcas ingresadas");
        //OPERACION LECTURA DE UN ARREGLO
        for (int indice = 0; indice < marcas.length ; indice++) {
            System.out.print(marcas[indice]+" ");
        }
        //OPERACION DE BUSQUEDA
        System.out.println(" Que nombre de marca desea buscar: ");
        //toUpperCase es una funcion que convierte en mayuscula
        String marca_busqueda = teclado.nextLine().toUpperCase();
        System.out.println("marca_busqueda: "+marca_busqueda);
        for (int indice = 0; indice < n ; indice++) {
            if(marca_busqueda.equals(marcas[indice].toUpperCase()) ){
                System.out.println("Marca encontrada");
                System.out.println("Se encuentra en el indice: "+indice);
                break;
            }
        }
    }
}