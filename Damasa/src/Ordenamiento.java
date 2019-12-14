/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author martin
 */
public class Ordenamiento {

    public void insertionSort(double[] arreglo) {
        for (int i = 1; i < arreglo.length; i++) {
            double temp = arreglo[i];
            int iPoint;
            for (iPoint = i; iPoint > 0; iPoint--) {
                int iPrev = (iPoint - 1);
                if (arreglo[iPrev] > temp) {
                    //swap                   
                    arreglo[iPoint] = arreglo[iPrev];
                } else {
                    break;
                }
            }
            arreglo[iPoint] = temp;
        }
    }
public int busquedaBin(double[] arreglo, double val) {
        return busquedaBinRec(arreglo, val, 0, (arreglo.length - 1));
    }

    private int busquedaBinRec(double[] arreglo, double val, int ini, int fin) {
        if (ini <= fin) {
            int mid = ini + ((fin - ini) / 2);
            if (val == arreglo[mid]) {
                return mid;
            } else if (val > arreglo[mid]) {
                return busquedaBinRec(arreglo, val, (mid + 1), fin);
            } else {
                return busquedaBinRec(arreglo, val, ini, (mid - 1));
            }
        } else {
            return -1;
        }
    }
}
