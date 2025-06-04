package org.logica;

public class FizzBuzz {

    public void fizzbuzz (){

        // Se crea el limite que son los primeros 100 numeros y los valores de 3 y 5
        int limite = 100;
        int numero3 = 3;
        int numero5= 5;

        // Se crea un for para recorrer los numeros desde 1 hasta el limite de 100

        for (int i = 1; i<= limite; i++){

            //Si el residuo del numero 5 y el numero 3 son iguales a 0 imprime fizzbuzz

            if (i % numero5 == 0 && i % numero3==0 ){

                System.out.println("fizzbuzz");

            }

            //si el residuo del numero i entre el numero 3 es 0 imprime buzz
            else if (i % numero3==0) {
                System.out.println("buzz");
            }
            // si el residuo del numeri 1 entre el numero 5 es 0 imprime fizz
            else if (i % numero5==0){
                System.out.println("fizz");
            }

            else {
                System.out.println(i);
            }

        }
    }
}
