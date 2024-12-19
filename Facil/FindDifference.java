package Facil;

import java.util.concurrent.ThreadLocalRandom;

/* dado 2 strings s y t que consisten solo de letras minusculas.
 * 
 * String t esta generado aleatoriamente mezclando las letras del string s 
 * y añadiendo una letra mas en una posicion al azar.
 * 
 * Encuentra la letra que se ha añadido en t.
 */
public class FindDifference {
    public static void main(String[] args) {
        
    }

    public static String letraDistinta(String s){
        String alfabeto="abcdefghijklmnopqrstuvwxyz";
        String t="";
        String cadPosiciones="";
        int posicion;
        if(s!=null&&s.matches("[a-z]")){
            for (int i = 0; i < s.length(); i++) {
                cadPosiciones+=ThreadLocalRandom.current().nextInt(0,s.length()+1)+"";
            }
            for (int i = 0; i < s.length(); i++) {
                String charActual=cadPosiciones.substring(i, i+1);
                posicion=Integer.parseInt(charActual);
                t+=s.charAt(posicion);
            }
        }
        return "ERROR";
    }
}
