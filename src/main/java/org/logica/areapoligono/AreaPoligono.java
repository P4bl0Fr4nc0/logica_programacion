package org.logica.areapoligono;

public class AreaPoligono {

    public double areaPoligono(int figura, double largoobase, double anchooaltura){

        if (figura == 1){
            return largoobase * anchooaltura;
        }

        if (figura == 2 ){
            return  (largoobase * anchooaltura)/2;
        }

        throw  new IllegalArgumentException("Error: opcion no valida ");

    }
}
