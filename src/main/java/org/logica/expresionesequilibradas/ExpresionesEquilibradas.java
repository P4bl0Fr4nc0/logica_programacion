package org.logica.expresionesequilibradas;

import java.util.Stack;

public class ExpresionesEquilibradas {

    public boolean expresionequilabrada(String expresion){
        Stack<Character> pila = new Stack<>();


        for (char caracter : expresion.toCharArray()) {
            if (caracter == '(' || caracter == '[' || caracter == '{') {
                pila.push(caracter);
            } else if (caracter == ')' || caracter == ']' || caracter == '}') {
                if (pila.isEmpty()) {
                    return false;
                }

                char cima = pila.pop();

                if ((caracter == ')' && cima != '(') || (caracter == ']' && cima != '[') || (caracter == '}' && cima != '{')) {
                    return false;
                }
            }
        }
        return pila.isEmpty();

    }

}
