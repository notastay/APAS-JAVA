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
        System.out.println(letraDistinta("abcde"));
    }

    public static String letraDistinta(String s){
        String alfabeto="abcdefghijklmnopqrstuvwxyz";
        String t="";
        String cadPosiciones="";
        String posicionesPosibles="";
        int posicion;
        int numPosicion;
        //generar la cadena t
        if(s!=null&&s.matches("[a-z]+")){
            for (int i = 0; i < s.length(); i++) {
                posicionesPosibles+=i+"";
            }
            for (int i = 0; i < s.length(); i++) {
                numPosicion=ThreadLocalRandom.current().nextInt(0,posicionesPosibles.length());
                cadPosiciones+=posicionesPosibles.charAt(numPosicion)+"";
                posicionesPosibles=posicionesPosibles.replace(posicionesPosibles.charAt(numPosicion)+"","");

            }
            for (int i = 0; i < s.length(); i++) {
                String charActual=cadPosiciones.substring(i, i+1);
                posicion=Integer.parseInt(charActual);
                t+=s.charAt(posicion)+"";
            }
            String letraExtra=alfabeto.charAt(ThreadLocalRandom.current().nextInt(alfabeto.length()))+"";
            StringBuilder sb=new StringBuilder(t);
            numPosicion=ThreadLocalRandom.current().nextInt(1,s.length());
            sb=sb.insert(numPosicion,letraExtra);

            //TODO comparar las cadenas
            
            return sb.toString();
        }


        return "ERROR";
    }
}
