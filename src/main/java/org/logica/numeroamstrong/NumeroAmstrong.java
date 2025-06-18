package org.logica.numeroamstrong;

import java.util.ArrayList;

public class NumeroAmstrong {


    public  void numeroAmstorng(int numero){


        String valores = String.valueOf(numero);

        char[] caracteres = valores.toCharArray();

        ArrayList<Double> valorespotenciados = new ArrayList<>();


        int potencia = caracteres.length;
        System.out.println("potencia a la que se multiplicara: " + potencia);

        for (char caracter : caracteres) {

            int valor = Character.getNumericValue(caracter);

            double total = Math.pow(valor, potencia);

            System.out.println("El valor: " + caracter + " a la potencia " + potencia + " es igual " + total);

            valorespotenciados.add(total);
        }

        double suma = 0;
        for (double valorpotencido:valorespotenciados){

            suma += valorpotencido;


        }

        System.out.println("\n La suma de los valores potenciados es: " + suma );

        if (numero == (int) suma){

            System.out.println("\n Tu numero proporcionado: " + numero + " es igual a la suma de los valores potenciados: " +(int) suma);
            System.out.println("---------Tu numero ES un numero de AMSTRONG----------");
        }

        else {
            System.out.println("\n Tu numero proporcionado: " + numero + " no es igual a la suma de los valores potenciados: " + (int) suma);
            System.out.println("---------Tu numero NO es numero de AMSTRONG----------");
        }


    }
}
