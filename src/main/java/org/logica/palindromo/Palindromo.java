package org.logica.palindromo;

import java.util.Arrays;

public class Palindromo {
    public void espalindromo(String texto) {

        String textoalreves = new StringBuilder(texto).reverse().toString();

        String textominus = texto.toLowerCase();
        String textose = textominus.replace(" ", "");

        String textominus2 = textoalreves.toLowerCase();
        String textose2 = textominus2.replace(" ", "");


        char[] texto1 = textose.toCharArray();
        char[] texto2 = textose2.toCharArray();



        if (Arrays.equals(texto1, texto2)) {
            System.out.println("El texto: " + texto + " es palindromo");

        } else {
            System.out.println("El texto: " + texto + " no es palindromo");


        }
    }
}
