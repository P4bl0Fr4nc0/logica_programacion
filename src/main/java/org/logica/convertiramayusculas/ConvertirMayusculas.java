package org.logica.convertiramayusculas;

import java.util.*;

public class ConvertirMayusculas {

    public void convertirmayusculas(String texto){

        //Convertimos el texto en un array List
        ArrayList<String> palabras = new ArrayList<>(List.of(texto.split("\\s+")));

        //Recooremos el texto para obtener cada palabra
        for (int i =0; i<palabras.size();i++){
            // se obiene cada palabra de acuerdo a su posicion
            String palabra = palabras.get(i);
            //obtenemos la primera letra de cada palabra
            char primeraLetra = palabra.charAt(0);


            // si la lave del has contiene la primera letra en minuscula
            if (Mayusmap.containsKey(primeraLetra)){
                 //se sustituye la primera letra de cada palabra
                String palabraSustituida = Mayusmap.get(primeraLetra)+palabra.substring(1);
                palabras.set(i,palabraSustituida);


            }

        }
        //Unimos el array de palabras con mayusculas.
        String textoSustituido = String.join(" ", palabras);
        System.out.println(textoSustituido);

    }

    private static final Map<Character, String> Mayusmap = new HashMap<>();
    static {

        Mayusmap.put('a',"A");
        Mayusmap.put('b',"B");
        Mayusmap.put('c',"C");
        Mayusmap.put('d',"D");
        Mayusmap.put('e',"E");
        Mayusmap.put('f',"F");
        Mayusmap.put('g',"G");
        Mayusmap.put('h',"H");
        Mayusmap.put('i',"I");
        Mayusmap.put('j',"J");
        Mayusmap.put('k',"K");
        Mayusmap.put('l',"L");
        Mayusmap.put('m',"M");
        Mayusmap.put('n',"N");
        Mayusmap.put('ñ',"Ñ");
        Mayusmap.put('o',"O");
        Mayusmap.put('p',"P");
        Mayusmap.put('q',"Q");
        Mayusmap.put('r',"R");
        Mayusmap.put('s',"S");
        Mayusmap.put('t',"T");
        Mayusmap.put('u',"U");
        Mayusmap.put('v',"V");
        Mayusmap.put('w',"W");
        Mayusmap.put('x',"X");
        Mayusmap.put('y',"Y");
        Mayusmap.put('z',"Z");
    }

}
