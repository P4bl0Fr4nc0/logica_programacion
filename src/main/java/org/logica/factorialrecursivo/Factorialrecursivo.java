package org.logica.factorialrecursivo;

public class Factorialrecursivo {
    public Long factorial(long numero){

        if (numero < 0){

            throw new IllegalArgumentException("No hay facotrial en numeros negativos");

        }

        if (numero == 0 || numero ==1){

            return 1L;

        }
        else {

            return  numero * factorial(numero - 1) ;

        }
    }
}


