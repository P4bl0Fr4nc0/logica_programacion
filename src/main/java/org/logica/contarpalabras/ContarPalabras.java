package org.logica.contarpalabras;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContarPalabras {

    public void conteopalabras (String palabras){

        // Se crea el array de la palabra que contrandra las palabras en minusculas
        ArrayList<String> palabra = new ArrayList<>(List.of(palabras.toLowerCase().split("\\s+")));

        // Se cuentan las palabras con un hash map
        Map<String,Integer> contar = new HashMap<>();
        // se recorre los elementos del array palabra
        for (String elemento:palabra){
            contar.put(elemento, contar.getOrDefault(elemento,0)+1);
        }
        // Se recorre el map y se cuentan
        for (Map.Entry<String, Integer> entrada : contar.entrySet()){
            // Se hace un if else para decir si el texto se cuenta una vez o varias veces
            String texto;
            if ( entrada.getValue()>1){
                texto =  " veces";
            } else {
                texto = " vez";
            }
            System.out.println("La palabra: " + "--- " + entrada.getKey() +" ---"+ " se repite " + entrada.getValue() + texto  );
        }
    }
}
