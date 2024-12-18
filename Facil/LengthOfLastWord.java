/*Dada una cadena de letras mayus/minusculas y espacios ' ', 
devuelve la longitud de la ultima palabra de la cadena */

package Facil;

public class LengthOfLastWord{
    public static void main(String[] args) {
        System.out.println(longitudUltimaPalabra("Hello World"));
    }

    public static int longitudUltimaPalabra(String cadena){
        cadena =cadena.trim();
        String espacio=" ";
        String ultimaPalabra="";
        if(cadena.contains(espacio)){
            int ultima=cadena.lastIndexOf(espacio);
            ultimaPalabra=cadena.substring(ultima);
            ultimaPalabra=ultimaPalabra.trim();
            return ultimaPalabra.length();
                
        }
        return 0;
    }
}