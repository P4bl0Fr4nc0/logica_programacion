package org.logica.invertircadena;

public class InvertirCadena {

    public char[] cadena (String palabra){
        char[] letra = palabra.toCharArray();
        char[] alreves = new char[letra.length];

        for (int i=0; i < letra.length; i++){

        alreves[i]= letra[letra.length-1-i];
        }
        return alreves;
    }}
