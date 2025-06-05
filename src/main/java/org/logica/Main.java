package org.logica;
import org.logica.anagrama.Anagrama;
import org.logica.areapoligono.AreaPoligono;
import org.logica.contarpalabras.ContarPalabras;
import org.logica.decimalbinario.DecimalaBinario;
import org.logica.fizzbuzz.FizzBuzz;
import org.logica.invertircadena.InvertirCadena;
import org.logica.numerosprimos.NumerosPrimos;
import org.logica.sucesionfibonacci.SucesionFibonacci;

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
                System.out.println(" ------------------------------------------");
                System.out.println(menu);
                System.out.println(" ------------------------------------------");
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

                        descripcion = """
                                Escribe una función que reciba dos palabras (String) y retorne
                                verdadero o falso (Bool) según sean o no anagramas.
                                Un Anagrama consiste en formar una palabra reordenando TODAS
                                las letras de otra palabra inicial.
                                NO hace falta comprobar que ambas palabras existan.
                                Dos palabras exactamente iguales no son anagrama.
                                """;

                        System.out.println(descripcion);
                        Anagrama anagrama = new Anagrama();

                        System.out.println("Palabras que no son anagrama hola y mora retornara false");
                        System.out.println(anagrama.anagrama("Hola", "Mora"));

                        System.out.println("Palabras que son anagrama amor y mora retornara true");
                        System.out.println(anagrama.anagrama("amor", "mora"));

                        break;
                    case 3:
                        descripcion = """
                                Escribe un programa que imprima los 50 primeros números de la sucesión
                                de Fibonacci empezando en 0.
                                La serie Fibonacci se compone por una sucesión de números en
                                la que el siguiente siempre es la suma de los dos anteriores.
                                0, 1, 1, 2, 3, 5, 8, 13...
                                """;

                        System.out.println(descripcion);

                        SucesionFibonacci sucesionFibonacci = new SucesionFibonacci();
                        // Se agregan los 50 numeros de la sucesion con un for y se le pasan los parametros a la funcion.

                        for (int i = 0; i<= 50; i++){
                            System.out.println(sucesionFibonacci.sucesionfibonacci(i));
                        }


                        break;

                    case 4:
                        descripcion = """
                                Eribe un programa que se encargue de comprobar si un número es o no primo.
                                Hecho esto, imprime los números primos entre 1 y 100.
                                """;
                        System.out.println(descripcion);

                        NumerosPrimos numerosPrimos = new NumerosPrimos();
                        for (int i = 0; i<= 100; i++){
                            if (numerosPrimos.primo(i)){
                                System.out.println("El numero "+ i +" es numero primo");
                            }
                            else {
                                System.out.println("El numero " + i + " no es numero primo");
                            }
                        }
                        break;

                    case 5:
                        descripcion = """
                                Crea una única función (importante que sólo sea una) que sea capaz
                                de calcular y retornar el área de un polígono.
                                La función recibirá por parámetro sólo UN polígono a la vez.
                                Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
                                Imprime el cálculo del área de un polígono de cada tipo.
                                """;

                        System.out.println(descripcion);
                        System.out.println(""" 
                                Selecciona el tipo de poligono que quieres calcular su area
                                1.Cuadrado o rectangulo.
                                2.Circulo.
                                """);
                        int figura = entrada.nextInt();


                        AreaPoligono areaPoligono = new AreaPoligono();


                        if (figura == 1){

                            System.out.println("Ingrese el largo");
                            double largo = entrada.nextDouble();
                            System.out.println("Ingrese ancho");
                            double ancho = entrada.nextDouble();

                            System.out.println("El area del poligono es " + areaPoligono.areaPoligono(figura,largo,ancho));

                        }
                        if ( figura ==2){
                            System.out.println("Ingrese el base");
                            double largo = entrada.nextDouble();
                            System.out.println("Ingrese altura");
                            double ancho = entrada.nextDouble();

                            System.out.println("El area del poligono es " + areaPoligono.areaPoligono(figura,largo,ancho));
                        }
                        break;

                    case 6:
                        descripcion = """
                                Crea un programa que invierta el orden de una cadena de texto
                                sin usar funciones propias del lenguaje que lo hagan de forma automática.
                                Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
                                """;

                        System.out.println(descripcion);

                        String palabra;
                        Scanner entrada2 = new Scanner(System.in);
                        System.out.println("Inserta la palabra que quieres invertir: ");
                        palabra = entrada2.nextLine();

                        InvertirCadena invertirCadena = new InvertirCadena();
                        String invertido = new String(invertirCadena.cadena(palabra));

                        System.out.println("Tu palabra invertida es: " + invertido);

                        break;

                    case 7:

                        descripcion = """
                                Este texto es una prueba para ver cuantas veces se repite
                                cada palabra y las cuente con la funcion creada en la clase
                               contar palabras, las mayusculas pasaran como minusculas.
                               """;

                        System.out.println(descripcion);
                        Scanner entrada3 = new Scanner(System.in);
                        System.out.println("Ingrese un texto");
                        String texto = entrada3.nextLine();

                        ContarPalabras contarPalabras = new ContarPalabras();
                        contarPalabras.conteopalabras(texto);

                        break;

                    case 8:

                        descripcion= """
                                Crea un programa se encargue de transformar un número
                                decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
                                """;
                        System.out.println(descripcion);

                        Scanner entrada4 = new Scanner(System.in);
                        System.out.println("Ingresa un numero que desees convertir a binario");
                        int numero = entrada4.nextInt();

                        DecimalaBinario decimalaBinario = new DecimalaBinario();
                        decimalaBinario.binario(numero);


                        break;




                    default:
                        System.out.println("Opcion no valida");
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