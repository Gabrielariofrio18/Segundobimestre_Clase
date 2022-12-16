package segundo_bimestre;

import java.util.Scanner;

public class Cuadrados {
    public static void main(String[] args) {
        double numeros []= {2,3,5,7,9,11,13};
        double cuadrados []= new double[numeros.length];
        for (int indice = 0; indice < cuadrados.length ; indice++){
            cuadrados[indice]=Math.pow(numeros[indice] ,2);
        }
        for (int indice = 0; indice < cuadrados.length; indice++) {
            System.out.println(cuadrados[indice]);
        }

    }

}
