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
                String descripcion;

                switch (opcion){

                    case 1 :
                        descripcion = """
                                
                                  Escribe un programa que muestre por consola (con un print) los
                                  números de 1 a 100 (ambos incluidos y con un salto de línea entre
                                  cada impresión), sustituyendo los siguientes:
                                  Múltiplos de 3 por la palabra "fizz".
                                  Múltiplos de 5 por la palabra "buzz".
                                  Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
                                
                                """;

                        System.out.println(descripcion);

                        FizzBuzz fizzBuzz = new FizzBuzz();
                        fizzBuzz.fizzbuzz();


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