package org.logica.anagrama;

import java.util.Arrays;

public class Anagrama {


    public boolean anagrama(String palabra1, String palabra2){

        palabra1 = palabra1.toLowerCase().replace(" ", "");
        palabra2 = palabra2.toLowerCase().replace(" ", "");

        if (palabra1.length() != palabra2.length()){
            return false;
        }

        char[] letras1 = palabra1.toCharArray();
        char[] letras2 = palabra2.toCharArray();

        Arrays.sort(letras1);
        Arrays.sort(letras2);


        return  Arrays.equals(letras1,letras2);



    }
}
