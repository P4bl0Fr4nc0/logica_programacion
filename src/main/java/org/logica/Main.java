package org.logica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // Menu


        String menu = """
               Ejercicios logica de programacion, elige una opcion de menú.
               1. Fizz Buzz.
               2. Anagrama.
               3. Sucesion de Fibonacci primero 50 numeros.
               4. Numero primos del 1 al 100.
               5. Area de un poligono.
               6. Invertir caracteres de una palabra.
               7. Contar palabras.
               8. Decimal a binario.
               9. Codigo morse.
               10. Expresiones equilibradas.
               11. Palindromo.
               12. Factorial.
               13.
               14.Salir.
               """;

        try {

            Scanner entrada = new Scanner(System.in);
            int opcion;

            do {
                System.out.println(menu);
                opcion = entrada.nextInt();

                switch (opcion){

                    case 1 :
                        break;

                    case 2:

                        break;

                }
            }
            while (opcion != 14);
        }
        catch (Exception e){
            System.out.println("Opcion no valida");

        }



        }
}