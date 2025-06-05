package org.logica.decimalbinario;


import java.util.ArrayList;
import java.util.stream.Collectors;

public class DecimalaBinario {

    public void binario(int numero){

        int residuo;
        int cociente = numero;

        //Se crea un array list que contendran los 0 y 1 que armaran el numero binario
        ArrayList<Integer> numero_binario = new ArrayList<>();

        // se realizan la operaciones para el residuo hasta que el cociente sea 1;
        while (cociente > 0)
        {
            residuo = cociente % 2;
            cociente = cociente/2;

            numero_binario.add(residuo);
        }
        // Se unen los valores del array numero_binario en un String
        String resultado = numero_binario.stream().map(String::valueOf)
                .collect(Collectors.joining(""));

        // Se aplica String Builder para invertit el resultado ya que los valores del array etan a la inversa
        StringBuilder invertido = new StringBuilder(resultado);
        invertido.reverse();
        System.out.println(" El numero " + numero + " a binario es: " + invertido);




    }
}
