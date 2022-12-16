package SegundoBimestre;

public class UnionArreglo {
    public static void main(String[] args) {
        String marcas1 []={"hp","dell","asus","lenovo","toshiba"};
        String marcas2 []={"sansung","huawei","dere"};
        int tan_arr_resultado = marcas1.length+ marcas2.length;//8
        String res[] =new String[tan_arr_resultado];
        for (int indice = 0; indice < marcas1.length; indice++) {
            res[indice] = marcas1[indice];
        }
        //copiamos los valores del arrglo marcas2 en el arreglo res
        for (int indice = marcas1.length, indice2=0; indice < res.length; indice++,indice2++) {
            res[indice] = marcas2[indice2];
        }
        for (int indice = 0; indice < res.length; indice++) {
            System.out.println(res[indice]);
        }
    }
}