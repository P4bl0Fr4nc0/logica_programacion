package org.logica.numerosprimos;

public class NumerosPrimos {

    public boolean primo (int numero){
        if (numero <= 1){
            return false;
        }

        for (int i = 2; i<= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }

        }

        return true;
    }
}
