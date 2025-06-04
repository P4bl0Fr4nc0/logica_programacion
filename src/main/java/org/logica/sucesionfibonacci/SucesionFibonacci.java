package org.logica.sucesionfibonacci;

public class SucesionFibonacci {

    public  long sucesionfibonacci(long numero){

        if (numero<=1){
            return numero;
        }
         else {
             return sucesionfibonacci(numero-1) + sucesionfibonacci(numero-2);
        }

    }
}
