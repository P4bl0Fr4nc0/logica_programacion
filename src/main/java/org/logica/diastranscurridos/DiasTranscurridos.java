package org.logica.diastranscurridos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DiasTranscurridos {


    public int  diastranscurridos(String fecha1, String fecha2){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate fechauno = LocalDate.parse(fecha1, formatter);
        LocalDate fechados = LocalDate.parse(fecha2, formatter);


        return (int) Math.abs(ChronoUnit.DAYS.between(fechauno,fechados));
    }
}
