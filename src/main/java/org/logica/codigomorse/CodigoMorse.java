package org.logica.codigomorse;
import java.util.HashMap;
import java.util.Map;

public class CodigoMorse {

// Map de codigo morse
    private static final Map<Character, String> codigoMorseMap = new HashMap<>();

    static {

      codigoMorseMap.put('a',"°-" );
      codigoMorseMap.put('b',"-°°°" );
      codigoMorseMap.put('c',"-°-°" );
      codigoMorseMap.put('d',"-°°" );
      codigoMorseMap.put('e',"_°" );
      codigoMorseMap.put('f',"°°-°" );
      codigoMorseMap.put('g',"--°" );
      codigoMorseMap.put('h',"°°°°" );
      codigoMorseMap.put('i',"°°" );
      codigoMorseMap.put('j',"°---" );
      codigoMorseMap.put('k',"-°-" );
      codigoMorseMap.put('l',"°-°°" );
      codigoMorseMap.put('m',"--" );
      codigoMorseMap.put('n',"-°" );
      codigoMorseMap.put('ñ',"--°--" );
      codigoMorseMap.put('o',"---" );
      codigoMorseMap.put('p',"°--°" );
      codigoMorseMap.put('q',"--°-" );
      codigoMorseMap.put('r',"°-°" );
      codigoMorseMap.put('s',"°°°" );
      codigoMorseMap.put('t',"-" );
      codigoMorseMap.put('u',"°°-" );
      codigoMorseMap.put('v',"°°°-" );
      codigoMorseMap.put('w',"°--" );
      codigoMorseMap.put('x',"-°°-" );
      codigoMorseMap.put('y',"-°--" );
      codigoMorseMap.put('z',"--°°" );
   }

   // Map texto
   private static final Map<String, String> codigoAscciMAp = new HashMap<>();
    static {

      codigoAscciMAp.put("°-","a");
      codigoAscciMAp.put("-°°°","b");
      codigoAscciMAp.put("-°-°","c");
      codigoAscciMAp.put("-°°","d");
      codigoAscciMAp.put("_°","e");
      codigoAscciMAp.put("°°-°","f");
      codigoAscciMAp.put("--°","g");
      codigoAscciMAp.put("°°°°","h");
      codigoAscciMAp.put("°°","i");
      codigoAscciMAp.put("°---","j");
      codigoAscciMAp.put("-°-","k");
      codigoAscciMAp.put("°-°°","l");
      codigoAscciMAp.put("--","m");
      codigoAscciMAp.put("-°","n");
      codigoAscciMAp.put("--°--","ñ");
      codigoAscciMAp.put("---","o");
      codigoAscciMAp.put("°--°","p");
      codigoAscciMAp.put("--°-","q");
      codigoAscciMAp.put("°-°","r");
      codigoAscciMAp.put("°°°","s");
      codigoAscciMAp.put("-","t");
      codigoAscciMAp.put("°°-","u");
      codigoAscciMAp.put("°°°-","v");
      codigoAscciMAp.put("°--","w");
      codigoAscciMAp.put("-°°-","x");
      codigoAscciMAp.put("-°--","y");
      codigoAscciMAp.put("--°°","z");
    }

// metodo texto a morse
    public String textoamorse (String texto){

      StringBuilder codigoMorse = new StringBuilder();
      String[] palabras = texto.toLowerCase().split(" ");

      for (String palabra : palabras){

        for ( char c : palabra.toCharArray()) {
          codigoMorse.append(codigoMorseMap.getOrDefault(c, "")).append(" ");
        }
        codigoMorse.append("/");
      }

      return codigoMorse.toString().trim();
    }

    // Metodo para pasar de morse a texto
    public String morseatexto (String morse){

           StringBuilder texto = new StringBuilder();
      String[] palabras = morse.split("/");

      for (String palabra : palabras){
        String[] letras = palabra.split(" ");
        for ( String letra : letras) {
          texto.append(codigoAscciMAp.getOrDefault(letra, ""));
        }
        texto.append(" ");
      }

      return texto.toString().trim();
    }

    }

